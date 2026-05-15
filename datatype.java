public class datatype {
    public static void main(String Args[]){
        byte num1 = 127;
        System.out.println(num1);
        short num2 = 32767;
        System.out.println(num2);
        int num3 = 2147483647;
        System.out.println(num3);
        long num4 = 9223372036854775807L ;
        System.out.println(num4);
        float num5 = 3.14f;
        System.out.println(num5);
        double num6= 3.141592653589793;
        System.out.println(num6);
        char ch= 'A';
        System.out.println((int)ch);
        boolean isEligibleVote = true;
        System.out.println(isEligibleVote);
        int b = 99;
        System.out.printf("The char value of b is %c\n",(char)b);
        // implicit conversion 
        int c = num1;
        System.out.println(c);
        // explicit conversion
        int d = (int)num4;
        System.out.println(d);
    }
}

  