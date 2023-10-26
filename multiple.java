public class multiple{
    public static void main(String[] args) {
        int i,j,counter=1;
        int[][] twod= new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                twod[i][j]=5*counter;//(i*4)+j+1;
                counter++;
                System.out.print(twod[i][j] +"   ");
            }
            System.out.println();
        }


    }
}