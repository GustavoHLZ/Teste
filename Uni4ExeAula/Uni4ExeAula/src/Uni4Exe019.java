import java.util.Scanner;

public class Uni4Exe019{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int x,y;
        System.out.println("x = ");
        x = l.nextInt();
        System.out.println("y = ");
        y = l.nextInt();
        if(x == 0 && y ==0){
          System.out.println("QUADRANTE 0");
        }
        else if(x >0 && y > 0){
          System.out.println("QUADRANTE 1");
        }
        else if( x < 0 && y > 0 ){
          System.out.println("QUADRANTE 2");

        } else if(x < 0 && y < 0){
          System.out.println("QUADRANTE 3");

        } else{
          System.out.println("QUADRANTE 4");
        }
        l.close();
        

      }
    }

    
      



 
    
    

