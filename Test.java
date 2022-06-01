package problem61;

public class Test {
    public static void main(String[] args) {
        NumberSequence numSeq = new NumberSequence(28, new Pentagon());
        for (int num : numSeq) {
            System.out.println(num);
            if (num == 2882) {
                System.out.println("Test 1 passed");
                break;
            }
        }
    }
}
