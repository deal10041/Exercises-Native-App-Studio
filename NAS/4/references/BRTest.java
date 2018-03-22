

public class BRTest {

    // properties of class...
    private int calls = 0;
    private int successfulCalls = 0;
    private int totalReturned = 0;
    private int[] exceptCounts = {0,0,0,0,0};

    // methods of class...
    public void callIt() {

        calls += 1;
        int val = 0;

        try {
            val = BadRandom.randVal();
        }
        catch (ArithmeticException a) {
            exceptCounts[0] += 1;
            System.out.println(a);
            return;
        }
        catch (NullPointerException n) {
            exceptCounts[1] += 1;
            System.out.println(n);
            return;
        }
        catch (ArrayIndexOutOfBoundsException a) {
            exceptCounts[2] += 1;
            System.out.println(a);
            return;
        }
        catch (ClassCastException c) {
            exceptCounts[3] += 1;
            System.out.println(c);
            return;
        }
        catch (NegativeArraySizeException n) {
            exceptCounts[4] += 1;
            System.out.println(n);
            return;
        }
        successfulCalls += 1;
        totalReturned += val;
    }

    public void resetCounts() {

        for (int i = 0; i < exceptCounts.length; i++) {
            exceptCounts[i] = 0;
        }
        calls = 0;
        successfulCalls = 0;
        totalReturned = 0;
    }

    public void nRandInts(int n) {

        for (int i = 0; i < n; i++) {
            callIt();
        }
    }

    public void writeData() {

        System.out.println("=============================");
        System.out.println("Total calls: " + calls);
        System.out.println("Succesful calls: " + successfulCalls);
        System.out.println("Total returned: " + totalReturned);
        System.out.println("Percentage Arithmetic Exceptions: " + ((float) exceptCounts[0] / calls * 100));
        System.out.println("Percentage Null Pointer Exceptions: " + ((float) exceptCounts[1] / calls * 100));
        System.out.println("Percentage Array Index Exceptions: " + ((float) exceptCounts[2] / calls * 100));
        System.out.println("Percentage Class Cast Exceptions: " + ((float) exceptCounts[3] / calls * 100));
        System.out.println("Percentage Negative Array Exceptions: " + ((float) exceptCounts[4] / calls * 100));
        System.out.println("Percentage of succesful calls: " + ((float) successfulCalls / calls * 100));
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        BRTest me = new BRTest();
        me.resetCounts();
        me.nRandInts(30);
        me.writeData();
    }
}