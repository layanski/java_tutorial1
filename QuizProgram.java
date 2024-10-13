import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String[] questions = {
            "1. What is the capital of France?\n1. Berlin\n2. Madrid\n3. Paris\n4. Rome",
            "2. What is the capital of America?\n1. Berlin\n2. Washington\n3. Paris\n4. Rome",
            "3. Who is the President of France?\n1. Emmanuel Macron\n2. Anura Dissanayake\n3. Joe Biden\n4. Sergio Mattarella",
            "4. Which is the oldest city in Sri Lanka?\n1. Berlin\n2. Anuradhapura\n3. Chennai\n4. Rome",
            "5. UNIX is written in which language?\n1. C#\n2. C++\n3. C\n4. .Net"
        };
        

        int[] correctAnswers = {3, 2, 1, 2, 3};  

        int score = 0; 

        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  

        
            System.out.print("Please enter the number of the correct answer: ");
            int userAnswer = scanner.nextInt();

            
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;  
            } else {
                System.out.println("Incorrect.");
                System.out.println("the correct answer is"+correctAnswers[i]);
            }

            System.out.println();  
        }

        
        System.out.println("Quiz finished! Your final score is: " + score + "/5");

        
        scanner.close();
    }
}
