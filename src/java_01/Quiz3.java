package java_01;

public class Quiz3 {
    public static void main(String[] args) {
        // 3. for문을 이용하여 1~20까지의 정수 중 2의 배수 총합을 구하는 코드를 작성하세요.

        int result = 0;
        for ( int n = 1; n <= 20; n++ ) {
            if ( n % 2 == 0 ) {
                result += n;
            }
        }
        System.out.println("결과값: " + result) ;
    }
}
