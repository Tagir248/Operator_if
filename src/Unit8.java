import java.util.Scanner;
class Unit8 {
    public static void main (String [] args) {

        System.out.print ("Введите число 1, 2, 3 или 4: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println ("Вы ввели число A");
        }
        else if (i==2) {
            System.out.println ("Вы ввели число 2");
        }
        else if (i==3) {
            System.out.println ("Вы ввели число 3");
        }
        else if (i==4) {
            System.out.println ("Вы ввели число 4");
        }
        else if (i>4) {
            System.out.println ("Вы ввели некорректное число");
        }
        else {
            System.out.println ("Вы ввели число не равное 1, 2,3 или 4");
        }
    }
}