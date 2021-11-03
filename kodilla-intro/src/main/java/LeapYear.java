public class LeapYear {
    public static void main(String[] args) {
        int year = 2016;
        System.out.println(year);
if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    System.out.println("Uprzejmie informuje, ze rok " + year + " jest rokiem przestępnym");
        }
else{
    System.out.println("Uprzejmie informuje, ze rok " + year + " nie jest rokiem przestępnym");
        }
    }
}

