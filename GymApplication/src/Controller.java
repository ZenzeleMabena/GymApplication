import java.io.File;
import java.util.ArrayList;

import FlexGym.dataStorage.FileStorage;
import FlexGym.model.Gym;
import FlexGym.model.GymMember;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
	
	
	
	
	private Gym gym;

    @FXML
    public TextField tf_QueryMemberMID;

    @FXML
    public TextField tf_QueryMemberNID;

    @FXML
    public TextField tf_QueriedMembershipID;
    
    @FXML
    public Text txt_memberNotFound;

    @FXML
    public TextField tf_QueriedMemberName;

    @FXML
    public TextField tf_QueriedMemberSurname;

    @FXML
    public TextField tf_QueriedMemberBalance;

    @FXML
    public TextField tf_QueriedMemberMonthlyFee;
    
    @FXML
    public TextField tf_StartDate;

    @FXML
    public TextField tf_QueriedMemberEmailAddress;

    @FXML
    public TextField tf_FirstName;
    
    
    @FXML
    public Button btn_Query;

    @FXML
    public TextField tf_LastName;

    @FXML
    public TextField tf_Gender;

    @FXML
    public TextField tf_ID;

    @FXML
    public Button Btn_Create;

    @FXML
    public TextField tf_phoneNumber;

    @FXML
    public TextField tf_emailAddress;

    @FXML
    public RadioButton btn_3monthsContract;

    @FXML
    public RadioButton btn_12monthsContract;

    @FXML
    public RadioButton btn_24monthsContract;

    @FXML
    public TextField tf_payerMembershipID;

    @FXML
    public TextField tf_amountPaid;

    @FXML
    public Button btn_pay;

    @FXML
    public TextField tf_MembershipIDOfPersonRemoved;

    @FXML
    public TextField tf_IdentificationNumberOfPersonRemoved;

    @FXML
    public Button btn_EndMembership;
    
    public Controller()
    {
    	
    	ArrayList<GymMember> members = FileStorage.readMembers(new File("C:\\Users\\User\\Documents\\School Content\\Second year\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"));
    	
    	this.gym = new Gym(members);
    	
    	 this.tf_QueryMemberMID = new TextField();

    	    
    	    this.tf_QueryMemberNID = new TextField();

    	    
    	    this.tf_QueriedMembershipID = new TextField();

    	    
    	    this.tf_QueriedMemberName = new TextField();

    	    
    	    this.tf_QueriedMemberSurname = new TextField();

    	    
    	   this.tf_QueriedMemberBalance = new TextField();

    	    
    	    this.tf_QueriedMemberMonthlyFee = new TextField();
    	    
    	    
    	    this.tf_StartDate = new TextField();

    	    
    	   this.tf_QueriedMemberEmailAddress = new TextField();


    	    
    	     this.tf_FirstName = new TextField();
    	     
    	     this.txt_memberNotFound = new Text();


    	    
    	  this.tf_LastName = new TextField();


    	    
    	     this.tf_Gender = new TextField();


    	    
    	   this.tf_ID = new TextField();


    	    
    	  this.Btn_Create = new Button();

    	    
    	    this.tf_phoneNumber = new TextField();


    	   this.tf_emailAddress = new TextField();


    	    
    	    this.btn_3monthsContract = new RadioButton();
    	    
    	    
    	   this.btn_12monthsContract = new RadioButton();

    	    
    	     this.btn_24monthsContract = new RadioButton();

    	    
    	   this.tf_payerMembershipID = new TextField();


    	    
    	     this.tf_amountPaid = new TextField();


    	    
    	    this.btn_pay = new Button();

    	    
    	    this.tf_MembershipIDOfPersonRemoved = new TextField();


    	    
    	     this.tf_IdentificationNumberOfPersonRemoved = new TextField();


    	    
    	    this.btn_EndMembership = new Button();

    	    
    	
    }
    
    
    

    @FXML
    void on12MonthsSelected(ActionEvent event) {
    	
    	this.btn_12monthsContract.setSelected(true);
    	this.btn_24monthsContract.setSelected(false);
    	this.btn_3monthsContract.setSelected(false);

    }

    @FXML
    void on24MonthsSelected(ActionEvent event) {
    	
    	this.btn_24monthsContract.setSelected(true);
    	this.btn_12monthsContract.setSelected(false);
    	this.btn_3monthsContract.setSelected(false);

    }

    @FXML
    void on3MonthsSelected(ActionEvent event) {
    	
    	
    	this.btn_3monthsContract.setSelected(true);
    	this.btn_12monthsContract.setSelected(false);
    	this.btn_24monthsContract.setSelected(false);

    }

    @FXML
    void onCreateClick(ActionEvent event) {
    	////create a gym member and put it inside the arraylist
    	String firstName = this.tf_FirstName.getText();
    	String LastName = this.tf_LastName.getText();
    	char gender = (char) this.tf_Gender.getText().charAt(0);
    	String ID = this.tf_ID.getText();
    	String startDate = this.tf_StartDate.getText();
    	String emailAddress = this.tf_emailAddress.getText();
    	String phoneNumber = this.tf_phoneNumber.getText();
    	
    	
    	if(this.btn_3monthsContract.isSelected())
    	{
    		System.out.println("Creating and adding new member with 3 months contract");
    		this.gym.addNewMember(firstName, LastName, gender, ID, startDate, emailAddress, phoneNumber, 300.00);
    		FileStorage.appendMember(new File("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"), gym.getMemberUsingID(ID));
    	}
    	
    	if(this.btn_12monthsContract.isSelected())
    	{
    		
    		System.out.println("Creating and adding new member with 12 months contract");
    		this.gym.addNewMember(firstName, LastName, gender, ID, startDate, emailAddress, phoneNumber, 250.00);
    		FileStorage.appendMember(new File("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"), gym.getMemberUsingID(ID));
    	}
    	
    	if(this.btn_24monthsContract.isSelected())
    	{
    		System.out.println("Creating and adding new member with 24 months contract");
    		this.gym.addNewMember(firstName, LastName, gender, ID, startDate, emailAddress, phoneNumber, 225.00);
    		FileStorage.appendMember(new File("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"), gym.getMemberUsingID(ID));
    	}
    	
    	
    	//System.out.println("I think the method is working broo");
    	
    	this.tf_FirstName.setText("");
    	this.tf_LastName.setText("");
    	this.tf_Gender.setText("");
    	this.tf_ID.setText("");
        this.tf_StartDate.setText("");
    	this.tf_emailAddress.setText("");
        this.tf_phoneNumber.setText("");
        this.btn_3monthsContract.setSelected(false);
        this.btn_12monthsContract.setSelected(false);
        this.btn_24monthsContract.setSelected(false);
    	
    
	

    }

    @FXML
    void onEndMembershipClick(ActionEvent event) {
    	
    	////Here I'm testing whether the textfield where the information is supposed to be entered has actual 
    	////useful text in it
    	if((!this.tf_IdentificationNumberOfPersonRemoved.getText().equals("")) &&  ///if the nationalID textfield is not empty and
    			this.tf_MembershipIDOfPersonRemoved.getText().equals(""))	///the membershipID is empty then
    	{
    		System.out.println("Removing gym member using National Id");
    	///delete the gym member using their nationalID
    		this.gym.removeMemberUsingID(this.tf_IdentificationNumberOfPersonRemoved.getText());
    		
  
    	}
    	
    	
    	////this if statement is a vice versa of the one right above ^
    	if((!this.tf_MembershipIDOfPersonRemoved.getText().equals("")) && (this.tf_IdentificationNumberOfPersonRemoved.getText().equals("")))
    	{
    		
    		System.out.println("Removing gym member using membership ID");
    		
    		////delete the gym member using their nationalID
    		this.gym.removeMemberUsingMembershipID(this.tf_MembershipIDOfPersonRemoved.getText());    		
    		
    	}
    	
    	
    	
    	

    }
    
    
    
    
    
    @FXML
    void OnQueryButtonClick(ActionEvent event) {
    	
    	////just find the member then output the member on to the available relevent text fields
    	////Remember we have to check which of the text fields are actually used to query a member 
    	if(!this.tf_QueryMemberMID.getText().equals("") && this.tf_QueryMemberNID.getText().equals(""))
    	{
    		System.out.println("Querying member using membershipID");
    		
    		
    		GymMember queriedMember = this.gym.getMemberUsingMembershipID(this.tf_QueryMemberMID.getText());
    		if(queriedMember == null)
    		{
    			this.txt_memberNotFound.setText("Member not found Or member is not registered");
    		}
    		if(queriedMember != null)
    		{
    		this.tf_QueriedMembershipID.setText(queriedMember.getMemberShipID());
    		this.tf_QueriedMemberName.setText(queriedMember.getFirstName());
    		this.tf_QueriedMemberSurname.setText(queriedMember.getLastName());
    		this.tf_QueriedMemberBalance.setText(Double.toString(queriedMember.getBalance()));
    		this.tf_QueriedMemberMonthlyFee.setText(Double.toString(queriedMember.getMonthlyFee()));
    		this.tf_QueriedMemberEmailAddress.setText(queriedMember.getEmailAddress());
    		}
    	}
    	
    	if(!this.tf_QueryMemberNID.getText().equals("") && this.tf_QueryMemberMID.getText().equals(""))
    	{
    		
    		
    		System.out.println("Querying member using national ID");
    		GymMember queriedMember = this.gym.getMemberUsingID(this.tf_QueryMemberNID.getText());
    		
    		if(queriedMember == null)
    		{
    			this.txt_memberNotFound.setText("Member not found Or member is not registered");
    		}
    		if(queriedMember != null)
    		{
    		this.tf_QueriedMembershipID.setText(queriedMember.getMemberShipID());
    		this.tf_QueriedMemberName.setText(queriedMember.getFirstName());
    		this.tf_QueriedMemberSurname.setText(queriedMember.getLastName());
    		this.tf_QueriedMemberBalance.setText(Double.toString(queriedMember.getBalance()));
    		this.tf_QueriedMemberMonthlyFee.setText(Double.toString(queriedMember.getMonthlyFee()));
    		this.tf_QueriedMemberEmailAddress.setText(queriedMember.getEmailAddress());
    		}
    		
    		
    		
    	}
    	
    	
    	
    	
    	

    }

    @FXML
    void onPayClick(ActionEvent event) {
    	
    	////I want to find the member to which the provided membership ID belongs 
    	///then I want to change the balance of the paying member 
    	GymMember payingMember = this.gym.getMemberUsingMembershipID(this.tf_payerMembershipID.getText());
    	
    	
    	double amountPaid = Double.valueOf(this.tf_amountPaid.getText());
    	
    	if(payingMember != null) {
    		payingMember.payMembership(amountPaid);
    		System.out.println("Mr/Mrs "+ payingMember.getLastName() + "has just payed " + amountPaid);
    	}
    	
    	
    	System.out.println("Oopsie we couldnt manage to pay the membership");
    	
    	


    }

}

