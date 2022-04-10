import java.util.Scanner;

public class Date {

    enum months{
        january,february,march,
        april,may,june,
        july,august,september,
        october,november,december}

    private int jour,annee;
    private months mois;

    

    public Date (int jour, String mois, int annee)
    {
        this.jour = jour;
        this.annee = annee;

        switch (mois) {
            case "january":
                this.mois = Date.months.january;
                break;
            case "february":
                this.mois = Date.months.february;
                break;
            case "march":
                this.mois = Date.months.march;
                break;
            case "april":
                this.mois = Date.months.april;
                break;
            case "may":
                this.mois = Date.months.may;
                break;
            case "june":
                this.mois = Date.months.june;
                break;
            case "july":
                this.mois = Date.months.july;
                break;
            case "august":
                this.mois = Date.months.august;
                break;
            case "september":
                this.mois = Date.months.september;
                break;
            case "october":
                this.mois = Date.months.october;
                break;
            case "november":
                this.mois = Date.months.november;
                break;
            case "december":
                this.mois = Date.months.december;
                break;

            default:
                break;
        }
    }
    public Date()
    {
        
        Scanner input = new Scanner(System.in);

        System.out.print("enter day number: ");
        int day = input.nextInt();

        input.nextLine();

        System.out.print("enter month name: ");
        String month = input.nextLine();

        input.nextLine();

        System.out.print("enter year: ");
        int year = input.nextInt();

        this.jour = day;
        this.annee = year;
        switch (month) {
            case "january":
                this.mois = Date.months.january;
                break;
            case "february":
                this.mois = Date.months.february;
                break;
            case "march":
                this.mois = Date.months.march;
                break;
            case "april":
                this.mois = Date.months.april;
                break;
            case "may":
                this.mois = Date.months.may;
                break;
            case "june":
                this.mois = Date.months.june;
                break;
            case "july":
                this.mois = Date.months.july;
                break;
            case "august":
                this.mois = Date.months.august;
                break;
            case "september":
                this.mois = Date.months.september;
                break;
            case "october":
                this.mois = Date.months.october;
                break;
            case "november":
                this.mois = Date.months.november;
                break;
            case "december":
                this.mois = Date.months.december;
                break;

            default:
                break;
        }



    }

    public months get_month()
    {
        return this.mois;
    }
    public int get_day()
    {
        return this.jour;
    }
    public int get_year()
    {
        return this.annee;
    }





    static int get_month_number(Date date)
    {
        switch (date.get_month()) {
            case january:
                return 1;
            case february:
                return 2;
            case march:
                return 3;
            case april:
                return 4;
            case may:
                return 5;
            case june:
                return 6;
            case july:
                return 7;
            case august:
                return 8;
            case september:
                return 9;
            case october:
                return 10;
            case november:
                return 11;
            case december:
                return 12;

            default:
                return 0;
        }
    }

    public boolean verif()
    {
        if(this.jour >= 32 || this.jour <= 0)
        {
            return false;
        }
        if(this.mois == Date.months.february && this.jour >29)
        {
            return false;
        }

        return true;
    }

    public void afficher()
    {
        System.out.print("date :" + this.jour + " " + this.mois.toString() + " " + this.annee);
    }

    public String tostring()
    {
        return String.valueOf(this.jour) + "-" + this.mois.toString() + "-" + String.valueOf(this.annee);
    }

    public static int compareTo(Date date1 ,Date date2)
    {
        int sum1,sum2;

        sum1 = date1.get_year() * 365 
            + Date.get_month_number(date1) * 30
            + date1.get_day();

        sum2 = date2.get_year() * 365 
            + Date.get_month_number(date2) * 30
            + date2.get_day();

        if (date1.get_month() == months.february) {
            sum1--;
        }

        if (date2.get_month() == months.february) {
            sum2--;
        }



        if (sum1 > sum2)
        {
            return 1;
        }
        else
        {
            if (sum2 > sum1) {
                return -1;
            }
            else
            {
                return 0;
            } 
        }
    }
    //public boolean abrMois (String m)
    





}
