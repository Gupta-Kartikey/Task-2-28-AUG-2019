
public class SbiCard implements AtmCard {

	@Override
	public void withdrawl() {
		System.out.println("WIthdrawl from SBI card done ");	
	}

	@Override
	public void balance() {
		System.out.println("Balance in SBI Account ");
	}
 
}
