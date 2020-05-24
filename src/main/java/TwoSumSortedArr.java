public class TwoSumSortedArr {
    public static void main(String[] args) {
        int[] ip={1,2,3,4,5,6,7,8,9,20};
        int key=28;
        System.out.println(isPair(ip,key));
    }

    public static boolean isPair(int[]a,int key){
        boolean ans=false;
        int start=0,end=a.length-1;
        while (start<end){
            if(a[start]+a[end]==key) {
                ans = true;
                return ans;
            }
            else if(a[start]+a[end]>key){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
}
