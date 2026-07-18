import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // QUIZ GAME
        System.out.println("****************************");
        System.out.println("    Welcome to QUIZ GAME");
        System.out.println("****************************");

        String[] questions = {"what is the name of the language?",
                              "which language is older?",
                              "which IDE you are using?"};

        String[][] options = {{"1. JAVA", "2. C", "3. PYTHON"},
                              {"1. C#", "2. C++", "3. C" },
                              {"1. VIM", "2. IDEA", "3. ECLIPSE"}};

       int[] answers = {1,3,2};

       Scanner scanner = new Scanner(System.in);

        int total=0;
        int optionChosen;
        for(int i=0;i< questions.length;i++){
            System.out.println(questions[i]);
            for(int j=0;j<options[i].length;j++){
                System.out.println(options[i][j]);
            }
            System.out.print("choose an option: ");
            do {
                optionChosen = scanner.nextInt();
                if(optionChosen<1 || optionChosen >3){
                    System.out.println("INVALID CHOICE!");
                    System.out.print("choose an option: ");
                }
            }while(optionChosen<1 || optionChosen >3);
            if(optionChosen == answers[i]){
                total++;
                System.out.println("*************");
                System.out.println("   CORRECT");
                System.out.println("*************");
            }else{
                System.out.println("*************");
                System.out.println("    WRONG");
                System.out.println("*************");
            }
        }
        scanner.close();
        System.out.println("You Scored: " + total + "/3");
    }
}