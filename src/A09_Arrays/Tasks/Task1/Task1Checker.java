package A09_Arrays.Tasks.Task1;

import java.io.*;
import java.util.Scanner;

public class Task1Checker {
    public static void main(String[] args) throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file1 = new File("C:\\Users\\Sahin\\IdeaProjects\\JavaCourse\\src\\day16Arrays\\Tasks\\TestCase4");
        Scanner scan1 = new Scanner(file1);
        File file2 = new File("C:\\Users\\Sahin\\IdeaProjects\\JavaCourse\\src\\day16Arrays\\Tasks\\Outputs4");
        Scanner scan2 = new Scanner(file2);

        while (scan1.hasNextLine()&&scan2.hasNextLine()){
            int q = scan1.nextInt();
            while (q-- > 0) {
                int n = scan1.nextInt();
                int leap = scan1.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan1.nextInt();
                }
                String output = (Task1Game.canWin(leap, game)) ? "YES" : "NO";
                String expectedOutput = scan2.nextLine();
                // Compare here expected and current outputs
                // Print info if outputs are different
                if(!output.contains(expectedOutput)){
                    System.out.println(output+expectedOutput+".");
                    System.out.println(q + "'th array :");
                    System.out.println("n :"+n+" leap :"+leap);
                    for (int i:game) {
                        System.out.print(i+", ");
                    }
                    System.out.println();
                    System.out.println("......................................");
                }
            }

        }
        scan1.close();

    }
}
