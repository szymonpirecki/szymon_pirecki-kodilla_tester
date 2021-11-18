package modulJava;

public class Application {
    String name;
    double age;
    double height;

    public Application (String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

        public void check() {
            if (this.name != null) {
                if (this.age > 30 && this.height > 160) {
                    System.out.println("zadaniePetle.User is older than 30 and higher than 160cm");
                } else {
                    System.out.println("zadaniePetle.User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }



   public static void main(String[] args){

       Application person1 = new Application("Adam", 40.5, 178);
       person1.check();




   }
        }




