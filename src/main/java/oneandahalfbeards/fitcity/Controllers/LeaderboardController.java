package oneandahalfbeards.fitcity.Controllers;

import oneandahalfbeards.fitcity.HackathonDataGen.LeaderboardGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaderboardController{

    @GetMapping("/leaderBoard")
    public Leaderboard leaderBoard() {
            return new Leaderboard(LeaderboardGenerator.generateLeaderboard());
        }
}
