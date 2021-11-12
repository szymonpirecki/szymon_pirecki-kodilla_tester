public class Grades {
    private int[] grades;
    private int size;

            public Grades() {
                this.grades = new int[10];
                this.size = 0;
            }

        public void add(int value){
        if(this.size == 10){
        return;
        }
        this.grades[this.size] = value;
        this.size++;
        }

    public int lastGrade(int[] grades){
                int lastPlace = grades.length - 1;
                int theLastGrade = grades[lastPlace];
                return theLastGrade;

    }
    public int avarage(int[] grades){
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];}
        return result/(grades.length - 1);
    }
}
