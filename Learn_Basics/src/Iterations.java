public class Iterations {
    public static void main(String[] args) {
        // Iterative statements are same as in C
        // Also jump statements Break, Continue
        // nested loops can also be performed
        //int n=5;
        int sum=0;
        int i=1;

        for(i=1;i<=5;i++){
            sum+=i;
            if(i==3){ //Skips 3 and continue iteration
                continue;
            }
            if(i==4){ //Stops at 4
                break;
            }
        }
        /*
        int n=5;
        while( i<=n){
            sum+=i;
            i++;
        }
        do{
            sum+=i;
            i++;
        }while(i<=n);
        */

        System.out.println("The sum of 5 values is : " +sum);

    }

}
