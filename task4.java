import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class task4 {
    Scanner sc = new Scanner(System.in);
    String[] ques = {"Who is the PM of India?", "In which state is the Buland Darwaza located?", "What is the smallest prime number?"};
    String[] ans = {"Narendra Modi", "Uttar Pradesh", "2"};
    String[] options = {
        "Dr. Rajendra Prasad", "Draupadi Murmu", "Amit Shah", "Narendra Modi",
        "Haryana", "Uttar Pradesh", "Telangana", "Karnataka",
        "1", "2", "3", "0"
    };
    int correct = 0, incorrect = 0;
    boolean timeUp = false;
    Timer timer;

    public void Questions() {
        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i] + ": 1)" + options[i * 4] + " 2)" + options[i * 4 + 1] + " 3)" + options[i * 4 + 2] + " 4)" + options[i * 4 + 3]);
            timeUp = false;
            timer = new Timer();
            startCountdown(10); // Start the countdown timer

            boolean answered = false;
            long startTime = System.currentTimeMillis();
            while (!timeUp && (System.currentTimeMillis() - startTime) < 10000) {
                if (sc.hasNextInt()) {
                    int ch = sc.nextInt();
                    ch--;
                    if (options[i * 4 + ch].equals(ans[i])) {
                        correct++;
                        System.out.println("Correct answer");
                    } else {
                        incorrect++;
                        System.out.println("Incorrect answer");
                    }
                    answered = true;
                    break;
                }
            }

            if (!answered) {
                System.out.println("\nTime's up! This question was left unanswered.");
                incorrect++; // Count as incorrect if time runs out
            }

            timer.cancel();
            System.out.println("\n");
        }
    }

    public void startCountdown(int seconds) {
        TimerTask task = new TimerTask() {
            int timeLeft = seconds;

            @Override
            public void run() {
                if (timeLeft > 0) {
                    System.out.print("\rTime left: " + timeLeft + " sec"); // Display time left
                    timeLeft--;
                } else {
                    timeUp = true;
                    timer.cancel();
                    System.out.print("\rTime's up!                          \n"); // Clear line and show "Time's up!"
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // Schedule task every second
    }

    public static void main(String[] args) {
        task4 t4 = new task4();
        t4.Questions();
        System.out.println("Your Score: \tCorrect answers: " + t4.correct + "\tIncorrect answers: " + t4.incorrect);
    }
}