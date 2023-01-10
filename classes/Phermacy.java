package classes;

public class Phermacy{
	private String Name;
	private int total_num_med;
	private int total_cost;
	
	public Phermacy(){};
	public Phermacy(String Name,int total_num_med,int total_cost){
		this.Name=Name;
		this.total_num_med=total_num_med;
		this.total_cost=total_cost;
	}
	public void set_Name(String Name){this.Name=Name;};
	public void set_total_num_med(int total_num_med){this.total_num_med=total_num_med;}
	public void set_total_cost(int total_cost){this.total_cost=total_cost;};
	public String get_Name(){return Name;}
	public int get_total_num_med(){return total_num_med;}
	public int get_total_cost(){return total_cost;}
	
}