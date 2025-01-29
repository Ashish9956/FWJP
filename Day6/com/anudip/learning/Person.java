package com.anudip.learning;
import java.util.*;
import com.anudip.Level;
public class Person {
public enum classlevel{
	FIRST,SECOND,THIRD,FOURTH,FIFTH
}
  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Type one of the options");
	System.out.println("1. Low\n2. Medium\n3.High");
	String option = sc.nextLine();
	sc.close();
	
	Level level = option.equals("Low")?Level.LOW:option.equals("Medium")?Level.MEDIUM:Level.HIGH;
	
	System.out.println("You have selected Level : "+level);
	
	classlevel cl=classlevel.FOURTH;


}
}
