package search.binary_search;

public class binary_search {

    public static void main(String[] args) {
        int[] array = {5,9,17,23,25,45,59,63,71,89};
        int find = 5;
        int sizeOfArray = array.length;
        int left = 0;
        int right = sizeOfArray-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(find == array[mid]){
                System.out.println("The find index is: "+mid);
                return;
            } else if(find < array[mid]){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(-1);
    }
}