class RevNum{


   public static void main(String [] args){


    int num = 123;

    int last = num%10;
    System.out.print(last);
    num =  num/10;

    last = num%10;
    System.out.print(last);
    num =  num/10;

    last = num%10;
    System.out.print(last);
     num = num/10;

    System.out.println();
    System.out.println(num);


   }

}