/*Performance of String */
public class StringPerformance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str = str + i;
        }
        /*
         * "" "1" "12" "123" "1234" ...........
         * There are n(n+1)/2 operations are getting performed instead n number of
         * operations just to add it till 10.
         */
        System.out.println(str);
    }
}
