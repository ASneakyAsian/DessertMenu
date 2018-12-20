package dessertIsland;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		diner myDiner = new diner();
		feast myFeast = new feast();
		String dessertsToString = "";
		direction myDir;
		String myDessert;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your favorite dessert : ");
		myDessert = scan.nextLine();
		dessert thisDessert = new dessert(84.00, 2.00, myDessert);
		
		dessertsToString += (char)(thisDessert.getMarginalValue());
		
		String thisStr = "SALE";
		if(myDiner.isSale){ dessertsToString += thisStr.substring(0, 2); } else { dessertsToString += thisStr.substring(2, 4); };

		//weight calc
		int thisint = 0;
		thisint += myFeast.getDessertWeights()[3];
		thisint += myFeast.getDessertWeights()[1];
		dessertsToString += (char)thisint;
		
		for(int q = 1; q <= 30; q += 2){
			myFeast.addDessert(new dessert(32.00,23.00,myDessert));
		}
		dessertsToString += myFeast.justDesserts();
		dessertsToString += myFeast.justDesserts();
		for(int q = 0; q <= 2; q += 1){
			myFeast.addDessert(new dessert(64.00,46.00,myDessert));
		}
		dessertsToString += myFeast.justDesserts();
		
		//final calcs
		dessert primeDessert = new dessert(77.00,11450.00,dessertsToString);
		pricetag p = new pricetag((int)primeDessert.getCost());
		dessertsToString += (char)(p.getSqr(true));
		String outchars = p.charCorrespond((int)primeDessert.getWeight()) + "" + p.charCorrespond((int)primeDessert.getCost());
		dessertsToString += outchars;
		
		//print directions
		dessertsToString += mkDir().getDir();
		
		//recommit
		if(dessertsToString.length() > 16){
			primeDessert.setName(dessertsToString);
		}
		else{
			dessertsToString = dessertsToString.substring(0, 8);
		}
		
		System.out.println(primeDessert.getOpinion());
	
	}
	
	public static direction mkDir(){
		direction myDir = new direction(2);
		return new direction(201);
	}
}
