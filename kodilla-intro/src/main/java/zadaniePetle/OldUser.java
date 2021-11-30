package zadaniePetle;

public class OldUser {
    String name;
    int age;
    OldUser[] oldUsers;


    public OldUser(String name, int age) {
        this.name = name;
        this.age = age;
       // this.users = new User[8];
    }

    public int average() {

        int result = 0;
        for (int i = 0; i < oldUsers.length; i++){
            result += oldUsers[i].age;
        }
        int theAverage = result / oldUsers.length;
        return theAverage;
    }

     public void showWhoIsBelowAverageAge() {
        int theAverage = this.average();
        for (int i = 0; i < oldUsers.length; i++) {
            if (oldUsers[i].age < theAverage) {
                System.out.println(oldUsers[i].name);
            }
        }
    }



        public static void main(String[] args){

            OldUser Kamil = new OldUser("Kamil", 16);
            OldUser Zbyszek = new OldUser("Zbyszek", 24);
            OldUser Adam = new OldUser("Adam", 39);
            OldUser Tomasz = new OldUser("Tomasz", 8);
            OldUser Olaf = new OldUser("Olaf", 88);
            OldUser Gracjan = new OldUser("Gracjan", 18);
            OldUser Krzysztof = new OldUser("Krzysztof", 54);
            OldUser Przemek = new OldUser("Przemek", 33);

            OldUser oldUsers[] = {Kamil, Zbyszek, Adam, Tomasz, Olaf, Gracjan, Krzysztof, Przemek};





}
}
