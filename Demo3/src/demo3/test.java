package demo3;

public class test {
	class A{
		public void show(){
			System.out.println("A����ڲ�����");
		}
	}
	
	public void B(){
		class c{
			
		}
		
		/*public void c(){
			
		}*/
		//�����Է����ﶨ�巽��
	}
	
	
	public static void main(String[] args) {
		test.A a= new test().new A();
		a.show();
	    
	}

}


/**
 * ����������Զ����࣬�����Զ��巽��(���Ե��÷���)
 */

/*public static void main(String args[]) {
    class A {
        public void show() {
            System.out.println("����һ���ڲ���Ա��Ա����");
        }
    }
    new A().show();

}*/