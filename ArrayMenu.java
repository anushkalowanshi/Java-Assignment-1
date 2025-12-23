package JavaAssignment1;

import java.util.*;

class ArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int n = 5;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Linear Search");
        System.out.println("4.Binary Search");
        System.out.println("5.Max");
        System.out.println("6.Even/Odd Count");
        System.out.println("7.Insertion Sort");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter element:");
                a[n++] = sc.nextInt();
                break;

            case 2:
                System.out.println("Enter index:");
                int idx = sc.nextInt();
                for (int i = idx; i < n - 1; i++)
                    a[i] = a[i + 1];
                n--;
                break;

            case 3:
                System.out.println("Enter key:");
                int key = sc.nextInt();
                for (int i = 0; i < n; i++)
                    if (a[i] == key)
                        System.out.println("Found at index " + i);
                break;

            case 4:
                Arrays.sort(a, 0, n);
                System.out.println("Enter key:");
                key = sc.nextInt();
                int res = Arrays.binarySearch(a, 0, n, key);
                System.out.println(res >= 0 ? "Found" : "Not Found");
                break;

            case 5:
                int max = a[0];
                for (int i = 1; i < n; i++)
                    if (a[i] > max) max = a[i];
                System.out.println("Max = " + max);
                break;

            case 6:
                int even = 0, odd = 0;
                for (int i = 0; i < n; i++)
                    if (a[i] % 2 == 0) even++; else odd++;
                System.out.println("Even: " + even + " Odd: " + odd);
                break;

            case 7:
                for (int i = 1; i < n; i++) {
                    int temp = a[i], j = i - 1;
                    while (j >= 0 && a[j] > temp) {
                        a[j + 1] = a[j];
                        j--;
                    }
                    a[j + 1] = temp;
                }
                break;
        }

        System.out.println("Array:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
