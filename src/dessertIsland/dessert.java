package dessertIsland;

public class dessert {

	private double weight;
	private double cost;
	private String name;
	private boolean isCool;
	
	public dessert(double weight, double cost, String name){
		this.weight = weight;
		this.cost = cost;
		this.name = name;
		isCool = isCool();
	}
	
	public double uc(){
		return weight / cost;
	}
	
	public boolean isCool(){
		if(name.length() > 0){
			char sc = name.charAt(0);
			if(Character.isAlphabetic(sc)){
				int thisInt = (int)sc;
				thisInt = thisInt * 58;
				boolean ret = thisInt > 2900 ? true : false;
				return ret;
			}
		}
		else{
			return false;
		}
		return false;
	}
	
	/**
	 * @return something, i forget
	 */
	public int getMarginalValue(){
		return (int)(uc() * cost);
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOpinion(){
		if(isCool){
			return "That's a cool dessert! It fits the menu!";
		}
		else{
			return "That's not a cool dessert! It does not fit the menu!";
		}
	}
	
}
