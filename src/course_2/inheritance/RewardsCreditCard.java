package course_2.inheritance;

// Derived class
class RewardsCreditCard extends CreditCard {
    private int rewardPoints;

    public RewardsCreditCard(String cardNumber, double balance, int rewardPoints) {
        super(cardNumber, balance);  // Call to superclass constructor
        this.rewardPoints = rewardPoints;
    }

    public void earnPoints(int points) {
        rewardPoints += points;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}