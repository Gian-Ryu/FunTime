public class Test {
    public static void main (String[] args)
    {
        for (int g = 0; g < 4; g++) {
            int rClass = (int) (Math.random() * 18) + (17 * (g + 1));
            System.out.println(rClass);
        }
    }
}
