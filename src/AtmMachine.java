
public class AtmMachine {

	AtmCard atmCard;
	public void getCard(AtmCard atmCard)
	{
		this.atmCard=atmCard;
	}
	public void withdrawl()
	{
		if(atmCard!=null)
		{
			atmCard.withdrawl();
		}else{
			System.out.println("Enter Card");
		}
	}
	public void balance()
	{
		if(atmCard!=null)
		{
			atmCard.balance();
		}
		else{
			System.out.println("Enter Card");
		}
	}
	public static void main(String[] args) {
		
		AtmMachine atmMachine = new AtmMachine();
		atmMachine.getCard(new SbiCard());
		//atmMachine.getCard(new HdfcCard());
		atmMachine.withdrawl();
		atmMachine.balance();
		
		
	}

}
