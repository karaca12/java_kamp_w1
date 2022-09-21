public class Main {
    public static void main(String[] args) {
        int num = 25;
        int remain = num%2;
        System.out.println("The number is: "+num);
        boolean isPrime = true;

        if(num<2)
        {
            System.out.println("Invalid number");
        }

        for(int i = 2;i<num;i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }
}