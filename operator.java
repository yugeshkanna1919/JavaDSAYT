public class operator {
    public static void main(String args[]){
        //arithmatic operator
        int a = 25;
        int b = 15;
        int sum = a+b;
        int diff = a-b;
        int product =a*b;
        int avg = (a+b)/2;
        int rem =a%b;
        String rem1 = "%";
        System.out.printf("The sum of a and b is %d\n",sum);
        System.out.printf("The difference of a and b is %d\n",diff);
        System.out.printf("The product of a and b is %d\n",product);
        System.out.printf("The average of a and b is %d\n",avg);
        System.out.printf("The remainder of a and b %s is %d\n",rem1,rem);
        //relational operator
        int current = 45;
        int target = 50;
        System.out.println(current==target);
        System.out.println(target>current);
        System.out.println(target<current);
        System.out.println(target>=current);
        System.out.println(target<=current);
        System.out.println(target!=current);

    }

}
