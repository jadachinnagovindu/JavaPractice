//package com.javapractice;
//import java.util.Scanner;
//
//public class BugTracker {
//	
//	int bugId;
//	String applicationName;
//	String bugtitle;
//	String severity;
//	String priority;
//	String status;
//	String assignedDeveloper;
//	
//	
//	int getBugid(){
//		return bugId;
//	}
//	String getApplicationName()
//	{
//		return applicationName;
//	}
//	String getBugTitle()
//	{
//		return bugtitle;
//	}
//	String getseverity()
//	{
//		return severity;
//	}
//	String getPriority()
//	{
//		return priority;
//	}
//	String getstatus()
//	{
//		return status;
//	}
//	String getAssignedDeveloper()
//	{
//		return assignedDeveloper;
//	}
//	void assignToDeveloper(int bugid, String developerName)
//	
//	{
//		if(this.bugId==bugid)
//		{
//			this.assignedDeveloper=developerName;
//		}
//		
//		updateStatus("In develoed");
//	}
//    void updateStatus (String newstatus) {
//		
//		status=status+newstatus;
//		System.out.println(status);
//		 
//	}
//	void  displayBugSummary()
//	{
//		System.out.println("what bug id - "+getBugid());
//		System.out.println("what is Application Name -  "+getApplicationName());
//		System.out.println("what isTitle - "+getBugTitle());
//		System.out.println("what is getseverity - "+getseverity());
//		System.out.println("what is getPriority - "+getPriority());
//		System.out.println("what is getstatus - "+getstatus());
//		System.out.println("what is getAssignedDeveloper - "+getAssignedDeveloper());
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		
//		BugTracker bt=new BugTracker();
//		
//		bt.bugId=101;
//		bt.applicationName="Bank Application";
//		bt.bugtitle="Login Button not Working";
//		bt.severity="High";
//		bt.priority="High";
//		bt.status="assigned";
//		bt.assignedDeveloper="assained";
//		System.out.println(bt.bugId);
//		System.out.println(bt.applicationName);
//		System.out.println(bt.bugtitle);
//		System.out.println(bt.severity);
//		System.out.println(bt.priority);
//		System.out.println(bt.status);
//		
//		
//		bt.assignToDeveloper(101,"chinna");
//		bt.updateStatus("its done");
//		bt.displayBugSummary();
//		System.out.println("main method ended");
//		
//		
//		
//		
//
//	}
//
//}

package com.javapractice;

public class BugTracker {

    // Private variables
    private int bugId;
    private String applicationName;
    private String bugTitle;
    private String severity;
    private String priority;
    private String status;
    private String assignedDeveloper;

    // Setter methods

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setBugTitle(String bugTitle) {
        this.bugTitle = bugTitle;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssignedDeveloper(String assignedDeveloper) {
        this.assignedDeveloper = assignedDeveloper;
    }

    // Getter methods

    public int getBugId() {
        return bugId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getBugTitle() {
        return bugTitle;
    }

    public String getSeverity() {
        return severity;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    // Main method
    public static void main(String[] args) {

        BugTracker bt = new BugTracker();

        // Setting values using setters
        bt.setBugId(101);
        bt.setApplicationName("Bank Application");
        bt.setBugTitle("Login Button Not Working");
        bt.setSeverity("High");
        bt.setPriority("High");
        bt.setStatus("Assigned");
        bt.setAssignedDeveloper("Chinna");

//        // Getting values using getters
//        System.out.println("Bug ID: " + bt.getBugId());
//        System.out.println("Application Name: " + bt.getApplicationName());
//        System.out.println("Bug Title: " + bt.getBugTitle());
//        System.out.println("Severity: " + bt.getSeverity());
//        System.out.println("Priority: " + bt.getPriority());
//        System.out.println("Status: " + bt.getStatus());
//        System.out.println("Assigned Developer: " + bt.getAssignedDeveloper());
    }
}