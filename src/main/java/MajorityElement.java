public class MajorityElement {
    public static void main(String[] args) {
        int[] a={8,3,4,8,8};
        System.out.println(MajorityElement(a));
    }

    public static int leader(int[] a) {
        int res = a[0], count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == res) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    res = a[i];
                    count=1;
                }
            }
        }
        return res;
    }

    public static int MajorityElement(int[] a){
        int temp= leader(a);
        int res =0;
        for (int i=0;i<a.length;i++){
            if(a[i]==temp){
                res++;
            }
        }
        return (res>= a.length/2)?temp:-1;
    }
}
