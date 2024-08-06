public class calcpr {
    public static void main(String[] args)
    {
        int num=3;
        int num1=4;
        int arr[]={1,2,5,7};
        int arr2[]=new int[3];
        int arr3[][]=new int[3][3];
        calculator r = new calculator();
        calculator s = new calculator();
        r.add(num,num1);
        r.add(num,num1,5);

        System.out.println(arr[3]);
        arr2[2]=2;
        System.out.println(arr2[2]);
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr3[i][j]=(int)(Math.random() * 10000);
                System.out.print(arr3[i][j]+" ");

            }
            System.out.print("\n");  
        }
      
         for(int n:arr2)
         {
            System.out.print(n);
         }
    }
}
class calculator
{
    public int add (int n1,int n2 )
    {
        System.out.println("Result is "+ (n1+n2));
        return 0;
    }
    public int add (int n1,int n2,int n3 )
    {
        System.out.println("Result is "+ (n1+n2+n3));
        return 0;
    }
    static
    {
      int y=8000;
      System.out.println(y);
    }
}