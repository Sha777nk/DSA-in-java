class shr
{
    String college="rls bac";
}
class shre extends shr
{
    String college="kle bac";
    void printcollege()
    {
        System.out.println("cld name="+college);
         System.out.println("cld name="+super.college);
    }
    public static void main (String args[])
    {
        shre obj =new shre();
        obj.printcollege();
    }
}