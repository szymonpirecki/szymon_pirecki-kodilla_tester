public class Grades {           //utworzenie klasy Grades
    private int[] grades;       //utworzenie tablicy czy przypisanie jej do klasy?
    private int size;           //size - nowa zmienna do monitorowania ile jest elementow w tablicy. przypisanie nowej zmiennej do klasy
    private int value;          //przypisanie zmiennej value do klasy

    public Grades() {           //utworzenie obiektu Grades, ktory ponizej okreslamy ze jest tablica
        this.grades = new int[10];  //"przypisanie nowej wartosci do zmiennej przechowujacej oceny" - czyli ustanowienie ze grades jest tablica i ma 10 elementów?
        this.size = 0;          // zadeklarowanie ze zmienna size = 0
        this.value = value;     //przypisanie argumentu do zmiennej
    }

    public void add(int value) {  //utworzenie metody add zeby dodawac oceny do tablicy. (int value) - metoda przyjmuje parametr value
        if (this.size == 10) {  //warunek, ze metoda dziala dopoki tablica nie osiagnie rozmiar 10 elementow
            return;
        }
        this.grades[this.size] = value; //instrukcja, zeby dopoki warunek if jest spelniany lokowac nowe oceny(value) na nowych miejscach w tablicy
        this.size++;
    }

    public int lastGrade() {    //utworzenie metody lastGrade
        if (this.value > 0) { //warunek, ze metoda dziala jesli ocena jest wieksza od zera, chcialem to zrobic od strony indeksow ale one sa numerowane od 0
            int lastPlace = grades.length - 1; //okreslenie ostatniego indeksu - nie wiedzialem jak uzyc do tego zmiennej "size"
            int theLastGrade = grades[lastPlace]; // zadeklarowanie zmiennej theLastGrade, ze sie rowna ostatniej ocenie
            return theLastGrade;    //zwrocenie ostatniej oceny - nie wiem czemu pojawia sie problem "missing return statement"
        }
    }


    public int avarage() { //utworzenie metody avarage
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];    //utworzenie petli for zeby sumowac elementy tablicy
        }
        return result / grades.length;  //zwrot średniej
    }
}
//cześć Paweł, mam prosbe.
//w komentarzach opisalem jak interpretuje ten caly kod
//moglbys rzucic okiem i wytknac mi gdzie sie myle?
//jeszcze nie czuje sie swobodnie w tym wszytkim i od tego kombinowania mam juz w glowie metlik
// i  nie wiem juz co jest faktem a co moim wymysłem
//pozdrawiam
