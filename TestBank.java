package InterviewPreparation.InterviewPreparation;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.eduloan();
		hs.transferMoney();
		
		USBank us=new HSBCBank();
		us.credit();
		us.debit();
		

	}

}
