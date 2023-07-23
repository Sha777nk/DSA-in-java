public class arr_2 {
    public static void insert_at_index(int arr[], int index, int num){
        int size=(arr.length)+1;
        int [] temp= new int[size];
        for(int i=0;i<arr.length;i++){
            if(i<index){
                temp[i]=arr[i];
            }
            else if(index==i){
                temp[i]=num;
            }
            else{
                temp[i+1]=arr[i];
            }
            temp[index+1]=arr[index];
            
        }

        for ( int i=0;i<size;i++) {
            System.out.println(temp[i]+",");
        }
        
        

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        insert_at_index(arr, 4, 30);
}
}
