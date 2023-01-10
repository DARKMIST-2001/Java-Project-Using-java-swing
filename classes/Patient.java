package classes;

public class Patient {
    private String patID;
    private String patName;
    private String patDiseases;
    private String patSex;
    private String patAdmitstatus;
    private String patAge;
	private String patBirthYear;
    private String patNIDNumber;
	
    public Patient(){};
    public Patient(String patID, String patName,String patDiseases,String patAdmitstatus,String patAge,String patNIDNumber)
    {
        this.patID=patID;
        this.patName=patName;
        this.patDiseases=patDiseases;
        this.patSex=patSex;
        this.patAge=patAge;;
        this.patAdmitstatus=patAdmitstatus;
        this.patNIDNumber=patNIDNumber;

    }

    public void setpatID(String patID) {patID = patID;}
    public void setpatName(String patName) {patName = patName;}
    public void setpatDiseases(String patDiseases) {patDiseases = patDiseases;}
    public void setpatSex(String patSex) {patSex = patSex;}
    public void setpatAdmitstatus(String patAdmitstatus) {patAdmitstatus = patAdmitstatus;}
    public void setpatBirthYear(String patientBirthYear) {patBirthYear = patBirthYear;}
    public void setpatNIDNumber(String patNIDNumber) {patNIDNumber = patNIDNumber;}
    public void setpatAge(String patAge) {patAge = patAge;}

    public String getpatID() {return patID;}
    public String getpatName() {return patName;}
    public String getpatDiseases() {return patDiseases;}

    public String getPatSex() {return patSex;}

    public String getpatAdmitstatuss() {return patAdmitstatus;}
    public String getpatNIDNumber() {return patNIDNumber;}
    public String getpatBirthYearr() {return patBirthYear;}
    public String getpatAge(){return patAge;}










}
