public class exo2 {

    static void affiche(Mois T[])
    {
        for(int i = 0; i < T.length; i++)
        {
            if(T[i].get_month() != null)
            {
                System.out.println("T[" + i + "]: " + T[i].get_month().toString());
            }
            else
            {
                System.out.println("T[" + i + "]: " + "null");
            }
        }
    }
    
    public static void main(String[] args) {
        Mois.affi();

        int n = 20;
        Mois T[] = new Mois[n];
        
        System.out.println(Mois.accepteChaine("may"));

        for (int i = 0; i < T.length; i++) {
            T[i] = new Mois();
        }

        for (int i = 0; i < T.length; i++) 
        {
            T[i].set_month(i % 12);
        }

        affiche(T);



    }
}
