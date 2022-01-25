package homework;

public class ColourGuessingApp {
    public static void main(String[] args) throws UnknownColourException {

        ColourGuessing guessing = new ColourGuessing();
        String colour = guessing.colourGuessing();
        System.out.println("Your colour is: " + colour);
    }
}
