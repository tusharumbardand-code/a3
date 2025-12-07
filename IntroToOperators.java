class IntroToOperators{

  public static void main(String [] args){

      System.out.println(5.0/2);//2.5
      System.out.println(5/2);//2
      System.out.println(5%2);

      //store the data
      int num1 = 10;
      int num2 = 20;
      int sum = num1+num2;
      System.out.println("sum : "+sum);


     //last digit
     int num = 123;
     int last = num%10;
     System.out.println(last);
     num = num/10;//res ---> 12
      System.out.println("num : "+num);
     
   }

}