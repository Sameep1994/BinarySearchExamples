public class CountOccurence {
    public static void main(String[] args) {
        int[] ip={2,3,3,3,3,4,5};
        int left=binaryRecursiveleft(ip,0, ip.length,3);
        int right=binaryRecursiveRight(ip,0, ip.length,3);
        int res=right-left+1;
        System.out.println(res);
    }
    public static int binaryRecursiveleft(int[] a,int low, int high, int key){
        if(a.length==0) return -1;

        if(low> high) return -1;
        int mid = low+(high-low)/2; //to avoid overflow
        if(a[mid] == key &&(mid==0 || a[mid-1]!=key)) return mid;
        else if(a[mid]>=key)
            return binaryRecursiveleft(a,low,mid-1,key);
        else
            return binaryRecursiveleft(a,mid+1,high,key);
    }

    public static int binaryRecursiveRight(int[] a,int low, int high, int key){
        if(a.length==0) return -1;

        if(low> high) return -1;
        int mid = low+(high-low)/2; //to avoid overflow
        if(a[mid] == key &&(mid==a.length-1 || a[mid+1]!=key)) return mid;
        else if(a[mid]>key)
            return binaryRecursiveRight(a,low,mid-1,key);
        else
            return binaryRecursiveRight(a,mid+1,high,key);
    }
}
