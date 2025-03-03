package org.example;

public class Main {
    public static void main(String[] args) {

       System.out.println(shouldWakeUp(true, 22));

        System.out.println(hasTeen(8,7,15));

        System.out.println(isCatPlaying(false,43));

        System.out.println(area(15,20));
        System.out.println(area(20));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {


        if (clock < 0 || clock > 23) {
            return false;
        }

        if (isBarking == true && (clock < 20 && clock > 8)) {
            return true;
        } else {
            return false;
        }


    }

 public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
         if((firstAge<19 && firstAge>13)||(secondAge<19 && secondAge>13)||(thirdAge<19 && thirdAge>13))
         {
             return true;
         }

     return false;
 }



    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if(isSummer==true && (temp<=45 && temp>25))
        {
            return true;
        }else if(isSummer==false && (temp<=35 && temp>25))
        {
            return true;
        }
       return false;
    }

    public static double area(double width, double height) {
        if(width<0 || height<0)
        {
            return -1;
        }
        return width*height;

    }

    public static double area(double radius) {
   if(radius<0)
   {
       return -1;
   }
   return radius*radius*Math.PI;
    }
}
