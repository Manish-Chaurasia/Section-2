public class BinarySeach{
    public static void main(String[] args){

        do{
            System.out.println("Press 1 for Linear Search");
            System.out.println("Press 2 for Binary Search");
            System.out.println("Press 3 to Exit");
        int ch =1;
        
        switch(ch){
           
            case 1 : int[] a = {10,20,30,50,60,40};
                     int item = 30;
                    linearSearch(a,item);
                    break;

            case 2 :  int[] a = {10,20,30,50,60,40};
                    int item = 30;
                    int last = a.length-1;
                    int i = BinarySearch(a ,0,last, item); 
                    break;

            default : System.out.println("Invalid input");
                    break;

        }
        }while(ch==3)
    
    }

    public static int linearSearch(int[] arr , int item){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
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