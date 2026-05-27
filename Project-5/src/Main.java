import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double weight;
        double newwt;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if(choice ==1){
            System.out.print("Enter the weight in lbs: ");
            weight=sc.nextDouble();
            newwt=weight*0.453592;
            System.out.println("The new weight in kgs is: "+newwt);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            weight=sc.nextDouble();
            newwt=weight*2.20462;
            System.out.println("The new weight in lbs is: "+newwt);
        }else{
            System.out.println("Invalid choice");
        }
sc.close();
    }
    
}
