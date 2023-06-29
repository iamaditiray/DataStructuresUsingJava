package com.aditi;

public class QuickSort {

    public static int partition(int [] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1; //i is used to create free space for the elements which are less than pivot

        for(int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                //Creating space for elements that are lower than pivot
                i++;
                //If an element is less than pivot, we are swapping the element with that of element in index i
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
            i++; //Creating space for pivot
            //Swapping pivot with that of element in index i
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;

            return i; //Here i is the changed index of pivot
        }
        public static void sort(int [] arr, int low, int high){
            if(low<high){
                int indexOfPivot=partition(arr, low, high);
                //pivot is now already in its required sorted index
                sort(arr, low, indexOfPivot-1); //Sorting of elements that are lower than pivot
                sort(arr, indexOfPivot+1, high);//Sorting of elements that are greater than pivot
            }
        }
    public static void main(String[] args) {
            int []arr={6,3,9,5,2,8};
            int n=arr.length;
            sort(arr, 0, n-1);
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
    }
}

//Average Time Complexity - O(nLog n)
