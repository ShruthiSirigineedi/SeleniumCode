package InterviewPreparation.InterviewPreparation;

public class ArrayConcepts {
	
	int model;
	int wheels;
	static String name="abc";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		
		
		
		/*String s[][]= new String[3][5];
		System.out.println(a.length);
		System.out.println(s.length);
		System.out.println(s[1].length);
		
		s[0][0]="Singamsetty Family";
		s[0][1]="Shruthi";
		s[0][2]="Rajesh";
		s[0][3]="Nayanika";
		s[0][4]="Ashwath";
		
		s[1][0]="Sirigineedi Main Family";
		s[1][1]="Sesha Ratnam";
		s[1][2]="SatyaNarayana";
		s[1][3]="Sri Harsha";
		s[1][4]="Shruthi";
		
		s[2][0]="Sirigineedi Second Family";
		s[2][1]="Sri Harsha";
		s[2][2]="Prasanna";
		s[2][3]="Nihira";
		s[2][4]="yet to come";
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
			}
		}*/
		
		ArrayConcepts ac= new ArrayConcepts();
		ArrayConcepts ac2= new ArrayConcepts();
		ArrayConcepts ac3= new ArrayConcepts();
		
		ac.testing();
		System.out.println(ac.name);
		
		
		int k=ac.division(5, 1);
		System.out.println(k);
		ac.model=2012;
		ac.wheels=4;
		
		ac2.model=2013;
		ac2.wheels=5;
		
		ac2.model=2014;
		
		System.out.println(ac2.model);
		System.out.println(ac.model);
	}
		
		public void testing() {
			System.out.println("I am a test method");}
			
			public int sum(int i) {
				int a=10;
				int b=120;
				int c=a+b;
				return c;
			}
			
			public static int sum1(int i) {
				int a=10;
				int b=120;
				int c=a+b;
				return c;
			}
			public int division(int a, int b) {
				int c=a/b;
				return c;
			}
			

			
		

	

}

