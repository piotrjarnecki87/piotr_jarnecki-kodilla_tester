public  class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public lastGrades(int value) {
        if (this.size == 10) {
            return grades[10];
        }
    }

    public avgGrades() {
        int result = 0;
        for (int i = 0; i < this.grades.length; i++) {
            result = result + grades.length[i];
            int sum = result / this.grades.length;
            return sum;
        }

    }
}