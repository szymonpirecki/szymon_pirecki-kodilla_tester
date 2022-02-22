package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {

        DbManager dbManager = DbManager.getInstance();



        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
                "FROM USERS U " +
                "JOIN POSTS P ON U.ID = P.USER_ID " +
                "GROUP BY P.USER_ID " +
                "HAVING POSTS_NUMBER > 1;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        int counter = 0;
        System.out.println("------------");
        System.out.println("Przynajmniej 2 posty opublikował:");
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME"));
            counter++;
        }

        Assertions.assertEquals(1, counter);

        rs.close();
        statement.close();
    }
}