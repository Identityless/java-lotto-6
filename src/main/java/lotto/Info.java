package lotto;

public class Info {
    private static final int NUM_OF_GRADES = 5;
    private int numOfLotto;
    private int[] statistics;
    private int rewards;

    public Info(int numOfLotto) {
        this.numOfLotto = numOfLotto;
        this.statistics = new int[NUM_OF_GRADES+1];
        this.rewards = 0;
    }

    public void addStatistic(Grade grade) {
        statistics[grade.getGrade()]++;
        rewards += grade.price;
    }

    public int[] getStatistics() {
        return statistics;
    }
}