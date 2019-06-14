package demo3;

public class test {
	class A{
		public void show(){
			System.out.println("A类的内部方法");
		}
	}
	
	public void B(){
		class c{
			
		}
		
		/*public void c(){
			
		}*/
		//不可以方法里定义方法
	}
	
	
	public static void main(String[] args) {
		test.A a= new test().new A();
		a.show();
	    
	}

}


/**
 * 方法里面可以定义类，不可以定义方法(可以调用方法)
 */

/*public static void main(String args[]) {
    class A {
        public void show() {
            System.out.println("这是一个内部成员成员函数");
        }
    }
    new A().show();

}*/