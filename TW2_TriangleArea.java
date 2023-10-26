import java.util.Scanner;
import java.lang.System;

// With using a class and methods.

class triangle{
    int a,b,c;
    void read(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three sides of trianlgels : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();
    }
    void check(){
        if((a+b)>c && (b+c)>a && (c+a)>b){
            if(a==b && b==c && c==a){
                System.out.println("this is a equilateral triangle.");
            }else if(a==b || b==c || c==a){
                System.out.println("This is a isoceles triangle.");
            }else{
                System.out.println("This is a scelene triangle.");
            }
        }else{
            System.out.println("This is not a triangle.");
            System.exit(0);
        }
    }
    void computeArea(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle : "+area);
    }
}

class TW2_TriangleArea{
    public static void main(String[] args) {
        triangle t = new triangle();
        t.read();
        t.check();
        t.computeArea();
    }
}