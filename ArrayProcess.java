import java.util.*;

public class ArrayProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int processCount = 0;

        // Process until array has 1 element left
        while (arr.size() > 1) {
            int first = arr.get(0);
            int second = arr.get(1);

            if (first > second) {
                // shift first to last
                arr.remove(0);
                arr.add(first);
                processCount++;
            } else if (first < second) {
                // remove first
                arr.remove(0);
                processCount++;
            } else {
                // equal case -> stop (or break condition)
                break;
            }
        }

        System.out.println("Final Array: " + arr);
        System.out.println("Total Processes: " + processCount);
    }
}
