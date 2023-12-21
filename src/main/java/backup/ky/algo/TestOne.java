package backup.ky.algo;

/**
 * @author lfqtm
 */
public class TestOne {

    public static void main(String[] args) {
//        System.out.println(4 << 1);
//        System.out.println((4 >> 1) | 1);
//        System.out.println(4 | 1); // +1

        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 100)); // [0,99]
        }
    }
}
