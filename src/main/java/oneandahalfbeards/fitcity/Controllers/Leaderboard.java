package oneandahalfbeards.fitcity.Controllers;

import java.util.List;

public class Leaderboard {

    private List<LeaderboardPosition> leaderboard;

    public Leaderboard(List<LeaderboardPosition> leaderboard) {
        this.leaderboard = leaderboard;
    }

    public List<LeaderboardPosition> getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(List<LeaderboardPosition> leaderboard) {
        this.leaderboard = leaderboard;
    }

}
