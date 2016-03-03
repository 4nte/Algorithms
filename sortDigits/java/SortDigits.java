/*
 * Sorts digits of an integer number in descending order by absolute weight of each digit
 * Bubble sort algorithm model
 */

/**
 *
 * @author Ante Gulin
 * @version 1
 * @date 03.03.2016
 */
public class SortDigit {
    /**
     * @param n non-zero integer 
     * @return integer of sorted digits
     */
    public static int main(int n) {
        int l, r;
        final int size = (int)(Math.log10(n));
        for (int i = 0; i < size; i++) 
            for (int k = i; k < size; k++) {
                r = (int)(n/Math.pow(10,k)%10);
                l = (int)(n/Math.pow(10,k+1)%10);
                if(l < r)
                    n += Math.pow(10,k)*(l-r) + Math.pow(10,k+1)*(r-l);
            }
        return n;
    }

}
