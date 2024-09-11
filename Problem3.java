public class problem3
{
    public static void main(String[] args)
    {
        final int num = 5814;
        int first = num / 1000;
        int last = num % 10;
        int third = ((num % 100) - last) / 10;
        int second = (num - (first * 1000) - (third * 10) - last) / 100;

        System.out.println("Your four digit number: " + num);
        System.out.println(" ");
        System.out.println("Your four digits in reverse order: ");
        System.out.println(last);
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}
