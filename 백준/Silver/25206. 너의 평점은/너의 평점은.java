import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double avg;
        double sumCredit = 0;
        double grade1;

        for (int i = 0; i < 20; i++) {
            String course = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            grade1 = Grade(grade);

            if (grade.equals("P")) {
                sumCredit += 0;
            } else {
                sumCredit += credit;
            }
            sum += (credit * grade1);

        }
        sc.close();

        System.out.printf("%.6f", sum / sumCredit);
    }

    public static double Grade(String grade) {

        double grade1;

        switch (grade) {
            case "A+":
                grade1 = 4.5;
                break;
            case "A0":
                grade1 = 4.0;
                break;
            case "B+":
                grade1 = 3.5;
                break;
            case "B0":
                grade1 = 3.0;
                break;
            case "C+":
                grade1 = 2.5;
                break;
            case "C0":
                grade1 = 2.0;
                break;
            case "D+":
                grade1 = 1.5;
                break;
            case "D0":
                grade1 = 1.0;
                break;
            default:
                grade1 = 0.0;
                break;
        }
        return grade1;
    }
}