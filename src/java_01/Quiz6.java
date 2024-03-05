package java_01;

public class Quiz6 {
    //6. 아래 주어진 배열의 총합과 평균(소수점 자리 출력)을 출력하는 코드를 작성하세요. int[] scores = {83, 90, 87};
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("배열의 총합: " + sum);
        System.out.println("배열의 평균: " + average);
    }
}
