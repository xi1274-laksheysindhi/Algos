package algos.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// take care of 2 conditions
//
public class TownJudge {

    public static void main(String[] args) {
        TownJudge townJudge = new TownJudge();
        townJudge.findJudge(4, new int[][]{{1, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 4}, {4, 3}, {4, 1}});
    }

    int findJudge(int people, int[][] trusts) {
        boolean[] arrayToCheckJudgeTrusts = new boolean[people + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] trust : trusts) {
            arrayToCheckJudgeTrusts[trust[0]] = true;
            map.computeIfAbsent(trust[1], val -> new ArrayList<>()).add(trust[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            List<Integer> valueList = (List<Integer>) entry.getValue();
            if (valueList.size() == people - 1) {
                if (arrayToCheckJudgeTrusts[(int) entry.getKey()] == false) {
                    return (int) entry.getKey();
                }
            }
        }
        return -1;
    }

}
