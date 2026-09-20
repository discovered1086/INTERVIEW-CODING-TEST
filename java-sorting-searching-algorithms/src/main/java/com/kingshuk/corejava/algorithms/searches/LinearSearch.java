void main(){
    int[] rawArray = {5645, 554, 8, 45, 12, 100, 589,31, 245, 365};
    Arrays.sort(rawArray);
    int index = performLinearSearch(rawArray, 5645);

    if(index != -1){
        System.out.println("The index of the element is: " + index);
    }else{
        System.out.println("The element was not found");
    }

}

private static int performLinearSearch(int[] rawArray, int numberToFind) {
    int counter = 0;
    int index = -1;
    for(int i = 0; i < rawArray.length; i++){
        counter++;
        if(rawArray[i] == numberToFind){
            index = i;
            break;
        }
    }

    System.out.println("Total loops: "+ counter);

    return index;
}
