public class Main {
    public static void main(String[] args) {
            //6 -> 1,2,3  1+2+3 = 6
        int num = 5;
        int sum = 0;

        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum = sum+i;
            }

        }
        if(sum == num){
            System.out.println("It is a perfect number.");
        }
        else {
            System.out.println("It is not a perfect number.");
        }
    }
}