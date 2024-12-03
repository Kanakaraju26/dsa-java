package heap.medium;

import java.util.Arrays;
import java.util.HashMap;

public class hand_of_straights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        Arrays.sort(hand);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int data : hand) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        for (int data : hand) {
            if (map.getOrDefault(data, 0) != 0) {
                for (int i = 0; i < groupSize; i++) {
                    if (map.getOrDefault(data + i, 0) == 0) {
                        return false;
                    }
                    map.put(data + i, map.get(data + i) - 1);
                }
            }

        }
        return true;
    }
}
