package classes;

public final class Staff{

	private String staff_ID;
	private String staff_Name;
	private String staff_Post;
    private double staff_Salary;
	private String staff_PhoneNumber;

public Staff(){}
public Staff(String staff_ID,String staff_Name,String staff_Post,double staff_Salary,String staff_PhoneNumber)
{
	this.staff_ID=staff_ID;
	this.staff_Name=staff_Name;
	this.staff_Post=staff_Post;
	this.staff_Salary=staff_Salary;
	this.staff_PhoneNumber=staff_PhoneNumber;

}

public void set_staff_ID(String staff_ID){this.staff_ID=staff_ID;}
public void set_staff_Name(String staff_Name){this.staff_Name=staff_Name;}
public void set_staff_Post(String staff_Post){this.staff_Post=staff_Post;}
public void set_staff_Salary(double staff_Salary){this.staff_Salary=staff_Salary;}
public void set_staff_PhoneNumber(String staff_PhoneNumber){this.staff_PhoneNumber=staff_PhoneNumber;}
	public String get_staff_ID(){return staff_ID;}
	public String get_staff_Name(){return staff_Name;}
	public String get_staff_Post(){return staff_Post;}
	public double get_staff_Salary(){return staff_Salary;}
	public String get_staff_PhoneNumber(){return staff_PhoneNumber;}

}
