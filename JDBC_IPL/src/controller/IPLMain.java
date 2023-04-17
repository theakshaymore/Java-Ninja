package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.ServiceInformation;

import entity.Team;
import service.TeamImplementation;;

public class IPLMain {

	static Scanner sc=new Scanner(System.in);
	 static int choice=0;
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
	    System.out.println("enter 1-select 2-insert 3-update 4-delete 5-exit");
	    do {
	    System.out.println("enter your choice");
	    choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1: searchTeam(); break;
	    case 2: System.out.println("Application Closed");  System.exit(0);
	    default: System.out.println("Invalid Choice!!");
	    }
	    }while(choice!=2);
	}
		
		public static void searchTeam() throws ClassNotFoundException, SQLException 
		{	
			Team team = new Team();
			System.out.println("pls enter id");
			int id=sc.nextInt();
			List<Team> teamlist=new TeamImplementation().searchAllTeams(team);
			for(Team t1:teamlist)
			{
				System.out.println(t1);
			}
			
		}
		
//		public static void selectAll() throws ClassNotFoundException, SQLException 
//		{
//		List<Team> teamlist=new Service_Implementations().displayAllTeams();
//		for(Team t:teamlist)
//		{
//			System.out.println(t);
//		}
//			
//		}
		
//		public static void insert() throws ClassNotFoundException, SQLException 
//		{
//			Team t=new Team();
//			System.out.println("pls enter name,city,state of team");
//			t.setName(sc.next());t.setCity(sc.next());t.setState(sc.next());
//			int i=new Service_Implementations().insertionTeam(t);
//			if(i!=0)
//				System.out.println("Insertion Done...1 row effected");
//			else
//				System.out.println("Insertion Failed");
//		}

//		public static void update() throws ClassNotFoundException, SQLException 
//		{
//			Team t=new Team();
//			System.out.println("pls enter id,name,city,state of team to update");
//			t.setTeam_id(sc.nextInt());t.setName(sc.next());t.setCity(sc.next());t.setState(sc.next());
//			int i=new Service_Implementations().updationTeam(t);
//			if(i!=0)
//				System.out.println("Updation Done...1 row effected");
//			else
//				System.out.println("Updation Failed");
//			
//		}
		
//		public static void delete() throws ClassNotFoundException, SQLException 
//		{
//			System.out.println("pls enter id");
//			int id=sc.nextInt();
//			int i=new Service_Implementations().deletionTeam(id);
//			if(i!=0)
//				System.out.println("Deletion Done...");
//			else
//				System.out.println("Deletion Failed");
//		}

}
