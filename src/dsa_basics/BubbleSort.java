package dsa_basics;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={3,4,5,1,6,8};
        arr=sort(arr);
        printArray(arr);
    }

    private static void printArray(int arr[]){
        for(int a:arr)
            System.out.print(a+",");
    }
    public static int []sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr;
    }
}
