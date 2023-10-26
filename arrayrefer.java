public class arrayrefer {
    public static void main(String[] args) {
        int i;
        int[] num1 = new int[10];
        for(i=0;i<10;i++)
            num1[i] = i;
        int[] yoo = new int[10];
        for(i=0; i<10; i++)
            yoo[i] = -i;
        System.out.println("Here is sting 1: ");
        for(i=0;i<10;i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.println("here is string 2: ");
        for(i=0;i<10;i++)
            System.out.print(yoo[i]+ " ");
        yoo = num1;
        System.out.println();
        System.out.println("here is num 2 after change: ");
        for(i=0;i<10;i++) {
            System.out.print(yoo[i]+" ");
        }
        System.out.println();
        yoo[3] = 99;
        System.out.println("Here is num1 after change through num2: ");
        for(i=0;i<10;i++)
            System.out.print(num1[i]+" ");
            System.out.println();
    }
}