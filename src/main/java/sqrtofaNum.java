public class sqrtofaNum {
    public static void main(String[] args) {
        System.out.println(sqRoot(15));
    }

    public static int sqRoot(int x){
        int low=1,high=x;
        if(x==0||x==1)
            return x;

        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(mid*mid == x) return mid;
            if(mid*mid<x){//since we are returning floor it might not be perfect sqrt in that case lower bound is answer
                low=mid+1;
                ans=mid;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
}
