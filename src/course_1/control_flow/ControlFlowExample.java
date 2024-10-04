package course_1.control_flow;

public class ControlFlowExample {
    public static void main(String[] args) {
        int number = 5;
        // If-else
        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // Switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
