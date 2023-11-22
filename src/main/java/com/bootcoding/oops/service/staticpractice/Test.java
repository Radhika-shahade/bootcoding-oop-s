package com.bootcoding.oops.service.staticpractice;

public class Test {
  int id;
  double salary;
  static String ceo;
  public void show()
  {

    System.out.println(id+ ":"+ salary+":"+ ceo);
  }

  public static void main(String[] args) {

    Test radhika= new Test();
    radhika.id=1;
    radhika.salary=20000;
    Test.ceo="sunil";

    Test sourabh = new Test();
    sourabh.id=2;
    sourabh.salary=40000;
    Test.ceo="sunil";
    Test.ceo="laxamn";
    radhika.show();
    sourabh.show();

  }
}
