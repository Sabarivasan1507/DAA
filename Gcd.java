public class Gcd{

 

    public static void main(String[] args){
 

        int a= 10,n1=a;
 

        int b= 3,n2=b;
 

        while (a>0 && b>0){
 

            if(a>b){
 

                a=a%b;
 

            }
 

            else{
 

                b=b%a;
 

            }
 

        }
 

        if(a==0){
 

            System.out.println("GCD of "+ n1 + "and"+ n2 + "is" +b);
 

        }
 

        else{
 

            System.out.println("GCD of"+ n1 + "and"+ n2 + "is" +a);
 

        }
 


 

    }
 


 

}
