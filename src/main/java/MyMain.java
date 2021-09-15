import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int bin = Integer.parseInt(binary);
        int power = 0;
        int total = 0;
        while (bin>0){
            int last= bin%10;
            total+= last * (int)Math.pow(2,power);
            bin/=10;
            power +=1;
        }return total;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        int x = 0;
        String binary = "";
        if (decimal==0){
            return "0";
        }else{
        while (decimal>0){
            x=decimal%2;
            binary = x + binary;
            decimal=decimal/2;
        }
        return binary;
    }}
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String y = decimalToBinary(2);
        System.out.println(y);
    }
}
