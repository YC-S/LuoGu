import java.util.*;

public class P1036_选数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        int[] array = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            set.add(array[i]);
        }
        allPermutations(set, list, k);
        System.out.println(list.size());
    }

    private static void allPermutations(Set<Integer> set, List<List<Integer>> list, int k) {
        for (int i : set) {
            int count = 0;
            List<Integer> tmp = new ArrayList<>();
            while (count < k) {
                tmp.add(i);
                count++;
            }
            if (check(tmp)) {
                list.add(tmp);
            }
            tmp.remove(count - 1);
        }
    }

    private static boolean check(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        for (int i = 2; i < sum / 2; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
