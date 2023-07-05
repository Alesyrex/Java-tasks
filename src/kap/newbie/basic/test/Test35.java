package kap.newbie.basic.test;

/**
 * Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void. Возвращать:
 *
 * - Для числовых типов — тот же тип. Даже если это ведет к потере точности.
 * При угрозе потери данных — выводить сообщение в консоль и возвращать текущий результат (для byte, short, int);
 * - Для boolean — определение истинности всех переданных параметров,
 * принимая то, что их стоит объединять через логическое И;
 * - Для char — строку, полученную в результате конкатенации всех переданных параметров.
 *
 * Количество параметров может быть любым. Используйте перегрузку — у всех методов должны быть одинаковые названия.
 *
 * Примечание: это задача без вариантов, методы для всех типов должны быть реализованы в одной программе.
 *
 * @author Alexandr Korovkin
 */
public class Test35 {

    public static final String OVERFLOW = "Overflow! Output previous value: ";

    public static void main(String[] args) {
        System.out.println(sumCalculation('A','l','e','x'));
        System.out.println(sumCalculation((byte) 1, (byte)2, (byte)3, (byte)4, (byte)127));
        System.out.println(sumCalculation((short)15, (short)62, (short)3300, (short)1400, (short)32000));
        System.out.println(sumCalculation(256, 254, 567, 1236));
        System.out.println(sumCalculation(1.5f, 65.3f, 12.4f));
        System.out.println(sumCalculation(true,true,true,true));
        System.out.println(sumCalculation(23.3, 45.2, 55.7, 13.2));
        System.out.println(sumCalculation(12345L, 567457L, 7654345L));
    }

    public static String sumCalculation(char ...a){
        if (a.length == 0) {
            return "";
        }
        String result = "";
        for (char b : a) {
            result += b;
        }
        return result;
    }

    public static byte sumCalculation(byte ...a){
        if (a.length == 0) {
            return 0;
        }
        byte result = 0;
        for (byte b : a) {
            if (isLimit(Byte.MIN_VALUE, Byte.MAX_VALUE, result, b)) {
                System.out.print(OVERFLOW);
                return result;
            }
            result += b;
        }
        return result;
    }

    public static short sumCalculation(short ...a){
        if (a.length == 0) {
            return 0;
        }
        short result = 0;
        for (short b : a) {
            if (isLimit(Short.MIN_VALUE, Short.MAX_VALUE, result, b)) {
                System.out.print("Overflow! Output previous value: ");
                return result;
            }
            result += b;
        }
        return result;
    }

    public static int sumCalculation(int ...a){
        if (a.length == 0) {
            return 0;
        }
        int result = 0;
        for (int b : a) {
            if (isLimit(Integer.MIN_VALUE, Integer.MAX_VALUE, result, b)) {
                System.out.print("Overflow! Output previous value: ");
                return result;
            }
            result += b;
        }
        return result;
    }

    public static long sumCalculation(long ...a){
        if (a.length == 0) {
            return 0L;
        }
        long result = 0L;
        for (long b : a) {
            result += b;
        }
        return result;
    }

    public static float sumCalculation(float ...a){
        if (a.length == 0) {
            return 0.0f;
        }
        float result = 0.0f;
        for (float b : a) {
            result += b;
        }
        return result;
    }

    public static double sumCalculation(double ...a){
        if (a.length == 0) {
            return 0.0;
        }
        double result = 0.0;
        for (double b : a) {
            result += b;
        }
        return result;
    }

    public static boolean sumCalculation(boolean ...a){
        if (a.length == 0) {
            return true;
        }
        boolean result = true;
        for (boolean b : a) {
            result &= b;
        }
        return result;
    }

    public static boolean isLimit(long minValue, long maxValue, long currentValue, long nextValue){
        long result = currentValue + nextValue;
        return result < minValue || result > maxValue;
    }
}
