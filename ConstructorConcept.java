package InterviewPreparation.InterviewPreparation;

public class ConstructorConcept {
	
	String name="Shruthi";
	int age=20;
	
	public  ConstructorConcept(){
		System.out.println("Default Constructor");
	}
	public  ConstructorConcept(int i){
		System.out.println("One Param Constructor");
	}
	
	public  ConstructorConcept(String name, int age){
		System.out.println("Two Param Constructor");
		System.out.println("Before this"+name+" "+age);
		
		
		System.out.println("after this"+this.name+" "+this.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept cc= new ConstructorConcept();
		ConstructorConcept cc1= new ConstructorConcept(10);
		ConstructorConcept cc2= new ConstructorConcept("Raj",25);

	}

}
