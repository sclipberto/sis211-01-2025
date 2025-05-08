public class Programa18 {
    public static void main(String[] args) {
        A obj = new A();
        obj.a = 5;
        System.out.println(obj.a);
        B objb = new B();
        objb.a = 10;
        System.out.println(objb.a);
    }
}

class A {
    int a;
}

class B extends A {

}
