package level0;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
public static void main(String[] args) {
String firstlast=JOptionPane.showInputDialog("what is your first and last name?");
String airport=JOptionPane.showInputDialog("what airport are you going to?");
String birthday=JOptionPane.showInputDialog("when is your birthday");
String gender=JOptionPane.showInputDialog("are you a male or a female");
System.out.println(firstlast+"("+birthday+","+gender+")");
System.out.println(airport);



}



}










