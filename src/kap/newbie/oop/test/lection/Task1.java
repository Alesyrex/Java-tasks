package kap.newbie.oop.test.lection;



/**
 * @author Alexandr Korovkin
 */
public class Task1 {

//    private int x
//    int x           <-- package (default)
//    protected int x  <-- package + extends
//    public int x

    // non static
    int x; // fields
    void m() {} //methods

    Task1(){}   //constructor
    Task1(int x) {}  //constructor

    class A {}  //inner class

    //static
    static int x2;   //static fields
    static void m2() {}  //static methods
    static {}          //static init block
    static class A2 {}  // statis inner class
    interface G {}   //static inner interface
}
// Task1.x2 = 7
// Task1.m2();
