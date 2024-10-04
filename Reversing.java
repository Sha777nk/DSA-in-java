import java.util.*;
public class Reversing {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc =new Scanner(System.in);
        String x= sc.nextLine();
        int begin =0;
        int end =x.length();
        Reversing y= new Reversing();
        System.out.println("Reversed String is :" +y.reverses(x,begin,end));
        System.out.println("word count :" +y.countWords(x));
        System.out.println("reverse the line :" + y.reverseline(x));
        System.out.println("The Lowercases :"+y.LowerCount(x));
        System.out.println("Conosants Position is:"+y.vlowelpos(x));
        sc.close();

    }

    public String reverses(String x, int begin, int end) {
        String str="";
        for(int i=end-1; i>=begin ; i--){
            str= str + x.charAt(i);
        }
        return str;

    }

    public int countWords(String x){
        int n= x.length();
        int count=1;
        if(n>0){
        for(int i=0; i<n;i++)
            {
            if(x.charAt(i)==' '){
                count++;
            }
            }
        }
        else
        count= 0;
    return count;
    }

    public String reverseline(String x){
        String str1="";
        int begin=0;
        for(int i=0; i<x.length();i++){
            if(x.charAt(i)==' ' ){
                str1=str1 + reverses(x,begin,i)+" ";
                begin= i;
            }
        }
        str1= str1+reverses(x,begin,x.length());
        return reverses(str1,0,str1.length());
    }

    public String LowerCount(String x){
        String str ="";
        int count=0;
        for(int i=0 ;i<x.length(); i++){
            if(x.charAt(i)>=97){
                count++;
                str=str+x.charAt(i);
            }
        }
        return str+":"+count;
    }

    public int vlowelpos(String x){
        int count =0,pur=1;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='A'|| x.charAt(i)=='E'|| x.charAt(i)=='I' || x.charAt(i)=='O' || x.charAt(i)=='U'){
            }
            else
            count++;
        }
        for(int j=1;j<count;j++){
            pur=pur*j;
        }
        return pur;
    }



} 
