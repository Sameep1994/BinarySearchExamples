public class InfiniSizeArray {
    public static void main(String[] args) {
    int[] ip={10,20,25,50,70,80};
    int key=20;
        System.out.println(findInfArr(ip,key));

    }

  public static int findInfArr(int[]a,int key){
        if(a[0]==key)
            return 0;
        int i=1;
        while (a[i]<key){
            i=i*2;
        }
        if(a[i]==key){
            return i;
        }else
            return binaryRecursive(a,i/2,i,key);
    }
    public static int binaryRecursive(int[] a,int low, int high, int key){
        if(a.length==0) return -1;

        if(low> high) return -1;
        int mid = low+(high-low)/2; //to avoid overflow
        if(a[mid] == key) return mid;
        else if(a[mid]>key)
            return binaryRecursive(a,low,mid-1,key);
        else
            return binaryRecursive(a,mid+1,high,key);
    }
}
