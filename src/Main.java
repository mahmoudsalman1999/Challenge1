import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] numbers={-1,0,1,2,-1,-4};
        int target=-4;
        List<List<Integer>> list= TargetSum.findTrip(numbers , target);
        System.out.println("Triplets that sum up to "+ target + " : ");
        for (List<Integer> tri : list ){
            System.out.println(tri);
        }
    }
}