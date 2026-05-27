import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String units;

        System.out.print("Enter the temperature: ");
        temp=sc.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        units=sc.next().toUpperCase();
        
       newtemp =  (units.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32;

       System.out.printf("Converted temp is %.1f",newtemp);
        sc.close();
    }
    
}
