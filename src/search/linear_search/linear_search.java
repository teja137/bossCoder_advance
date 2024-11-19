package search.linear_search;

public class linear_search {
public static void main(String[] args) {
    
    int[] array = {15,5,20,35,2,42,67,17};
    int findNumber = 42;
    int sizeOfArray = array.length;
    for(int i = 0;i<sizeOfArray;i++){
        if(array[i] == findNumber){
            System.out.println("The index of " + findNumber + " is: " + i);
            break;
        } else {
            System.out.println("The desired number is not there in the array");
        }
    }
}
    
}