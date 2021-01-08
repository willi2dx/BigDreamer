import java.util.*;
   public class bmiindex{
      public static void main (String[]args){
   
   int weight, ht, htfeet, htinches;
   final double kilo = 0.45359237;
   final double meter = 0.0254;
   double kilos, meters, bmi;
   
   Scanner input = new Scanner (System.in);
   
   System.out.println("Enter weight in pounds: ");
   weight = input.nextInt();
   
   System.out.println("Enter the number of feet in your inches: ");
   htinches = input.nextInt();
   
   kilos = kilo * weight;
   meters = meter * htinches;
   bmi = kilos / (Math.pow(meters, 2));
   
   System.out.println("Weight       : " + weight);
   System.out.println("Height feet  : " + (htinches / 12));
   System.out.println("Height inches: " + (htinches % 12));
   
   if(bmi < 18.5)
   {System.out.println("BMI is: " + bmi + " which is underweight");}
   else if (bmi >= 18.5 && bmi <= 25)
   {System.out.println("BMI is: " + bmi + " which is normal");}
   else {
   {System.out.println("BMI is: " + bmi + " which is obese.");}
   }
   
   
   
   
   
   }
   
   }