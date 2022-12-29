package InterviewPreparation.InterviewPreparation;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		ar.add(300);
		ar.add(200);
		ar.add("TOM");
		ar.add("Shruthi");
		ar.add("nayana");
		ar.add("Ashu");
		ar.add("raja");
		System.out.println(ar.size());
		System.out.println(ar.get(6));
		
		System.out.println(0.1+0.2);
		System.out.println(9/0.0);

		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Hashtable hr= new Hashtable();
		hr.put("a", "Rom");
		hr.put(1, 200);
		hr.put("Tom", "Rom");
		hr.put(2,500);
		hr.put(0, 0);
		System.out.println(hr.size());
		for(int i=0;i<hr.size();i++) {
			System.out.println(hr.keySet());
		}
		
	}

}
