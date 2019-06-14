package demo3;

public class Outer2 {
    private int outer = 1;
 
    public void showOut() {
 
        class Inner {
            public void show() {
                System.out.println("outer =" + outer);
            }
        }
        new Inner().show();
    }
 
    public static void main(String[] args) {
        Outer2 in = new Outer2();
        in.showOut();
 
    }
}