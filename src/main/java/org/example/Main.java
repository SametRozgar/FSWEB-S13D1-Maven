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
        // Saat geçersizse (0'dan küçük ya da 23'ten büyükse)
        if (clock < 0 || clock > 23) {
            return false;
        }

        // Köpek havlıyorsa ve saat 8 akşam ile 8 sabah arasındaysa
        if (isBarking && (clock >= 0 && clock < 8 || clock >= 20 && clock <= 23)) {
            return true;
        }

        return false; // Diğer durumlarda false döneriz
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge>=13 && firstAge<=19)||(secondAge>=13 && secondAge<=19)||(thirdAge>=13 && thirdAge<=19))
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