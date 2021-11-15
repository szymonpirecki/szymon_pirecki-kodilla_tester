public class User {
    String name;
    int age;
    User users[];


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.users = new User[8];
    }

    public int average() {

        int result = 0;
        for (int i = 0; i < users.length; i++){
            result = result + users[i].age;
        }
        int theAverage = result / users.length;
        return theAverage;
    }

    public String showWhoIsBelowAverageAge() {
        int theAverage = this.average();                   //zadeklarowanie zmiennej theAverage w tym bloku//o to chodzilo?
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < theAverage) {
                return users[i].name;
                System.out.println(users[i].name);
            } else {
                return String.valueOf(0);           //tutaj sugestia inelliJ jak wyrazic 0 w stringu
            }
        }
    }                                           //wyswietla mi sie blad "missing return statement" mimo ze dalem return dla if i dla else





        public static void main(String[] args){

        User Kamil = new User("Kamil", 16);
        User Zbyszek = new User("Zbyszek", 24);
        User Adam = new User("Adam", 39);
        User Tomasz = new User("Tomasz", 8);
        User Olaf = new User("Olaf", 88);
        User Gracjan = new User("Gracjan", 18);
        User Krzysztof = new User("Krzysztof", 54);
        User Przemek = new User("Przemek", 33);

        User users[] = {Kamil, Zbyszek, Adam, Tomasz, Olaf, Gracjan, Krzysztof, Przemek};



        users.average()          //nie moge wywolac zadnej metody, ani average ani showWhoIsBelow
        }



}
