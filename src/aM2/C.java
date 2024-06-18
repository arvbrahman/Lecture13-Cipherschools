package src.aM2;
import src.aM1.A;

public class C extends A{
    public static void main(String[] args) {
        A obj = new A();
        C childObj = new C();
        // System.out.println(obj.x); //default is not accessible outside the package
        // System.out.println(childObj.x); //NOT VISIBLE
        // System.out.println(obj.y); //private not accessible outside the class
        // System.out.println(childObj.y); //NOT VISIBLE
        System.out.println(obj.z); // public is accessible everywhere the obj is available
        System.out.println(childObj.w); //protected in different package in subclasses can be visible using object of subclass
    }
}
