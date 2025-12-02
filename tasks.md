⭐ А тепер — 10 дуже простих завдань із самого базового рівня

Це рівень "розігрів перед серйозними тестами".
Кожне завдання — один метод, лаконічне рішення.

## Завдання 1. Сума двох чисел

Метод: sum(int a, int b)
Повернути: суму.

    public static int sum(int a, int b) {
        return a + b;
    }


## Завдання 2. Чи парне число?

Метод: isEven(int n)
Повернути: true/false.

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

## Завдання 3. Мінімум з двох чисел

Метод: min(int a, int b)

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

## Завдання 4. Останній символ строки

Метод: lastChar(String s)
Якщо s пуста → кинути IllegalArgumentException

    public static char lastChar(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
        return s.charAt(s.length() - 1);
    }

## Завдання 5. Порахувати кількість символів 'a' у рядку

Метод: countA(String s)

    public static int countA(String s) {
        if (s == null) return 0;

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') count++;
        }
        return count;
    }

## Завдання 6. Перевірити, чи рядок порожній

isEmpty(String s)
Справжня логіка:

null → false

"" → true

" " → false

    public static boolean isEmpty(String s) {
        if (s == null) return false;
        return s.isEmpty();
    }

## Завдання 7. Піднести число до квадрату

square(int n) → n*n

    public static int square(int n) {
        return n * n;
    }

## Завдання 8. Реверс рядка

reverse(String s)
Без StringBuilder.reverse — власна реалізація.

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


## Завдання 9. Перший елемент масиву

first(int[] arr)
Якщо arr порожній → кинути exception.

    public static int first(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array empty");
        }
        return arr[0];
    }

## Завдання 10. Сума всіх елементів масиву

sumArray(int[] arr)

    public static int sumArray(int[] arr) {
        if (arr == null) return 0;

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}
