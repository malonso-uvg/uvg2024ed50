public class BubbleSort{

    public static int[] Sort(int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length - 1; i++){
            for (int j = i + 1; j < unsortedArray.length; j++){
                if (unsortedArray[i] > unsortedArray[j]){
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }
}