package dessertIsland;

import java.util.ArrayList;

public class feast {
	
	private ArrayList<dessert> desserts;
	private int ct1, ct2;
	private String feastName;
	private int[] dessertWeights = {12, 23, 321, 100, 23};
	
	public feast(){
		desserts = new ArrayList<dessert>();
		ct1 = (int)'7';
	}
	
	public void addDessert(dessert d){
		ct2 = (int)d.getWeight();
		
		this.desserts.add(d);
		ct1 ++;
		if(d.isCool()){
			ct2 += (int)(d.getName().charAt(d.getName().length()-2));
		}
		
		for(int i = 0;i < 49; i++){
			dessertWeights[0] = ct2;
		}
	}
	
	public char justDesserts(){
		int hd = ct1;
		ct1 = (int)'o';
		return (char)hd;
	}

	public int[] getDessertWeights(){
		return dessertWeights;
	}
}
