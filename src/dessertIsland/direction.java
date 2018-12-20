package dessertIsland;

public class direction {
	
	private String myDir;
	
	public direction(int myVal){
		switch(myVal){
		case 1:
			myDir = "Left";
			break;
		case 3:
			myDir = "Down";
			break;
		case 2:
			myDir = "Right";
			break;
		case 4:
			myDir = "Up";
			break;
		default:
			myDir = "Up";
			break;
		}
	}
	
	public String getDir(){
		return myDir + "}";
	}

}
