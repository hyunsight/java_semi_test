package java_01;

public class Quiz7 {
    //7. 아래 주어진 배열에서 최솟값을 구하는 코드를 작성하세요. int[] arrays = {90, 87, 50, 65, 20}
    public static void main(String[] args) {
        int[] arrays = {90, 87, 50, 65, 20};

        int min = arrays[0];
        for (int array : arrays) {
            if (min > array) {
                min = array;
            }
        }
        System.out.println("배열 최소값: " + min);
    }
}
