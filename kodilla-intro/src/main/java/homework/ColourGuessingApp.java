package homework;

public class ColourGuessingApp {
    public static void main(String[] args) throws UnknownColourException {

        ColourGuessing guessing = new ColourGuessing();
        String colour = guessing.colorSearching();
        System.out.println("Your colour is: " + colour);
    }
}
