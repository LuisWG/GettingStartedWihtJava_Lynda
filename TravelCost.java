/*
 * This program uses total distance of the trip, as given by google maps, 
 * the mpg of the vehicle (that can be either inputed by user or taken by default from a table on this website ______ /local DB) and 
 * the current price of gas fom this website ______ , to calculete the total cost of a trip
 */

//package travelcosts;
import java.util.Scanner;

public class TravelCost
{

public static void main(String[] args){

double	Distance, //Km
	MPG, //Default by manufacturer
	KmPL
	PricePerGalon, 
	PricPerLiter, //of gas in Mexico, average
	TotalCost;

	Scanner in = new Scanner(System.in);
	System.out.println("Enter the total distance in miles: ");
	Distance = in.nextDouble();
	
	System.out.println("Enter your vehicle's MPG: ");
	MPG = in.nextDouble();	

	System.out.println("Enter the price of one gallon of gas: ");
	PricePerGallon = in.nextDouble();

	PricePerLiter = PricePerGalon/0.2641720512415584
	TotalCost = Distance/MPG * PricePerGallon;

	System.out.printf("The trip will cost: $%5.2f MXN ", TotalCost);
	System.out.println();	
	

}

}
