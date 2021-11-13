public class User {
    String name;
    int age;
    User users[];


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.users = new User[8];
    }

    public void average() {

        int result = 0;
        for (int i = 0; i < users.length; i++){
            result = result + users[i].age;
        }
        int theAverage = result / users.length;
    }

    public void showWhoIsBelowAverageAge() {

        for (int i = 0; i < users.length; i++){
            if(this.age < int theAverage){         //dlaczego tutaj warunek if nie chce mi przejsc?
                System.out.println(this.name);
            }
        }
    }



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




        }



}
