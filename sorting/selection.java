package sorting;

public class selection {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            
            for( int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){ //smallest dhoodna hai
                   min=j;
                }
            }
int temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;
        }
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        print(arr);
    }
}
