public 
interface A {
    int CONSTANT_A = 10;

    void methodA(); 
}


interface A1 extends A {
    int CONSTANT_A1 = 20; // Constant

    void methodA1(); // Abstract method
}

// Interface A2 (extends A)
interface A2 extends A {
    int CONSTANT_A2 = 30; // Constant

    void methodA2(); // Abstract method
}

// Interface A12 (inherits from A1 and A2)
interface A12 extends A1, A2 {
    // No additional constants
    // Inherits methodA() from A
    // Inherits methodA1() from A1
    // Inherits methodA2() from A2
}

// Class B implements A12
class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("Method A invoked. Constant A: " + CONSTANT_A);
    }

    @Override
    public void methodA1() {
        System.out.println("Method A1 invoked. Constant A1: " + CONSTANT_A1);
    }

    @Override
    public void methodA2() {
        System.out.println("Method A2 invoked. Constant A2: " + CONSTANT_A2);
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        B bInstance = new B();

        // Invoke methods
        bInstance.methodA();
        bInstance.methodA1();
        bInstance.methodA2();
    }
}
 {
    
}
