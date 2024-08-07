class grandparent {
    grandparent() {
        System.out.println("Here is the grandparent");
    }
      grandparent(int n)
      {
        System.out.println("Here is the grandparent paramertized");

      }
      int num()
      {
        System.out.println("Overiding g");
        return 0;
      }

}

class parent extends grandparent { // single inheritance
    parent() {
        System.out.println("Here is the Parent");
    }

    parent(int n)
      { 
        System.out.println("Here is the parent paramertized");

      }
      int num()
      {
        System.out.println("Overiding p");
        return 0;
      }
}

class child extends parent{
     child()
     { 
        super();
        System.out.println("Here is the child");
     }

     child(int n)
     {
          this();
        System.out.println("Here is the child paramertized");

     }
}

public class inheritance {
    public static void main(String[] args) {
        grandparent g = new grandparent();
        parent p = new parent();
        child c =new child(5);
        p.num();
    }
}
