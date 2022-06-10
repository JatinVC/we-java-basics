public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,34,56,12,34,1,5};
        int[] ascend = ascSort(arr);
        for(int i=0; i<ascend.length; i++){
            System.out.print(ascend[i]);
            System.out.print(',');
        }

        System.out.println();

        int[] descend = descSort(arr);
        for(int i=0; i<descend.length; i++){System.out.print(',');
            System.out.print(descend[i]);
            System.out.print(',');
        }
    }
    /**
     * Sort an array in ascending order and return the sorted array.
     * @param arr list of numbers.
     * @return array sorted in ascending order.
     */
    public static int[] ascSort(int[] arr){
        int[] numbers = arr;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=0; j<numbers.length-i-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * Sort an array in descending order and return the sorted array.
     * @param arr unsorted array.
     * @return sorted array in descending order.
     */
    public static int[] descSort(int[] arr){
        int[] numbers = arr;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=0; j<numbers.length-i-1; j++){
                if(numbers[j] < numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}