package org.webapp;
import java.io.Serializable;



public class DisplayData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String stname,rollno,course,fees;
	public String getName()
	{
		return stname;
	}
	public void setName(String stname)
	{
		this.stname=stname;
	}
	public String getRollno()
	{
		return rollno;
	}
	public void setRollno(String rollno)
	{
		this.rollno=rollno;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getFees()
	{
		return fees;
	}
	public void setFees(String fees)
	{
		this.fees=fees;
	}
        
    public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

}
