package classes;

public class Emergency extends Patient {
	private String EmPatientName;
	private String EmPatientId;
	private String EmPatientPhoneNumber;
	private String EmPatientaddress;
	private String EmPatientBloodGroup;
	private String EmPatientProblemType;

	Emergency(){};
	public Emergency(String EmPatientName, String EmPatientId, String EmPatientPhoneNumber, String EmPatientaddress, String EmPatientBloodGroup, String EmPatientProblemType) {
	this.EmPatientName = EmPatientName;
	this.EmPatientId = EmPatientId;
	this.EmPatientPhoneNumber = EmPatientPhoneNumber;
	this.EmPatientaddress = EmPatientaddress;
	this.EmPatientBloodGroup = EmPatientBloodGroup;
	this.EmPatientProblemType=EmPatientProblemType;
}

public void set_EmPatientName(String EmPatientName){this.EmPatientName=EmPatientName;}
public void set_EmPatientid(String EmPatientId){this.EmPatientId=EmPatientId;}
public void set_EmPatientPhoneNumber(String EmPatientPhoneNumber){this.EmPatientPhoneNumber=EmPatientPhoneNumber;}
public void set_EmPatientaddress(String EmPatientaddress){this.EmPatientaddress=EmPatientaddress;}
public void set_EmPatientBloodGroup(String EmPatientBloodGroup){this.EmPatientBloodGroup=EmPatientBloodGroup;}

	public String get_EmPatientName(){return EmPatientName;}
	public String get_EmPatientId(){return EmPatientId;}
	public String get_EmPatientPhoneNumber(){return EmPatientPhoneNumber;}
	public String get_EmPatientaddress(){return EmPatientaddress;}
	public String get_EmPatientBloodGroup(){return EmPatientBloodGroup;}
	
	
}