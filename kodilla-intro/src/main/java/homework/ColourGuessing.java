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
            case "o":
                colours = ColoursRepository.getColoursStartingWithO();
                break;
            default:
                throw new UnknownColourException();
        }

        return colours;
    }

    private Object colorSearching() throws UnknownColourException {
        ColourGuessing guessing = new ColourGuessing();
        String[] arrayToCheck = guessing.getArrayWithColours();
        String usersColour;
        if (arrayToCheck.length == 1) {
            usersColour = arrayToCheck[0];
        } else {
            String secondLetterFromUser = UserDialogs.getSecondLetter();
            List<String> coloursWithSameFirst2Letters = new ArrayList<>();
            List<String> coloursWithSameFirst3Letters = new ArrayList<>();

            for (String colour : arrayToCheck) {
                char secondLetter = colour.charAt(1);
                String secondLetterAsString = Character.toString(secondLetter);

                if (secondLetterAsString == secondLetterFromUser) {
                    coloursWithSameFirst2Letters.add(colour);
                }

                if (coloursWithSameFirst2Letters.size() == 1) {
                    usersColour = coloursWithSameFirst2Letters.get(0);

                } else {
                    String thirdLetterFromUser = UserDialogs.getThirdLetter();
                    char thirdLetter = colour.charAt(2);
                    String thirdLetterAsString = Character.toString(thirdLetter);
                    if (thirdLetterAsString == thirdLetterFromUser) {
                        coloursWithSameFirst3Letters.add(colour);
                    }
                    if (coloursWithSameFirst3Letters.size() == 1) {
                        usersColour = coloursWithSameFirst3Letters.get(0);
                    }

                }
            }
        }
        return usersColour;
    }


}
