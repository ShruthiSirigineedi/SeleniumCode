package InterviewPreparation.InterviewPreparation;

public class B extends  A {
	
	public B() {
		super(10,20);
		System.out.println("Child class default Constructor!");
	}
	public B(int i) {
		
		System.out.println("Child class One param Constructor!");
	}
	public B(int i,int j) {
		super(20);
		System.out.println("Child class two param Constructors!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B();
		B obj1=new B(10);
		B obj2=new B(10,20);

	}

}
