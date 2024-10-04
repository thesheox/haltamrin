package course_2.inheritance;

// Usage:
public class Main {
    public static void main(String[] args) {
        RewardsCreditCard card = new RewardsCreditCard("1234-5678", 1000.0, 0);
        card.makePayment(200);
        card.earnPoints(50);
        System.out.println("Balance: " + card.getBalance());
        System.out.println("Reward Points: " + card.getRewardPoints());
    }
}