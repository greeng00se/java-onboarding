package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem7 {
    private static final int FIRST_FRIEND = 0;
    private static final int SECOND_FRIEND = 1;

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> result = Collections.emptyList();

        Map<String, List<String>> userToFriends = convertToFriendMap(friends);

        return result;
    }

    private static Map<String, List<String>> convertToFriendMap(List<List<String>> friends) {
        HashMap<String, List<String>> userToFriends = new HashMap<>();

        for (List<String> friendPair : friends) {
            addFriendsList(userToFriends, friendPair.get(FIRST_FRIEND), friendPair.get(SECOND_FRIEND));
            addFriendsList(userToFriends, friendPair.get(SECOND_FRIEND), friendPair.get(FIRST_FRIEND));
        }

        return userToFriends;
    }

    private static void addFriendsList(Map<String, List<String>> userToFriends, String user, String friend) {
        userToFriends.computeIfAbsent(user, k -> new ArrayList<>()).add(friend);
    }
}
