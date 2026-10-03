void main() {
    int[] rawArray = {5645, 554, 8, 45, 12, 100, 589, 31, 245, 365};
    Arrays.sort(rawArray);

    System.out.println(Arrays.toString(rawArray));

    int index = performBinarySearchRecursive(0, rawArray.length - 1, 31, rawArray);

    if (index != -1) {
        System.out.println("The index of the element is: " + index);
    } else {
        System.out.println("The element was not found");
    }

}

private static int performBinarySearchRecursive(int start, int end, int numberToFind, int[] theArray) {
    int mid = (start + end) / 2;

    if (start > end) {
        return -1;
    }

    if (numberToFind == theArray[mid]) {
        return mid;
    } else if (numberToFind < theArray[mid]) {
        end = mid - 1;
    } else if (numberToFind > theArray[mid]) {
        start = mid + 1;
    }

    return performBinarySearchRecursive(start, end, numberToFind, theArray);
}
