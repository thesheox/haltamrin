package course_2.encapsolation;

// Usage:
public class Main {
    public static void main(String[] args) {
        User user = new User("John", "john@example.com");
        System.out.println(user.getEmail());
        System.out.println(user.getName());

        user.setEmail("ali@example.com");
        user.setName("ali");
        System.out.println(user.getEmail());
        System.out.println(user.getName());

    }
}