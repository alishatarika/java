class print{
    private int age=97;
    private String name="alisha";
     
    public int getAge()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }


    public void setAge(int age)
    {
        this.age =age;
    }

    public void setname()
    {
        name ="alisha";
    }


}

public class getterSetter {
  
    public static void main(String args[])
    {
        print a =new print();
        a.setAge(56);
        a.setname();
        System.out.print(a.getname() +" "+a.getAge());
    }



}
