public class ThreeSum {
    public static void main(String[] args) {
        int[] ip={1,2,3,4,5,6,7,8,9,20};
        int key=6;
        System.out.println(three(ip,key));
    }
    public static boolean three(int[]a,int key){
        boolean ans=false;
        for(int i=0;i<a.length;i++){
         ans=isPair(a,key-a[i],i+1,a.length-1);
         if(ans==true){
             break;
         }
        }
        return ans;
    }

    public static boolean isPair(int[]a,int key,int start,int end){
        boolean ans=false;
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
