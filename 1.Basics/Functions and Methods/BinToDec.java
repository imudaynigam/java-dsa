public class BinToDec{

    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int LastDigit=binNum%10;
            decNum=decNum + (LastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal Number: "+ decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}