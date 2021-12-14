package zadaniePetle;

public class AgeCalculation {

    public int averageAge(User[] users){
      int result = 0;
      for(int i = 0; i < users.length; i++){
          result += users[i].getAge();
      }
      return result/users.length;
    }

    public void whoIsBelowAverage(User[] users){
        for(User User : users){
            if(User.getAge() > averageAge(users)){
                System.out.println(User.getName() + " is older than the average age of this group.");
            }
        }
    }

}
