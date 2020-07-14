package String;

public class Offer {
    public static void main(String[] args) {
//        System.out.println(fib(45));
//        System.out.println(fib1(45));
        System.out.println(numWays(36));
    }

    public  static int numWays(int n) {
        if(n<=1){
            return 1;
        }if(n==2){
            return 2;
        }
        int a=1,b=2,sum=0;

        if(n>2){
            for(int i=3;i<=n;i++){
                sum=a+b;
                a=b;
                b=sum;
            }
        }
        return sum%1000000007;
    }
    public static int fib1(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);


    }



    public static int fib(int n) {
        int a=0;
        int b=1;
        int sum=0;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;

    }
}
