package JAVAB;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
public class ss {

	






	 public static void main(String[] args) {

	 

	 List<Object> Values = new ArrayList<>();

	 Scanner scanner = new Scanner(System.in);


	 System.out.println("Enter values:");


	 while (true) {

	 String input = scanner.nextLine().trim();


	 if (input.equalsIgnoreCase("exit")) {

	 for (Object value : Values)

	 System.out.println(value);

	 break;

	 }


	 try {

	 if (input.contains(".")) {

	 double doubleValue = Double.parseDouble(input);

	 Values.add("double: " + doubleValue);

	 } else {

	 try {

	 int intValue = Integer.parseInt(input);

	 Values.add("int: " + intValue);

	 } catch (NumberFormatException e) {

	 float floatValue = Float.parseFloat(input);

	 Values.add("float: " + floatValue);

	 }

	 }

	 } catch (NumberFormatException e) {

	 Values.add("string: " + input);

	 }

	 }

	 }


	 }




