import java.util.Scanner;

public class arrayValue17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] finalScore = new int[10];

        for (int i = 0;i < 10;i++) {
            System.out.print("Enter final score " + i +" : ");
            finalScore[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if (finalScore[i] > 70){
                System.out.println("Student " +i+ "passed");
            } else if (finalScore[i] < 70){
                System.out.println("Student" +i+ "not passed");
            }
        }
    }
}
