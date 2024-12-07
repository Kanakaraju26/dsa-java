package Greedy.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class job_sequencing_problem {
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        // Your code here
         Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        
        // Create an array to keep track of free time slots
        boolean[] slot = new boolean[n];  // We have n available slots (1 unit of time per job)
        Arrays.fill(slot, false);  // Initially all slots are free

        int jobsDone = 0;
        int totalProfit = 0;

        // Go through all the jobs
        for (int i = 0; i < n; i++) {
            // Find a slot for the job
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                // If slot is available, assign the job to this slot
                if (!slot[j]) {
                    slot[j] = true;
                    jobsDone++;
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(jobsDone);
        arr.add(totalProfit);
        
        // Return the number of jobs done and the total profit
        return arr;
    }
}
