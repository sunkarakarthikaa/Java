import java.util.Scanner; 

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int compoundtime;
        int years;
        double finalamount;

        System.out.print("Enter the principal amount: ");
        principal=sc.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        rate=sc.nextDouble() /100 ;
        System.out.print("Enter the number of times compounded per year: ");
        compoundtime=sc.nextInt();
        System.out.print("Enter the number of years: ");
        years=sc.nextInt();
        
        finalamount=principal*Math.pow(1+rate/compoundtime, compoundtime*years);
        System.out.printf("The amount after %d years is %.2f",years,finalamount);

        sc.close();
    }
    
}
