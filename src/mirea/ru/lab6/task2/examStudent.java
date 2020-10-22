package mirea.ru.lab6.task2;

public class examStudent implements Comparable<examStudent> {
    public int examScore;

    examStudent(int examScore){
        this.examScore = examScore;

    }
    public boolean compare(examStudent p){

        return (examScore > p.examScore);
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }

    public int getExamScore() {
        return examScore;
    }

    @Override
    public int compareTo(examStudent examStudent) {
        return 0;
    }

    public interface Comparator<examStudent> {

        public int compareTo(mirea.ru.lab6.task2.examStudent o);
        // остальные методы
    }
}
