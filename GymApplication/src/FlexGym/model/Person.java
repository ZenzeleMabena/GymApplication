package FlexGym.model;

public abstract class Person {
	
	
	protected String firstName;
	protected String lastName;
	protected char gender;
	protected String ID;
	
	
	
	
	public Person(String firstName,String lastName,char gender,String ID)
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.ID = ID;
	
		
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}



	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}



	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	
	
	

	

}
