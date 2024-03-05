package java_01;

public class Quiz4 {
    //4. 이중 for문을 이용해 구구단을 아래와 같이 2단부터 9단까지 찍는 프로그램을 완성하시오.
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}

