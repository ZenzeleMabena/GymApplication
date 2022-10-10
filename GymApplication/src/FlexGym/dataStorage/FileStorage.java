package FlexGym.dataStorage;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import FlexGym.model.GymMember;

public class FileStorage {
	
	
	public static ArrayList<GymMember> readMembers(File fileName)
	{
		
		////go to the file and open it
		////then I want to read line by line from the file and put inside an arraylist and return it
		ArrayList<GymMember> members = new ArrayList<>();
		Scanner txtOut = null;
		
		try
		{
			txtOut = new Scanner(fileName);
			String line = "";
			StringTokenizer t = null;
			GymMember member = null;
			String ID = "";
			String mID = "";
			String fName = "";
			String lName = "";
			char gender = '?';
			String eAddress = "";
			String phoneNumber = "";
			double balance;
			String startDate = "";
			double monthlyFee;
			
			while(txtOut.hasNextLine())
			{
				
				////public GymMember(String firstName, String lastName, char gender, String ID,String startDate,String emailAddress,
						//String phoneNumber,double monthlyFee,double balance) 
				
				line = txtOut.nextLine();
				System.out.println(line);
				t = new StringTokenizer(line,"\s |");
				
				
				 ID = t.nextToken();
				
				
				  mID = t.nextToken();
				 
				 fName = t.nextToken();
				 
				lName = t.nextToken();
				 gender = t.nextToken().charAt(0);
				eAddress = t.nextToken();
				 phoneNumber = t.nextToken();
				 balance = Double.parseDouble(t.nextToken());
				 startDate = t.nextToken();
				 monthlyFee = Double.parseDouble(t.nextToken());
				 
				 System.out.println("Memeber details " + ID + " " + mID + " "+ fName + " " + lName + " " + gender + " " + eAddress + 
						 " " + phoneNumber + " " + balance + " " + startDate + " " + monthlyFee);
				
				member = new GymMember(fName,lName,gender,ID,startDate,eAddress,phoneNumber,monthlyFee,balance);
				System.out.println("Member instantiated");
				
				members.add(member);
				System.out.println("Member added to the gym");

				//writer.print(member.getID() + "\s |" + member.getMemberShipID() + "\t" + member.getFirstName() + "\t" + member.getLastName() + "\t" + member.getGender() 
				//+ "\t" + member.getEmailAddress() + "\t" +  member.getPhoneNumber() +  "\t" +  member.getBalance() + "\t" + member.getStartDate() + "\t" + member.getMonthlyFee() + "\n");
				
				
			}
			
			System.out.println("members scanned and ready to use");
		
			
		}
		catch(FileNotFoundException fnfex)
		{
			fnfex.printStackTrace();
		}
		finally
		{
			if(txtOut != null) {txtOut.close();}
		}
		
		
		
		
		
		return members;
		
	}
	
	
	public static void removeMember(File file,GymMember member)
	{
		Scanner s = null;
		PrintWriter pw = null;
		
		try
		{
			s = new Scanner(file);
			pw = new PrintWriter("C:\\Users\\User\\Documents\\School Content\\Computer Science\\Practicals(Programs)\\Workspace\\GymApplication\\docs\\log.txt");
			String line = "";
			while(s.hasNextLine())
			{
				line = s.nextLine();//reading line from the text file
				String[] parts = line.split("\s |");////splitting the line read in  where there is the double space and vertical line
				if(parts[0] == member.getID())//if the first string (ID) matches the ID   
				{
					pw.write(line + "Must be removed \n");///then we log into the log file
				}
			}


		}catch(Exception ioe)
		{
			ioe.printStackTrace();
		}
		
	}
	
	
	
	
	public static void appendMember(File fileName,GymMember member)
	{
		
		
		PrintWriter writer = null;
		try
		{
			writer = new PrintWriter(fileName);
			
			writer.write(member.getID() + "\s |" + member.getMemberShipID() + "\s |" + member.getFirstName() + "\s |" + member.getLastName() + "\s |" + member.getGender() 
			+ "\s |" + member.getEmailAddress() + "\s |" +  member.getPhoneNumber() +  "\s |" +  member.getBalance() + "\s |" + member.getStartDate() + "\s |" + member.getMonthlyFee() + "\n");
		
			
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		finally
		{
			if(writer != null)
			{
				writer.close();
			}
		}
		
			
		
	}
	
	public static void writeMembers(File fileName,ArrayList<GymMember> members)
	{
		
		
		
		
		PrintWriter txtOut = null;
		try
		{
			
			txtOut = new PrintWriter(fileName);
			
			///for all members inside the arraylist 
			for(GymMember g : members)
			{
				////write their details to the file
				txtOut.print(g.getID() + "\s |" + g.getMemberShipID() + "\s |" + g.getFirstName() + "\s |" + g.getLastName() + "\s |" + g.getGender() 
				+ "\s |" + g.getEmailAddress() + "\s |" +  g.getPhoneNumber() +  "\s |" +  g.getBalance() + "\s |" + g.getStartDate() + "\s |" + g.getMonthlyFee() + "\n");
				
				
			}
			
			
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		finally
		{
			if(txtOut != null)
			{
				txtOut.close();
			}
		}
		
		
	}

}
