public class Grades {           //utworzenie klasy Grades
    private int[] grades;       //dodanie atrybutu klasy - tablicy grades
    private int size;           //dodanie do klasy atrybutu "size" - nowa zmienna do monitorowania ile jest elementow w tablicy.

    public Grades() {           //utworzenie konstruktora grades
        this.grades = new int[10];  //ustanowienie ze tablica grades ma 10 elementów?
        this.size = 0;          // zadeklarowanie ze zmienna size = 0
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


    public int avarage() { //utworzenie metody avarage
        if (grades.length == 0) {
            return 0;
        }
        else {
            int result = 0;
            for (int i = 0; i < grades.length; i++) {
                result = result + grades[i];    //utworzenie petli for zeby sumowac elementy tablicy
            }
            return result / grades.length;  //zwrot średniej
        }
    }
}
//cześć Paweł, mam prosbe.
//w komentarzach opisalem jak interpretuje ten caly kod
//moglbys rzucic okiem i wytknac mi gdzie sie myle?
//jeszcze nie czuje sie swobodnie w tym wszytkim i od tego kombinowania mam juz w glowie metlik
// i  nie wiem juz co jest faktem a co moim wymysłem
//pozdrawiam
