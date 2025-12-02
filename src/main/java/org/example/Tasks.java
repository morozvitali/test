package org.example;

public class Tasks {
    // 1. Сума двох чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2. Чи парне число
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 3. Мінімум з двох чисел
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    // 4. Останній символ рядка
    public static char lastChar(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
        return s.charAt(s.length() - 1);
    }

    // 5. Порахувати кількість 'a'
    public static int countA(String s) {
        if (s == null) return 0;

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') count++;
        }
        return count;
    }

    // 6. Перевірити, чи порожній рядок
    public static boolean isEmpty(String s) {
        if (s == null) return false;
        return s.isEmpty();
    }

    // 7. Піднести число до квадрату
    public static int square(int n) {
        return n * n;
    }

    // 8. Реверс рядка (власна реалізація)
    public static String reverse(String s) {
        if (s == null) return null;

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

    // 9. Перший елемент масиву
    public static int first(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array empty");
        }
        return arr[0];
    }

    // 10. Сума всіх елементів масиву
    public static int sumArray(int[] arr) {
        if (arr == null) return 0;

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}