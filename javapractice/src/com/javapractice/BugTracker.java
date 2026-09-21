package com.javapractice;
import java.util.Scanner;

public class BugTracker {
	
	int bugId;
	String applicationName;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	
	int getBugid(){
		return bugId;
	}
	String getApplicationName()
	{
		return applicationName;
	}
	String getBugTitle()
	{
		return bugtitle;
	}
	String getseverity()
	{
		return severity;
	}
	String getPriority()
	{
		return priority;
	}
	String getstatus()
	{
		return status;
	}
	String getAssignedDeveloper()
	{
		return assignedDeveloper;
	}
	void assignToDeveloper(int bugid, String developerName)
	
	{
		if(this.bugId==bugid)
		{
			this.assignedDeveloper=developerName;
		}
		
		updateStatus("In develoed");
	}
    void updateStatus (String newstatus) {
		
		status=status+newstatus;
		System.out.println(status);
		 
	}
	void  displayBugSummary()
	{
		System.out.println("what bug id - "+getBugid());
		System.out.println("what is Application Name -  "+getApplicationName());
		System.out.println("what isTitle - "+getBugTitle());
		System.out.println("what is getseverity - "+getseverity());
		System.out.println("what is getPriority - "+getPriority());
		System.out.println("what is getstatus - "+getstatus());
		System.out.println("what is getAssignedDeveloper - "+getAssignedDeveloper());
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		BugTracker bt=new BugTracker();
		
		bt.bugId=101;
		bt.applicationName="Bank Application";
		bt.bugtitle="Login Button not Working";
		bt.severity="High";
		bt.priority="High";
		bt.status="assigned";
		bt.assignedDeveloper="assained";
		System.out.println(bt.bugId);
		System.out.println(bt.applicationName);
		System.out.println(bt.bugtitle);
		System.out.println(bt.severity);
		System.out.println(bt.priority);
		System.out.println(bt.status);
		
		
		bt.assignToDeveloper(101,"chinna");
		bt.updateStatus("its done");
		bt.displayBugSummary();
		System.out.println("main method ended");
		
		
		
		

	}

}