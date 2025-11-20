import java.util.Scanner;

public class arrayAverageScore17 {
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student :");
        int manyStudent = sc.nextInt();

        int[] score = new int [manyStudent];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++){
            System.out.print("Enter student score " + ( i + 1) + " :");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++){
            total += score[i];
        }

        for (int i = 0; i < score.length; i++){
            if (score[i] > 70){
                System.out.println("Student " + (i + 1) + " :" + score[i]);
                i++;
            }
        }
        average = total / score.length;


        System.out.println("The class average score is " + average); 
    }
}
