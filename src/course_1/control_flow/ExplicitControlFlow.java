package course_1.control_flow;

public class ExplicitControlFlow {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the current iteration
            }
            System.out.println("i: " + i);
        }
    }
}
