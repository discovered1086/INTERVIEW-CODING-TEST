void main(){
    int[] rawArray = {5645, 554, 8, 45, 12, 100, 589,31, 245, 365};
    Arrays.sort(rawArray);

    int index = performBinarySearch(rawArray, 5645);

    if(index != -1){
        System.out.println("The index of the element is: " + index);
    }else{
        System.out.println("The element was not found");
    }

}

private static int performBinarySearch(int[] rawArray, int numberToFind) {
    int counter = 0;
    int index = -1;
    int start = 0;
    int end = rawArray.length - 1;
    int mid = (start + end) / 2;

    while (start <= end) {
        counter++;
        if(numberToFind == rawArray[mid]){
            index = mid;
            break;
        }else if(numberToFind < rawArray[mid]){
            end = mid - 1;
            mid = (start + end) / 2;
        }else if(numberToFind > rawArray[mid]){
            start = mid + 1;
            mid = (start + end) / 2;
        }
    }



    System.out.println("Total loops: "+ counter);

    return index;
}
