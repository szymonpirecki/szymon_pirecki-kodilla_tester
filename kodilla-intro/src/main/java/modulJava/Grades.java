package modulJava;

public class Grades {           //utworzenie klasy modulJava.Grades
    private int[] grades = new int[10];       //dodanie atrybutu klasy - tablicy grades
    private int size = 0;           //dodanie do klasy atrybutu "size" - nowa zmienna do monitorowania ile jest elementow w tablicy.

    public Grades() {           //kontruktor tworzymy po to zeby umozliwic tworzenie obiektu w zadany sposob
                        //bedziemy tworzyc obiekt typu modulJava.Grades ale bez argumentow
    }

    public void add(int value) {  //utworzenie metody add zeby dodawac oceny do tablicy. (int value) - metoda przyjmuje parametr value
        if (this.size == 10) {  //warunek, ze metoda dziala dopoki tablica nie osiagnie rozmiar 10 elementow
            return;
        }
        this.grades[this.size] = value; //instrukcja, zeby dopoki warunek if jest spelniany lokowac nowe oceny(value) na nowych miejscach w tablicy
        this.size++;    //instrukcja, zeby zwiekszac wartosc size z kazdym nastepnym dodaniem oceny
    }

    public int lastGrade() {                           //utworzenie metody lastGrade
        if (grades.length == 0) {
        return 0;
        }
        else {
            int lastPlace = grades.length - 1;          //okreslenie ostatniego indeksu
            return grades[lastPlace];                         //zwrocenie ostatniej oceny - nie wiem czemu pojawia sie problem "missing return statement"
        }
    }
    //typ zmiennej nazwa obiektu =  new nazwa klasy


    public int avarage() { //utworzenie metody avarage
        if (grades.length == 0) {
            return 0;
        }
        else {
            int result = 0;
            for (int i = 0; i < grades.length; i++) {
                result = result + grades[i];    //utworzenie petli for zeby sumowac elementy tablicy
            }
            int srednia = result / grades.length;
            return srednia;  //zwrot średniej
        }
    }



    public static void main(String[] args){
        Grades jan = new Grades();

        jan.add(5);
        jan.add(4);
        jan.add(3);


        int result = jan.avarage();
        System.out.println(result);
    }
}
