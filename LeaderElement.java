import java.util.ArrayList;
import java.util.List;

public class LeaderElement {
    public static void main(String[] args) {

    }

    public static void findLeaderElement(int[] arr) {
        List<Integer> leaderList = new ArrayList<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            leaderList.add(arr[i - 1]);
            if (arr[i - 1] > arr[i]) {
                leaderList.add(arr[i]);
            } else {
                for(int j = i; j >= 0; j--){
                    
                }
            }
        }
    }
}
