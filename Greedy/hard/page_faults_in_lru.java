package Greedy.hard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class page_faults_in_lru {
    static int pageFaults(int N, int C, int pages[]){
       Set<Integer> memory = new HashSet<>();
        // Queue to track the order of page usage
        LinkedList<Integer> usageOrder = new LinkedList<>();

        int pageFaults = 0;

        for (int page : pages) {
            // If the page is not already in memory
            if (!memory.contains(page)) {
                pageFaults++; // Increment page fault count

                // If memory is full, remove the least recently used page
                if (memory.size() == C) {
                    int lru = usageOrder.pollFirst(); // Get the least recently used page
                    memory.remove(lru); // Remove it from memory
                }

                // Add the new page to memory
                memory.add(page);
            } else {
                // If the page is already in memory, remove it from the queue
                // (to update its position as recently used)
                usageOrder.remove((Integer) page);
            }

            // Add the current page as the most recently used
            usageOrder.addLast(page);
        }

        return pageFaults;
    }
}
