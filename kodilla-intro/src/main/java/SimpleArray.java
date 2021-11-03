public class SimpleArray {
    public static void main(String[] args) {
        String[] namesForPuppy = new String[5];

        namesForPuppy[0] = "Renatka";
        namesForPuppy[1] = "Hyzio";
        namesForPuppy[2] = "Dzyio";
        namesForPuppy[3] = "Zyzio";
        namesForPuppy[4] = "Gruby";

        String imie = namesForPuppy[3];
        System.out.println(imie);

        int numberOfElements = namesForPuppy.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " imion dla zwierzaczków");
        System.out.println("Najladniejsze imie dla suczki to " + namesForPuppy[0]);
        System.out.println("Jesli bede miec buldoga, to nazwe go " + namesForPuppy[4]);
        System.out.println("Jak bede miec trzy jamniki, to nazwe je:");
        for(int i = 1; i <=3; i++){
            System.out.println("-" + namesForPuppy[i]);
        }
    }
}
