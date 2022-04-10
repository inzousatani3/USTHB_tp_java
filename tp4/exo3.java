import java.util.Scanner;

public class exo3 {

    static void remplit(Date T[])
    {
        Scanner input = new Scanner(System.in);
        int day,year;
        String month;
        for (int i = 0; i < T.length; i++) {
            System.out.print("enter day number:");
            day = input.nextInt();
            System.out.print("enter year number:");
            year = input.nextInt();
            System.out.print("enter month name:");
            input.nextLine();
            month = input.nextLine();
            input.nextLine();
            T[i] = new Date(day, month, year);

            
        }

    }



    public static void main(String argv[])
    {
        Date T[] = new Date[20];

        exo3.remplit(T);

        for (int i = 0; i < T.length; i++) {
            if (!T[i].verif()) {

                T[i].afficher();
                T[i] = new Date(1, "january", 2022);
                
            }
        }



    }
}
