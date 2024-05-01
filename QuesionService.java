import java.util.Scanner;

public class QuesionService {

    Quesion[] quesions = new Quesion[5];
    String selection[] = new String[5];

    public QuesionService() {
        quesions[0] = new Quesion(1, "what is 1 ", "Java", "CPP", "pythos", "sdddd", "java");
        quesions[1] = new Quesion(2, "what", "Java", "CPP", "pythos", "sdddd", "java");
        quesions[2] = new Quesion(3, "what", "Java", "CPP", "pythos", "sdddd", "java");
        quesions[3] = new Quesion(4, "what", "Java", "CPP", "pythos", "sdddd", "java");
        quesions[4] = new Quesion(5, "what", "Java", "CPP", "pythos", "sdddd", "java");
    }

    public void displayQuestion() {

        int i = 0;
        for (Quesion q : quesions) {
            System.out.println("No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < quesions.length; i++) {
            Quesion que = quesions[i];
            String answer = que.getAnswer();

            String userAnswer = selection[i];

            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("your score is: " + score);

    }
}
