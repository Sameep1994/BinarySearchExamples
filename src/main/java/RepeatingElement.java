public class RepeatingElement {
    public static void main(String[] args) {
        int[] a = {1,3,2,4,6,5,7,3};
        System.out.println(rep(a));
    }

    //here we are using same logic as we use in linked list to find loop, once both fast and slow meet we move one at a time till they meet
    public static int rep(int[] a) {
        int slow = a[0], fast = a[0];
        //fast moving at twice the speed,till they meet
        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (fast != slow);
//once met move one at a time
        slow = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }
}
