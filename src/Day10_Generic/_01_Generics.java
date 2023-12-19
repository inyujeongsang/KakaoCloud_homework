package Day10_Generic;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스
        int[] iArr = {1,2,3,4,5};
        double[] dArr = {1.0,2.0,3.0,4.0,5.0};
        String[] sArr = {"A","B","C","D","E"};

        Integer[] wrapiArr = {1,2,3,4,5};
        Double[] wrapdArr = {1.0,2.0,3.0,4.0,5.0};

        printIntArr(iArr);
        printDoubleArr(dArr);
        printStringArr(sArr);

        //제네릭스가 지원하는 건 객체!
        //기본자료형은 쓸 수 없다. 래퍼클래스를 써야된다. 첫문자가 대문자!
        System.out.println("\n"+"----------------");
        printAnyArr(wrapiArr);
        printAnyArr(wrapdArr);
        printAnyArr(sArr);
    }

    // T : Type
    private static <T> void printAnyArr(T[] arr){
        for (T t: arr) {
            System.out.print(t+ " ");
        }
    }
    private static void printStringArr(String[] sArr) {
        for (String i: sArr) {
            System.out.print(i+ " ");
        }
    }

    private static void printDoubleArr(double[] dArr) {
        for (double i: dArr) {
            System.out.print(i+ " ");
        }
    }

    private static void printIntArr(int[] iArr) {
        for (int i: iArr) {
            System.out.print(i+ " ");
        }
    }
}
