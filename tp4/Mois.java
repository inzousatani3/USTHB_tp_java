public class Mois {
    enum abv_months{jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec}
    enum seasons{autumn,winter,spring,summer}
    enum months{
        january,february,march,
        april,may,june,
        july,august,september,
        october,november,december}
 
    private months month;
    private abv_months  abv;
    private seasons season;
    private int day;

    public months get_month()
    {
        return this.month;
    }

    public void set_month(int n )
    {
        this.month = Mois.accepteNum(n);
    }


    public static void affi()
    {
        for(months element : months.values()) 
        {
            System.out.println(element);
        }  
    }

    public static boolean accepteChaine (String ch)
    {
        for(months element : months.values()) 
        {
            if(ch == element.toString())
            {
                return true;
            }
        } 
        return false;
    }

    public static months accepteNum(int n)
    {
        switch (n) {
            case 1:
                return Mois.months.january;
            case 2:
                return Mois.months.february;
            case 3:
                return Mois.months.march;
            case 4:
                return Mois.months.april;
            case 5:
                return Mois.months.may;
            case 6:
                return Mois.months.june;
            case 7:
                return Mois.months.july;
            case 8:
                return Mois.months.august;
            case 9:
                return Mois.months.september;
            case 10:
                return Mois.months.october;
            case 11:
                return Mois.months.november;
            case 12:
                return Mois.months.december;

            default:
                return null;
        }
    }
    static void afficher_mois(Mois m)
    {
        System.out.print(m.day);
        System.out.print(m.month);
        System.out.print(m.season);
        System.out.print(m.abv);
    }
    static Mois rechercherParAbr(Mois T[], String abv)
    {
        for (int i = 0; i < T.length; i++) {
            if(T[i].abv.toString() == abv)
            {
                return T[i];
            }
        }
        return null;

    }
    
}
