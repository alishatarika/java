enum generation {
  n,
  m,
}

interface wait {
   //void run();
   void run1(int b);//for lambda use
}

class grandparent implements wait {

  grandparent() {
    System.out.println("Here is the grandparent");
  }

  public void run1(int v) {
    System.out.println("run");
  }

  grandparent(int n) {
    System.out.println("Here is the grandparent paramertized");
  }

  int num() {
    System.out.println("Overiding g");
    return 0;
  }

  class grandparent1 {

    grandparent1() {
      System.out.println("Inner class");
    }
  }
}

class parent extends grandparent {

  // single inheritance
  parent() {
    System.out.println("Here is the Parent");
  }

  parent(int n) {
    System.out.println("Here is the parent paramertized");
  }

  @Override
  int num() {
    System.out.println("Overiding p");
    return 0;
  }
}

class child extends parent {

  child() {
    super();
    System.out.println("Here is the child");
  }

  child(int n) {
    this();
    System.out.println("Here is the child paramertized");
  }
}

public class inheritance {

  public static void main(String[] args) {
    grandparent g1 = new grandparent();
    grandparent g = new parent();
    parent p = new parent();
    child c = new child(5);
    g1.num();
    p.num();
    p.run1(5);

    generation w = generation.n;
    System.out.println(w);

    grandparent gp = new grandparent();
    grandparent.grandparent1 inner = gp.new grandparent1();


    // lambda function
    wait A= (int b) -> System.out.println("in show"+b);
    A.run1(5);

  }
}
