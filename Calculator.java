public class Calculator {
    public static void main(String args[])
    {
        System.out.println(add(4,5));
        System.out.println(subtract(6,3));
    }

    static int add(int a, int b)
    {
        return a+b;
    }

    static int subtract(int a, int b)
    {
        return a - b;
    }

    static int multiply(int a, int b)
    {
	return a*b;
    }
}
