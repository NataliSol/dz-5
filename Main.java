public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aSumB = a + b;
        int cSumD = c + d;
        boolean result = aSumB > cSumD;
        System.out.println(result);
        System.out.println(++aSumB > (cSumD-=2));
        System.out.println(aSumB % 2 == 0 || cSumD % 2 == 0);
    }
}
