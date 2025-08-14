package dsa_basics;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,9,8};
        arr=sort(arr);
        printArray(arr);
    }
    private static void printArray(int arr[]){
        for(int a:arr)
            System.out.print(a+",");
    }

    //Find the smallest and then order items
    public static int[] sort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[smallest]>arr[j])
                    smallest=j;

            int t=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=t;
        }
        return arr;
    }
}
