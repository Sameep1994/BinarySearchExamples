public class NumberOfOnes {
    public static void main(String[] args) {
        int[] ip ={0,0,0,1,1,1,1,1,1};
        int key=1;
        int low=0;
        int high=ip.length-1;
        System.out.println(binaryRecursive(ip,low,high,key));
    }

    public static int binaryRecursive(int[] a,int low, int high, int key){
        if(a.length==0) return -1;

        if(low> high) return -1;
        int mid = low+(high-low)/2; //to avoid overflow
        if(a[mid] == key &&(mid==0 || a[mid-1]!=key)) return a.length-mid;
        else if(a[mid]>=key)
            return binaryRecursive(a,low,mid-1,key);
        else
            return binaryRecursive(a,mid+1,high,key);
    }
}
