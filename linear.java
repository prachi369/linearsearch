public class linear {
    public static int check(int arr[],int key){
for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
return i;
    }
}
    return-1;

    }

    public static void main(String[] args) {
        int arr[]={1,4,8};
        int key=8;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
check(arr,key);

   System.out.println("key is found at index:"+check(arr,key)); 
}
    }
    

