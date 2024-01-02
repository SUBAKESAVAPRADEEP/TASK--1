package Task;

public class Reverse {
    public static void main(String[] args) {
        
        //876
int number=876;
System.out.println("Input"+number);
int remainder=0,reverseNum=0;
for(;number!=0;number=number/10){
    remainder=number%10;
    reverseNum=reverseNum*10+remainder;
}
     System.out.println("output"+reverseNum) ;
        }
        }




