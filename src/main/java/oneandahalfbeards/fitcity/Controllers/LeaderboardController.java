package oneandahalfbeards.fitcity.Controllers;

import oneandahalfbeards.fitcity.HackathonDataGen.LeaderboardGenerator;
import org.springframework.web.bind.annotation.RequestMapping;


public class LeaderboardController{

        @RequestMapping("/leaderBoard")
        public Leaderboard leaderBoard() {
            return new Leaderboard(LeaderboardGenerator.generateLeaderboard());
        }
}
