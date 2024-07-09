import java.util.*;
import java.lang.*;
class project{
    public static void main(String args[])
    { 
        menumain();
        

    }
    static void menumain()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" "); 
        System.out.println("Chose any one of the options"); 
        System.out.println(" ");      
        System.out.println("1. Manculation");
        System.out.println("2. Calculator");
        System.out.println("3. Simple Interest");
        System.out.println(" ");
        int choice1 = sc.nextInt();
        if(choice1==1){
            menu1();
        }
        else if(choice1==2)
        {
            menu2();
        }
        else if(choice1==3){
            menu3();
        }
        else{
            menumain();
        }
        
    }
    static void menu1(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" ");
            System.out.println("choose any one of the options");
            System.out.println(" ");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. circle");
            System.out.println("5. Go back to main menu");  
            System.out.println(" ");
            int srtc= sc.nextInt();
            if(srtc==1)
            {
            square();
            }
            else if(srtc==2)
            {
                rectangle();
            }
            else if(srtc==3)
            {
                triangle();
            }
            else if(srtc==4)
            {
                circle();
            }
            else
            {
                menumain();
            }

    }
    static void menu2(){
        Scanner sc=new Scanner(System.in);
      System.out.println(" ");
      System.out.println("Choose the option");
      System.out.println(" ");
      System.out.println("1. Addition");  
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Average");
      System.out.println(" ");
      int menu2_choice= sc.nextInt();
      if(menu2_choice==1){
        addition();
      }
      else if(menu2_choice==2){
        subtraction();
      }
      else if(menu2_choice==3){
        multiplication();
      }
      else if(menu2_choice==4){
        division();
      }
      else if(menu2_choice==5){
        average();
      }
      else{
        menumain();
      }
    
    }
    static void menu3(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Chose any one of the options");
        System.out.println("");
        System.out.println("1. profit and loss");
        System.out.println("2. simple interest");
        System.out.println("");
        int menu3_choice= sc.nextInt();
        if(menu3_choice==1){
            System.out.println("Enter the selling price");
            int selling_price= sc.nextInt();
            System.out.println("Enter the cost price");
            int cost_price= sc.nextInt();
            int profit_or_loss=selling_price-cost_price;
            
                System.out.println("profit = "+profit_or_loss);
            
        }
        else if(menu3_choice==2){
            System.out.println("enter the principal");
            int principal= sc.nextInt();
            System.out.println("enter the time");
            int time= sc.nextInt();
            System.out.println("enter the rate of interest in percentage");
            int rate_of_interest_in_percentage= sc.nextInt();
            int a=principal*time*rate_of_interest_in_percentage;
            int simple_interest=a/100;
            System.out.println("simple interest = "+simple_interest);
        }
        else{
            menumain();
        }
    }
    static void square()
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("Chose any one of the options"); 
        System.out.println(" "); 
        System.out.println("1. Area"); 
        System.out.println("2. Perimeter"); 
        System.out.println(" "); 
        int square_choice = sc.nextInt();
        System.out.println("Enter the side of the square "); 
          System.out.println(" "); 
         int side = sc.nextInt(); 
         System.out.println(" "); 
        if(square_choice==1){
           int area=side*side;
           System.out.println("area of square is "+area); 

        }
        else if(square_choice==2){
            int perimeter=4*side;
            System.out.println("perimeter of the square is "+perimeter); 
        }
        else{
            menu1();
        }
        
    }
    static void rectangle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Chose any one of the options"); 
        System.out.println(" "); 
        System.out.println("1. Area"); 
        System.out.println("2. Perimeter"); 
        System.out.println(" "); 
        int rectangle_choice = sc.nextInt();
        System.out.println("Enter length of the recangle ");
        int length = sc.nextInt(); 
        System.out.println("Enter width of the recangle ");
        int width = sc.nextInt(); 
        if(rectangle_choice==1){
            int area=length*width;
            System.out.println("Area of the rectangle is "+area);
        }
        else if(rectangle_choice==2)
        {
            int perimeter=2*(length+width);
            System.out.println("Perimeter of the recangle is "+perimeter);
        }
        else{
            menu1();
        }
    }
    static void triangle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Chose any one of the options"); 
        System.out.println(" "); 
        System.out.println("1. Area"); 
        System.out.println("2. Perimeter"); 
        System.out.println(" "); 
        int triangle_choice = sc.nextInt();
        if(triangle_choice==1){
        System.out.println("Enter breath of the triangle ");
        int breath = sc.nextInt(); 
        System.out.println("Enter height of the triangle ");
        int height= sc.nextInt();
            double area=0.5*breath*height;
            System.out.println("Area of the triangle is "+area);
        }
        else if(triangle_choice==2)
        {
            System.out.println("Enter 1st side of the triangle ");
        int side1 = sc.nextInt(); 
        System.out.println("Enter 2nd side of the triangle ");
        int side2= sc.nextInt();
        System.out.println("Enter 3rd side of the triangle ");
        int side3= sc.nextInt();
            int perimeter=side1+side2+side3;
            System.out.println("Perimeter of the triangle is "+perimeter);
        }
        else{
            menu1();
        }
    }
    static void circle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Chose any one of the options"); 
        System.out.println(" "); 
        System.out.println("1. Area"); 
        System.out.println("2. Circumference"); 
        System.out.println(" "); 
        int circle_choice = sc.nextInt();
        System.out.println(" ");
        System.out.println("Enter the radious of the circle");
        int radious = sc.nextInt();
        double pi=3.14;
        if(circle_choice==1){
            double area=pi*radious*radious;
            System.out.println("Area of the circle is "+area);

        }
        else if(circle_choice==2)
        {
            double circumference=2*pi*radious;
            System.out.println("Circumference of the circle is "+circumference);
        }
        else{
            menu1();
        }

    }
    static void addition(){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers you want to add");
        int number_of_values= sc.nextInt();
        int sum=0;
        for(int i=0;i<number_of_values;i++){
         System.out.println("enter the value");
         int value= sc.nextInt();
         
         sum=sum+value;


        }
        System.out.println(sum);

    }
    static void subtraction(){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers you want to subtraction");
        int number_of_values= sc.nextInt();
        int[] values= new int[number_of_values-1]; 
        for(int i=0;i<number_of_values;i++){
         System.out.println("enter the value");
         
         values[i]=sc.nextInt();


        }
        int sub= values[0]-values[1];
        for(int j=2;j<number_of_values;j++){
            int sub2 = sub-values[j];
        }
        
        System.out.println(sub);

    }
    static void multiplication()
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers you want to multiply");
        int number_of_values= sc.nextInt();
        int mul=1;
        for(int i=0;i<number_of_values;i++){
         System.out.println("enter the value");
         int value= sc.nextInt();
         
         mul=mul*value;


        }
        System.out.println(mul); 
    }
    static void division()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numerator ");
        double numerator=sc.nextInt();
        System.out.println("Enter denominator ");
        double denominator=sc.nextInt();
        if(denominator==0){
        System.out.println("the division of "+numerator+" and 0 is undefined");    
        }
        else if(numerator>denominator){
            double div=numerator/denominator;
        System.out.println(div);    
        }
        else{
         double div=numerator/denominator;
        System.out.println((int)div);    
        }
        


    }
    static void average(){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers you want to add");
        int number_of_values= sc.nextInt();
        double sum=0;
        for(int i=0;i<number_of_values;i++){
         System.out.println("enter the value");
         int value= sc.nextInt();
         
         sum=sum+value;


        }
        double average=sum/number_of_values;
        System.out.println(average);
    }


}