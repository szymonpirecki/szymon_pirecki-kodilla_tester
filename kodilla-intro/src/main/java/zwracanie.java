public class zwracanie {
    public static void main(String[] args){

        String example = sayHello();
        System.out.println(example);

        int result = sum(1, 45);
        System.out.println(result);

    }
    public static String sayHello(){
        return "hello hello";
    }
    public static int sum(int a, int b){
        return a + b;
    }

}
