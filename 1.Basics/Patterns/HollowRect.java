public class HollowRect {
    
    public static void Hollow_Rect(int rows, int cols) {
        //outer loop
        for(int i=1;i<=rows; i++){

            //inner loop - columns
            for (int j=1 ; j <=cols; j++) {

                //cell - (i,j)
                if(i==1 || i==rows || j==1 || j==cols){

                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Hollow_Rect(4,4);
    }

}

