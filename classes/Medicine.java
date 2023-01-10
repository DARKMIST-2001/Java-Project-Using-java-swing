public final class Medicine{
	private String Name;
	private String ExDate;
	private int count;
	public Medicine(){};
	public Medicine(String Name,String ExDate,int count){
		this.Name=Name;
		this.count=count;
        this.ExDate=ExDate;
	}
	public void set_Name(String Name){this.Name=Name;}
	public void set_count(int count){this.count=count;}
	public void set_ExDate(String ExDate){this.ExDate=ExDate;}
	public String get_Name(){return Name;}
	public int get_count(){return count;}
	public String get_ExDate(){return ExDate;}
	
}
