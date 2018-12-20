package dessertIsland;

public class diner {
	
	private dessert[] desserts;
	private int index;
	private String[] menuitems;
	private double[] menucosts;
	public boolean isSale = true;
	
	public diner(){
		index = 0;
	}
	
	public void addDessert(dessert ds){
		desserts[index] = ds;
		menuitems[index] = ds.getName();
		menucosts[index] = ds.getCost();
		index ++;
	}

}
