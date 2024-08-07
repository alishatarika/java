public class firstCode {
    public static void main(String args[]){
    int num=1;
    double num1=85.5678889999;
    float num2=46.67844f;
    String name="Alisha";
    System.out.println(name);

    String name1=new String();
    name1="Ankush";
    System.out.println(name1);
    
    System.out.println("hello");
    System.out.println(num);
    System.out.println(num1);
    System.out.println(num2);

    byte r=123;//(range -127 to 127) only
    System.out.println(r);

    boolean tf =true;
    System.out.println(tf);

    short s =89;
    System.out.println(s);
    //difference in only on range
    long l=34;
    System.out.println(l);
    
    char a='u';
    a++;
    System.out.println(a);

    String er="fvf";
    System.out.println(er);
    
    int binary =0b1000;
    System.out.println(binary);
    
    int hexa=0x4456;
    System.out.println(hexa);

    double expo=1782e34;
    System.out.println(expo);

    boolean result=9>23;
    System.out.println(result);

    boolean r1 = 6>45 && 4<6;
    System.out.println(r1);

    switch(8)
    {
        case 1,8 ->
        System.out.println("no");
      
        case 5 ->
        System.out.println("yes");
       

        default ->
        System.out.println("default");
//instead of break we can use ->
    }
    int i=4;
    while(i==3)
    {
        System.out.println("w");
    }
    do
    {
        System.out.println("w");
    }
    while(i==3);
    
}}

