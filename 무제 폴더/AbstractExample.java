package elice.day03;

// 추상 클래스 정의
abstract class Shape {
    // 추상 메서드 정의
    public abstract void draw();

    // 일반 메서드
    public void displayArea() {
        System.out.println("This method is not abstract.");
    }
}

// 추상 클래스를 상속받은 구체적인 클래스
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println(radius);
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // 추상 클래스는 직접 객체를 생성할 수 없음
        // Shape shape = new Shape(); // 에러 발생

        // 추상 클래스를 상속받은 구체적인 클래스의 객체 생성
        Circle circle = new Circle(5.0);

        // 추상 메서드의 구현 호출
        circle.draw();

        // 일반 메서드 호출
        circle.displayArea();

    }
}
