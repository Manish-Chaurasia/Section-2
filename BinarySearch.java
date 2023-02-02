public class BinarySeach{
    public static void main(String[] args){

        int[] a = {10,20,30,50,60,40};
        int item = 30;
        int last = a.length-1;
        int i = BinarySearch(a ,0,last, item);
    
    }

    public static int BinarySeach(int[] arr , int first,int last ,int item){
        int mid = (first + last)/2;
        while(first <= last){
            if(arr[mid] < key){
                first = mid +1;

            }else if(arr[mid] == key){
                System.out.println("Element found at index "+mid);
                break;
            }else{
                last = mid -1;
            }
            mid = (first + last)/2;
        }
        if(first > last){
            System.out.println("Element is not found");
        }
    }


}