import java. util.

public class RemoveDuplicates {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input: size of array
int N = sc.nextInt();

// Input: array elements
int[] arr = new int[N];
for (int i = 0; i < N; i++) {
arr[i] = sc.nextInt();

}

// Use LinkedHashSet to preserve order and re
LinkedHashSet<Integer> set = new LinkedHashSe
for (int num : arr) {
set.add(num);

}

// Print elements after removing duplicates
for (int num : set) {
System.out.print(num + " ");

sc.close();
