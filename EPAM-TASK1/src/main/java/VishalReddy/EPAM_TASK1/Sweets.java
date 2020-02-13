package RamMohanReddy.EPAM_TASK1;

public abstract class Sweets {
	
	abstract String getType();
	int weight,cost;
	String name;
	
	Sweets(String name,int weight,int cost){
		this.name  = name;
		this.weight=weight;
		this.cost=cost;
	}
}