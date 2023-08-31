package s3_repetitivas;

public class E03_For {
    public static void main(String[] args) {
        
        for(int c = 1; c <= 9; c++){
            if(c % 2 == 1){
                System.out.println(c + " " + (10 - c) + " <-");
            } else {
                System.out.println(c + " " + (10 - c));
            }

            
        }    
              
    }
}
