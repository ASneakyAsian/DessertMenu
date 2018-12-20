package dessertIsland;

public class pricetag {

	private int value;
	private int q;
	
	public pricetag(int val){
		q = 4;
		this.value = val;
	}
	
	public int getSqr(boolean isSpecial){
		if(isSpecial){
			value -= 1;
		}
		return (int)Math.sqrt((double)value * 1.00);
	}
	
	public int getMarginalCost(){
		return value/q;
	}
	
	public char charCorrespond(int i){
		switch(i){
		case 5:
			return  'n';
		case 10:
			return  'd';
		case 7:
			return  'm';
		case 25:
			return  'q';
		case 66:
			return  'e';
		case 1:
			return  'p';
		case 42:
			return  'b';
		case 4242:
			return  'B';
		case 77:
			return  'M';
		default:
			return 'E';
		}
	}
	
}
