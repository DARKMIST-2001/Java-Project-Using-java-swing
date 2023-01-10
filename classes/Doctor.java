package classes;

public final class Doctor {
  private String DName;
  private String DId;
  private String DRoom;
  private String DQualification;
  private String DSpecialist;
  private String DAppointment;
    public Doctor(){};
    public Doctor(String DName,String DId,String DRoom,String DQualification,String DSpecialist,String DAppointment)
    {
            this.DName=DName;
            this.DId=DId;
            this.DRoom=DRoom;
            this.DQualification=DQualification;
            this.DSpecialist=DSpecialist;
            this.DAppointment=DAppointment;
    
    }
    public void setDName(String DName) {this.DName = DName;}
    public void setDId(String DId) {this.DId = DId;}
    public void setDRoom(String DRoom) {this.DRoom = DRoom;}
    public void setDQualification(String DQualification) {this.DQualification = DQualification;}
    public void setDSpecialist(String DSpecialist) {this.DSpecialist = DSpecialist;}
    public void setDAppointment(String DAppointment) {this.DAppointment = DAppointment;}
   
    
    public String getDName() {return DName;}
    public String getDId() {return DId;}
    public String getDRoom() {return DRoom;}
    public String getDQualification() {return DQualification;}
    public String getDSpecialist() {return DSpecialist;}
    public String getDAppointment() {return DAppointment;}













}
