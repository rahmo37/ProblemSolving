package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AuthenticationManagerSystem {
    private int timeToLive;
    private Map<String, Integer> tokens;

    public AuthenticationManagerSystem(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId) && tokens.get(tokenId) >= currentTime) {
            tokens.put(tokenId, currentTime + timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        Iterator<Map.Entry<String, Integer>> iterator = tokens.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
                //  Tokens are considered expired if currentTime is greater than or equal to their stored expiration time.
            if (entry.getValue() <= currentTime) {
                // Removes the last item that was returned by the iterator.next
                iterator.remove();
                // When iterator.remove() is called, it removes the current entry from the map. This means the entry is no longer present in the tokens map after the removal.
//              // The iterator provides a direct reference to the entries in the map, so any modification through the iterator (such as removing an entry) directly affects the map.
            }
        }
        return tokens.size();
    }

    public static void main(String[] args) {
        AuthenticationManagerSystem authManager = new AuthenticationManagerSystem(5);
        authManager.generate("token1", 1);
        authManager.generate("token2", 2);
        System.out.println(authManager.countUnexpiredTokens(6)); // Should return 1
        authManager.renew("token2", 7);
        System.out.println(authManager.countUnexpiredTokens(10)); // Should return 1
        authManager.renew("token1", 13);
        System.out.println(authManager.countUnexpiredTokens(15)); // Should return 1
    }
}

