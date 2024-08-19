import java.util.*;

public class task2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int S1, S2, S3, S4, S5;
        
        System.out.println("Enter the mark for Subject_1:");
        S1 = n.nextInt();
        System.out.println("Enter the mark for Subject_2:");
        S2 = n.nextInt();
        System.out.println("Enter the mark for Subject_3:");
        S3 = n.nextInt();
        System.out.println("Enter the mark for Subject_4:");
        S4 = n.nextInt();
        System.out.println("Enter the mark for Subject_5:");
        S5 = n.nextInt();
        
        int s = S1 + S2 + S3 + S4 + S5;
        int avg = s / 5; // Calculating the Average of 5 Subjects
        System.out.println("Average marks: " + avg);
        
        if (avg >= 90)
            System.out.println("Grade A"); // More than or equal to 90 Marks
        else if (avg >= 80 && avg < 90)
            System.out.println("Grade B"); // More than or equal to 80 and less than 90 Marks
        else if (avg >= 70 && avg < 80)
            System.out.println("Grade C"); // More than or equal to 70 and less than 80 Marks
        else if (avg >= 60 && avg < 70)
            System.out.println("Grade D"); // More than or equal to 60 and less than 70 Marks
        else if (avg >= 50 && avg < 60)
            System.out.println("Grade E"); // More than or equal to 50 and less than 60 Marks
        else
            System.out.println("Grade F"); // Less than 50 Marks

        n.close(); // Close the Scanner to release resources
    }
}
