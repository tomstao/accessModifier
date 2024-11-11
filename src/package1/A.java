package package1;
import package2.*;



public class A extends Asub {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.protectedMessage);
    }
}
