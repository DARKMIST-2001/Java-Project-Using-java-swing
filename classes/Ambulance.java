package classes;

public final class Ambulance{
	private String Driver_Name;
	private String Phone_Number;
	private String Id;
	private String Ambulance_Num;
	
	public Ambulance(){};
	public Ambulance(String Driver_Name,String Phone_Number,String Id,String Ambulance_Num){
			this.Driver_Name=Driver_Name;
			this.Phone_Number=Phone_Number;
			this.Id=Id;
			this.Ambulance_Num=Ambulance_Num;
	}
	
	public void set_Driver_Name(String Driver_Name){this.Driver_Name=Driver_Name;}
	public void set_Phone_Number(String Phone_Number){this.Phone_Number=Phone_Number;}
	public void set_Id(String Id){this.Id=Id;}
	public void set_Ambulance_Num(String Ambulance_Num){this.Ambulance_Num=Ambulance_Num;}
	public String get_Driver_Name(){return Driver_Name;}
	public String get_Phone_Number(){return Phone_Number;}
	public String get_Id(){return Id;}
	public String get_Ambulance_Num(){return Ambulance_Num;}
}