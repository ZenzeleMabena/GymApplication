package FlexGym.model;


import java.io.File;
import java.util.ArrayList;

import FlexGym.dataStorage.FileStorage;


/**
 * FLEX GYM(Client Side)
 * @author ZB MABENA
 * This program solely belongs to Beast Corp solutions and any use without written permission will be punished
 * @version 1.0
 * @see Gym,GymEmployee,GymMember
 */

public class Gym {
	
	////this class is instantiated inside the controller class
	//private static final int PORT = 3467;
	
	
	private ArrayList<GymMember> members;
	
	///1)Client socket(TCP)
	
	
	
	
	
	///TODO: ////we are going to have array list employees at a later stage
	
	
	public Gym(ArrayList<GymMember> members)
	{
		this.members = members;
		
		
		
		
		
	}
	
	public Gym()
	{
	     ;
	     
	     /*
	      * We will need to read in the list of people from the server everytime we start the application 
	      */
            this.members = FileStorage.readMembers(new File("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"));
	}
	
    
	
	////this method is specifically designed to find a and return a gym member based ID number passed to it
	public GymMember getMemberUsingID(String ID)
	{
		
		GymMember memberBeingSeeked = null;
		
		for(GymMember g : this.members)
		{
			if(g.ID.equals(ID))
			{
				memberBeingSeeked = g;
				
			}
		}
		
	
		
			return memberBeingSeeked;
		
	}
	public GymMember getMemberUsingMembershipID(String memberShipID)
	{
		
		GymMember memberBeingSeeked = null;
		
		for(GymMember g : this.members)
		{
			if(g.getMemberShipID().equals(memberShipID));
			{
				memberBeingSeeked = g;
				
			}
		}
		
	
		
			return memberBeingSeeked;
		
	}
	
	
	
	
	
	
	
	public void addNewMember(String firstName, String lastName, char gender, String ID,String startDate,String emailAddress
			,String phoneNumber,double monthlyFee)
	{
		GymMember newMember = new GymMember(firstName,lastName,gender,ID,startDate,emailAddress,phoneNumber,monthlyFee);
		
		if(newMember != null) {
			this.members.add(newMember);
			
		}

	}
	
	
	public void refreshGym()
	{
		///in here we will be dealing with checking if clients have paid,updating balanecs and nmaking sure
	}
	
	
	
	public void queryMemberUsingID(String ID)
	{
		//GymMember memberBeingQueried = this.getMemberUsingID(ID);
		////TODO : We need to add text field and nodes which we are going to use to display the details of the
		////queried gym member.
		
		
	}
	
	public void queryMemberUsingMembershipID(String MembershipID)
	{
		//GymMember memberBeingQueried = this.getMemberUsingMembershipID(MembershipID);
		////TODO : We need to add text field and nodes which we are going to use to display the details of the
		////queried gym member.
		
		
	}
	
	
	public void removeMemberUsingID(String ID)
	{
		for(GymMember g : this.members)
		{
			if(g.ID.equals(ID))
			{
				FileStorage.removeMember(new File("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\members.txt"), g);
				this.members.remove(g);
			}
		}
		
	}
	
	
	public void removeMemberUsingMembershipID(String membershipID)
	{
		
		
		for(GymMember g : this.members)
		{
			if(g.getMemberShipID().equals(membershipID));
			{
				this.members.remove(g);
			}
		}
		
		
		
	}
	
		
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	

}
