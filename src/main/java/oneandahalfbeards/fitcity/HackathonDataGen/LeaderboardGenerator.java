package oneandahalfbeards.fitcity.HackathonDataGen;

import oneandahalfbeards.fitcity.Controllers.LeaderboardPosition;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LeaderboardGenerator {

    private static final int min = 1000;

    private static final int max = 10000;


    public static List<LeaderboardPosition> generateLeaderboard() {


        List<String> wards = Arrays.asList("Windmill Hill",
                "Filwood",
                "Southmead",
                "Easton",
                "Brislington East",
                "Stockwood",
                "Bishopston & Ashley Down",
                "St George Troopers Hill",
                "Hartcliffe & Withywood",
                "Horfield",
                "Knowle",
                "Redland",
                "Ashley",
                "Lawrence Hill",
                "Lockleaze",
                "St George Central",
                "Frome Vale",
                "Clifton",
                "Clifton Down",
                "Southville",
                "Cotham",
                "Brislington West",
                "Hotwells & Harbourside",
                "St George West",
                "Henbury & Brentry",
                "Hengrove & Whitchurch Park",
                "Hillfields",
                "Bedminster",
                "Central",
                "Avonmouth & Lawrence Weston",
                "Stoke Bishop",
                "Bishopsworth",
                "Eastville",
                "Westbury-on-Trym & Henleaze");


        List<LeaderboardPosition> lbps = new ArrayList<>();
        for (String ward : wards) {
            lbps.add(new LeaderboardPosition(ward, ThreadLocalRandom.current().nextInt(min, max + 1)));
        }

        Comparator c = (Comparator<LeaderboardPosition>) (o1, o2) -> o2.getScore().compareTo(o1.getScore());
        Collections.sort(lbps, c);
        return lbps;


    }

}
