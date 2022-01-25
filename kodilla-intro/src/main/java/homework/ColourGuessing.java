package homework;

import java.util.ArrayList;
import java.util.List;

public class ColourGuessing {


    private String[] getArrayWithColours() throws UnknownColourException {
        String firstLetter = UserDialogs.getFirstLetter();
        String[] colours;
        switch (firstLetter) {
            case "b":
                colours = ColoursRepository.getColoursStartingWithB();
                break;
            case "r":
                colours = ColoursRepository.getColoursStartingWithR();
                break;
            case "y":
                colours = ColoursRepository.getColoursStartingWithY();
                break;
            case "g":
                colours = ColoursRepository.getColoursStartingWithG();
                break;
            case "p":
                colours = ColoursRepository.getColoursStartingWithP();
                break;
            case "a":
                colours = ColoursRepository.getColoursStartingWithA();
                break;
            case "o":
                colours = ColoursRepository.getColoursStartingWithO();
                break;
            default:
                throw new UnknownColourException();
        }

        return colours;
    }

    public String colorSearching() throws UnknownColourException {
        ColourGuessing guessing = new ColourGuessing();
        String[] arrayToCheck = guessing.getArrayWithColours();
        String usersColour = "colour";

        if (arrayToCheck.length == 1) {
            usersColour = arrayToCheck[0];

        } else {
            List<String> coloursWithSameFirstLetter = new ArrayList<>();
            String secondLetterFromUser = UserDialogs.getSecondLetter();

            for (String colour : arrayToCheck) {
                char secondLetter = colour.charAt(1);
                String secondLetterAsString = Character.toString(secondLetter);

                if (secondLetterAsString.equals(secondLetterFromUser)) {
                    coloursWithSameFirstLetter.add(colour);
                }
            }
            if (coloursWithSameFirstLetter.size() == 1) {
                usersColour = coloursWithSameFirstLetter.get(0);
            }

            if (coloursWithSameFirstLetter.size() > 1) {

                List<String> coloursWithSameFirst2Letters = new ArrayList<>();
                String thirdLetterFromUser = UserDialogs.getThirdLetter();

                for (String colour : coloursWithSameFirstLetter) {
                    char thirdLetter = colour.charAt(2);
                    String thirdLetterAsString = Character.toString(thirdLetter);

                    if (thirdLetterAsString.equals(thirdLetterFromUser)) {
                        coloursWithSameFirst2Letters.add(colour);
                    }
                }
                if (coloursWithSameFirst2Letters.size() == 1) {
                    usersColour = coloursWithSameFirst2Letters.get(0);

                } else {
                    throw new UnknownColourException();
                }
            }
        }
        return usersColour;
    }
}
