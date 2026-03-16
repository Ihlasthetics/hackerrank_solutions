package easy;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int sock: ar){
            map.put(sock, map.getOrDefault(sock, 0) + 1);
        }

        int pairs = 0;

        for(int count : map.values()){
            pairs += count / 2;
        }

        return pairs;
    }
}

