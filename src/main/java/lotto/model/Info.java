package lotto.model;

import lotto.vo.CommonUnits;
import lotto.vo.Grade;

public class Info {
    private int[] statistic;
    private int rewards;

    public Info() {
        this.statistic = new int[CommonUnits.NUM_OF_GRADES+1];
        this.rewards = 0;
    }

    public void addStatistic(Grade grade) {
        statistic[grade.getGrade()]++;
        rewards += grade.getPrice();
    }

    public int[] getStatistic() {
        return statistic;
    }

    public int getRewards() {
        return rewards;
    }
}