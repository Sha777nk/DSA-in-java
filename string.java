import java.util.*;

public class string {
    public static void main(String[] args) {
        //String fullname="sahshank chandanagiri";
       //String sentence="my name is shasahnk";
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
       // System.out.println("Hii "+name);
        sc.close();
       

     /*   String firstname="tony";
       String lastname="Stark";
       String fullname=firstname+" "+lastname;
       System.out.println(fullname.length());
        
       for (int i = 0; i < fullname.length(); i++) {
        System.out.println(fullname.charAt(i));
       }
       
      String name1="tony";
      String name2="Stark";

      if (name1.compareTo(name2)==0) {
        System.out.println("strings are  equal");
        
      }
      else{
        System.out.println("strings are not equal");
      }*/
      //String name= sentence.substring(3,sentence.length());

      //*******************************string revers*****************************
      System.out.println(name);
      for (int i = name.length()-1; i >= 0; i--) {
        System.out.print(name.charAt(i));
        
      }
    }
}
