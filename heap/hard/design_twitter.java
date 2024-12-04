package heap.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class design_twitter {
    private static class Tweet {
        int tweetId;
        int timestamp;
        
        Tweet(int tweetId, int timestamp) {
            this.tweetId = tweetId;
            this.timestamp = timestamp;
        }
    }
    
    private Map<Integer, List<Tweet>> userTweets; // Maps userId to their tweets
    private Map<Integer, Set<Integer>> followMap; // Maps userId to the set of followees
    private int timestamp; // Global timestamp for tweets

    public design_twitter() {
        userTweets = new HashMap<>();
        followMap = new HashMap<>();
        timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {
        userTweets.putIfAbsent(userId, new ArrayList<>());
        userTweets.get(userId).add(new Tweet(tweetId, timestamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> minHeap = new PriorityQueue<>((a, b) -> a.timestamp - b.timestamp);

        // Add the user's own tweets
        if (userTweets.containsKey(userId)) {
            for (Tweet tweet : userTweets.get(userId)) {
                minHeap.add(tweet);
                if (minHeap.size() > 10) minHeap.poll(); // Maintain only 10 most recent
            }
        }

        // Add tweets from followees
        if (followMap.containsKey(userId)) {
            for (int followeeId : followMap.get(userId)) {
                if (userTweets.containsKey(followeeId)) {
                    for (Tweet tweet : userTweets.get(followeeId)) {
                        minHeap.add(tweet);
                        if (minHeap.size() > 10) minHeap.poll();
                    }
                }
            }
        }

        // Extract tweets from the heap (most recent first)
        List<Integer> newsFeed = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            newsFeed.add(0, minHeap.poll().tweetId); // Add at the start to reverse the order
        }
        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}
