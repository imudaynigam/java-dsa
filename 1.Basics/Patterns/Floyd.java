public class Floyd {

    public static void Pattern(int rows){
        int counter=1;

        for(int i=1; i<=rows; i++){
            for ( int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Pattern(5);
    }
}
