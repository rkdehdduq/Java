
class DivisionTest { 
    public static void main(String[] args) { 
        int num1 = 10;
        int num2 = 3;
        double quotient = (double)num1 /num2 ;

        System.out.printf("Result : %.3f\n", quotient);
        int remainder = num1 %num2;
        System.out.printf("Quotient : %d, Remainder: %d \n", (int)quotient, remainder);
    }
}
