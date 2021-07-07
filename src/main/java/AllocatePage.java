public class AllocatePage {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int n =a.length;
        int k=2;

        //System.out.println(minPageRec(a,n,k));
        System.out.println(minPages(a,n,k));
    }

    /*We are given a array which depects the number of pages in books, and k as number of students
    * we have to divide this array among k students such that max pages amaong k student is minimum possible
    * basiccaly with n elements and n-1 spaces we have to make k-1 cuts*/
    public static boolean isFeasible(int arr[],int n,int k, int ans){
        int req=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                //if it exceeds we include a new student and sum for the new students starts from curr value
                req++;
                sum=arr[i];
            }
            else{
                //check if a num can be included
                sum+=arr[i];
            }
        }
        return (req<=k);
    }

    public static int minPages(int arr[],int n, int k){
        int sum=0,mx=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            mx=Math.max(mx,arr[i]);
        }
        int low=mx,high=sum,res=0;

        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }






    //----------inefficient------------

    public static int minPageRec(int[] a,int n,int k){
        if(k==1)
            return sum(a,0,n-1);
        if(n==1)
            return a[0];
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            //since we cant make cut at 0 we are making cut at 1 and computing sum for each cut and taking max and compute the min with the temp result
            res=Math.min(res,Math.max(minPageRec(a,i,k-1),sum(a,i,n-1)));
        }
        return res;
    }

    public static int sum(int[] a,int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=a[i];
        }
        return sum;
    }
}
