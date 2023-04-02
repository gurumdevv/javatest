package interfaceex;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();

        X xclass = mClass; //상위 인터페이스 X형으로 대입하면 X에서 선언한 메서드만 호출 가능
        xclass.x();

        Y yClass = mClass; //상위 인터페이스 Y형으로 대입하면 Y에서 선언한 메서드만 호출 가능
        yClass.y();

        MyInterface iClass = mClass; //구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메소드 호출 가능
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
