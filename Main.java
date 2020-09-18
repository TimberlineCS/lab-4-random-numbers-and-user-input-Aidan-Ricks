import java.io.*;
import java.util.*;

public class Main{

  public static void main(String argos[]){
    Scanner range = new Scanner(System.in);
    System.out.print("Give a negitive number");
    int low = range.nextInt();
    int a = Math.abs(low);
    System.out.print("Now give a number above:"+(a));
    int high = range.nextInt();
    System.out.println("you gave me the numbers "+(low)+" and "+(high));
    int x = a+high;
    int o = (int) (Math.random()*x)+low;
    int p = (int) (Math.random()*x)+low;
    System.out.print("here is two numbers between the first two "+(o)+" and "+(p));

    //Mad Lib
    System.out.print("\n \n Mad Lib \n \n ");
     System.out.println("Give me a plural noun ");
    String noun = range.next();
    System.out.println("Give me a verb ");
    String verb = range.next();
    System.out.println("Give me an adjective ");
    String adjective = range.next();
    System.out.println("Give me a place ");
    String place = range.next();
    System.out.println("Give me a number ");
    int number = range.nextInt();
    int total = number+50;

    System.out.print("\n \n \n Right now in a "+(place)+" not far away there is a"+(verb)+" party with 50 "+(noun)+" at it. If you gave "+(number)+" more there would be "+(total)+" of them. That would just be "+(adjective)+" of you to do.");



  }
}
