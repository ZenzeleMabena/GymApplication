package FlexGym.model;

public class GymMember extends Person {
	
       private String startDate;
       private String MemberShipID;
       private double balance;
       private double monthlyFee;
       private String emailAddress;
       private String phoneNumber;
       private int timeRemaining;
	
	
	

	public GymMember(String firstName, String lastName, char gender, String ID,String startDate,String emailAddress,
			String phoneNumber,double monthlyFee) 
	{
		super(firstName, lastName, gender, ID);
		// TODO Auto-generated constructor stub
		this.startDate = startDate;
		this.balance = 0;
		this.monthlyFee = monthlyFee;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
		if(monthlyFee == 300)
		{
			this.setTimeRemaining(3);
		}else if(monthlyFee == 250)
		{
			this.setTimeRemaining(12);
			
		}
		else if(monthlyFee == 225)
		{
			this.setTimeRemaining(24);
		}
		
		
		
		createMembershipID();
		
		
		
	}
	
	public GymMember(String firstName, String lastName, char gender, String ID,String startDate,String emailAddress,
			String phoneNumber,double monthlyFee,double balance) 
	{
		super(firstName, lastName, gender, ID);
		// TODO Auto-generated constructor stub
		this.startDate = startDate;
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
		
		
		if(monthlyFee == 300)
		{
			this.setTimeRemaining(3);
		}else if(monthlyFee == 250)
		{
			this.setTimeRemaining(12);
			
		}
		else if(monthlyFee == 225)
		{
			this.setTimeRemaining(24);
		}
		
		
		
		
		createMembershipID();
		
		
		
	}
	
	
	
	public void setPhoneNumber(String number)
	{
		this.phoneNumber = number;
	}
	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	
	public void payMembership(double amountPaid)
	{
		this.balance =  this.balance + amountPaid;
	}
	
	
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	/**
	 * @return the email Address
	 */
	public String getEmailAddress()
	{
		return this.emailAddress;
	}
	
	/**
	 * 
	 * @param emailAddress This is the email address that you want to set for the member in question
	 */
	
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	
	public double getMonthlyFee()
	{
		return this.monthlyFee;
	}
	
	public void setMonthlyFee(double monthlyFee)
	{
		this.monthlyFee = monthlyFee;
	}
	
	
	
	

	/**
	 * @return the memberShipID returns the membership ID of the current instance
	 */
	public String getMemberShipID() {
		return MemberShipID;
	}
	
	
	

	private void createMembershipID()
	{
		StringBuilder MembershipID = new StringBuilder();
		MembershipID.append(startDate);
		MembershipID.append(this.gender);
		MembershipID.append(this.lastName);
		this.MemberShipID = MembershipID.toString();
		
		
		
		
	}

	public int getTimeRemaining() {
		return timeRemaining;
	}

	public void setTimeRemaining(int timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

}
