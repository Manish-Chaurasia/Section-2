public class LinerSeach{
    public static void main(String[] args){

        int[] a = {10,20,30,50,60,40};
        int item = 30;
        int i = linearSearch(a , item);
        System.out.println(item +" is found at index "+ i);
    }

    public static int linerSeach(int[] arr , int item){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }

}