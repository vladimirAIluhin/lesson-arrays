public class Exercise1 {
    public static void main(String[] arg) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7};
        int[] secondArray = {1, 2, 3, 4, 5, 6, 7};
        int[] summaryArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            summaryArray[i] = firstArray[i] + secondArray[i];
            System.out.println("Summary element [" + i + "]=" + summaryArray[i]);
        }
    }
}
