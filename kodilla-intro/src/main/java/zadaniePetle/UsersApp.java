package zadaniePetle;

public class UsersApp {

    public static void main(String[] args) {

        User[] users = new User[5];

        users[0] = new User("Pat", 19);
        users[1] = new User("Tom", 29);
        users[2] = new User("Tim", 13);
        users[3] = new User("Lee", 43);
        users[4] = new User("Alex", 15);

        AgeCalculation ageCalculation = new AgeCalculation();
        ageCalculation.whoIsBelowAverage(users);
    }

}

