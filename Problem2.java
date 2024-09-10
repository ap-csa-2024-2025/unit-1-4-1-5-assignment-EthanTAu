public class problem2
{
    public static void main(String[] args)
    {
        final int num = 456;
        int first = num/100;
        int last = num % 10;
        int second = (num - (first*100) - last)/10;

        System.out.println("Three digit number: " + num);
        System.out.println("Here are the digits: ");
        System.out.println(first);
        System.out.println(second);
        System.out.println(last);
    }
}
