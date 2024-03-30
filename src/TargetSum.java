import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static List<List<Integer>> findTrip(int[] numbers, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++)
            if (i == 0 || (i > 0 && numbers[i] != numbers[i - 1])) {
                int left = i + 1, right = numbers.length - 1;
                int newTarget = target - numbers[i];
                while (left < right) {
                    int sum = numbers[left] + numbers[right];
                    if (sum == newTarget) {
                        list.add(Arrays.asList(numbers[i], numbers[left], numbers[right]));
                        while (left < right && numbers[left] == numbers[left + 1]) left++;
                        while (left < right && numbers[right] == numbers[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < newTarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        return list;
    }
}
