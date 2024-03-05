package java_01.Quiz8;

public class Car {
    //필드
    String company;
    String model;
    double maxSpeed;
    Tire tire;

    //생성자
    public Car (String company, String model, double maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
