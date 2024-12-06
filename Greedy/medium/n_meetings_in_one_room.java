package Greedy.medium;

import java.util.ArrayList;
import java.util.List;

public class n_meetings_in_one_room {
    class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int maxMeetings(int start[], int end[]) {
        // Create a list of meetings
        int n = start.length;
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }

        // Sort meetings by their end times
        meetings.sort((a, b) -> a.end - b.end);

        // Initialize variables
        int count = 1; // First meeting is always selected
        int lastEndTime = meetings.get(0).end;

        // Iterate through the sorted meetings
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start > lastEndTime) {
                count++; // Select this meeting
                lastEndTime = meetings.get(i).end; // Update the end time of the last meeting
            }
        }
        return count;
    }
}
