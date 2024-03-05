package java_02.Quiz2;

public class Student {
    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    public int getTotal() {
        int total = kor + eng + math;
        return total;
    }

    public double getAverage() {
        double average = (double) getTotal() / 3;
        return average;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 반: " + ban + ", 번호: " + no;
    }
}
