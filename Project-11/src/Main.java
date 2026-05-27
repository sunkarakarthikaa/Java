import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] questions=
        {"What is the main function of a router?", 
        "Which part of the computer is considered the brain?",
        "What year was facebook launched?",
        "Who is known as the father of computer?",
        "What was the first programming language?"};

        String[][] options=
        {{"1.Storing files\n","2.Encrypting data\n","3.Directing internet traffic\n","4.Managing passwords\n"},
        {"1.CPU\n","2.Hard drive\n","3.RAM\n","4.GPU\n"},
        {"1.2008\n","2.2004\n","3.1994\n","4.2000\n"},
        {"1.Steve Jobs\n","2.Bill Gates\n","3.Alan Turing\n","4.Charles Babbage\n"},
        {"1.Assembly\n","2.C\n","3.Fortran\n","4.Python\n"}};

        int[] answers = {3,1,2,4,3};

        int score=0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("***********************************");

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.print(option);
            }
            System.out.print("\nEnter your guess: ");
            guess=sc.nextInt();
            if(guess==answers[i]){
                System.out.println("CORRECT!\n");
                score++;
            }
            else{
                System.out.println("WRONG!\n");
            }
        }
System.out.println("Final score: "+score+" out of "+questions.length);

        sc.close();
    }
    
}
