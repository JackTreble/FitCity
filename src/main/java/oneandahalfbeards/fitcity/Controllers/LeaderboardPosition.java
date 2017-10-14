package oneandahalfbeards.fitcity.Controllers;

public class LeaderboardPosition {
    private final String name;
    private final Integer score;

    public LeaderboardPosition(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
