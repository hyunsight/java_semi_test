package java_02.Quiz5;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

 /*
 parent.field2 = "data2"; //(불가능)
 parent.method3(); //(불가능)
 */
    }
}

/*
정답:
1. 요약
- 실행 결과는 아래와 같은데, 이와 같이 출력되는 주 이유는 다형성 / 오버라이딩에 따라 아래 결과값이 도출되었다.
  Parent-method1()
  Child-method2(

2. 세부
- Parent parent = new Child(); > Parent 타입으로 Child 객체 생성
- parent.field1 = "data1"; > parent.field1값으로 "data1" 대입
- 이 상태에서 parent.method1();를 호출하면 Parent 클래스의 method1() 호출 > System.out.println("Parent-method1()");
- 그 다음으로 parent.method2();를 호출하면, 이 경우, Child 클래스에서 오버라이딩한 method2()가 호출 > System.out.println("Child-method2()");
- 결과적으로 "Parent-method1()" / "Child-method2()" 출력
*/