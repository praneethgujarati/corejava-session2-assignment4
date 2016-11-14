class highest
{
    public static void main(String args[])
    {
      int x,y,z;//Declaring varialbes x,y and z of int type
      System.out.println("Enter first number:");
      x=Integer.parseInt(System.console().readLine());//This prompts the user to enter the number
      System.out.println("Enter second number:");
      y=Integer.parseInt(System.console().readLine());//This prompts the user to enter the number
      System.out.println("Enter third number:");
      z=Integer.parseInt(System.console().readLine());//This prompts the user to enter the number
      if(x>y  && x>z)
        System.out.println("This no. is largest:"+x);//This compares first number with second and third number and gives necessary output
      else if(y>x && y>z)
        System.out.println("This no. is largest:"+y);//This compares second number with first and third number and gives necessary output
      else if(z>x && z>y)
        System.out.println("This no. is largest:"+z);//This compares third number with first and second number and gives necessary output
      else 
        System.out.println("one or more numbers are same");
    }
}