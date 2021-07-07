public class PeakElement {
    public static void main(String[] args) {
        //int[] ip={10,20,15,5,23,90,67};
        int[] ip={7,8,20};
        int n=ip.length;
        System.out.println(findPeakElement(ip,0,n-1));
    }
/*we have chunks of sorted elements inside the array, we are searching fr mid and comparing with next element
if mid element is smaller we are moving to right side of array
 else to left with each call we are elemenating half of elements
*/



/*
An element is peak if its gt its neighbour

its based on property that if the left neighbour of element is gt or equal to curr there will be a peak on left or in right
 */
public static int findPeakElement(int[] A, int left, int right)
{
    int n= A.length;
    while (left<=right) {
        int mid = (left + right) / 2;
        if ((mid == 0 || A[mid - 1] <= A[mid]) &&
                (mid == n-1 || A[mid + 1] <= A[mid])) {
            return mid;
        }
        else if (mid  > 0 && A[mid - 1] >= A[mid]) {
            right=mid-1;
        }
        else {
            left = mid + 1;
        }
    }
    return -1;
}
}
