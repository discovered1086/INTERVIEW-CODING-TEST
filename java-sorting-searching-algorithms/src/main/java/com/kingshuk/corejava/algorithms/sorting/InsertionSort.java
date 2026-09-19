void main() {
    int[] rawArray = {5645, 554, 8, 45, 12, 100, 589};
    System.out.println("The Sorted Array is: " + Arrays.toString(performInsertionSort(rawArray)));
}

private static int[] performInsertionSort(int[] rawArray) {
    System.out.println("Before insertion sort: " + Arrays.toString(rawArray));
    for (int i = 1; i < rawArray.length; i++) {
        int temp = rawArray[i];
        int j = i - 1;
        while (j >= 0 && rawArray[j] > temp) {
            rawArray[j + 1] = rawArray[j];
            rawArray[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(rawArray));
    }

    return rawArray;
}
