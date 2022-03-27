public class Tp3exo4 {
    
    public static void main(String[] args) 
    {

        int n = 5;
        Chaine VS[] = new Chaine[n];
        //test data
        VS[0] = new Chaine("faysal");
        VS[1] = new Chaine("lasyaf");
        VS[2] = new Chaine("abcba");
        VS[3] = new Chaine("12345");
        VS[4] = new Chaine("hello");
        //question 1
        for (int i = 0; i < n; i++) 
        {
            if(VS[i].nbChiffre() == VS[i].longueur())
            {
                System.out.println(VS[i].ch);
            }
        }

        //question 2
        int size = 0;
        for (int i = 0; i < n; i++) 
        {
            if(VS[i].nbChiffre() == VS[i].longueur())
            {
                size++;
            }
        }
        int E[] = new int[size];
        int index = 0;
        for (int i = 0; i < n; i++) 
        {
            if(VS[i].nbChiffre() == VS[i].longueur())
            {
                E[index] = Integer.parseInt(VS[i].ch);
                index++;
            }
        }
        for (int i = 0; i < size; i++) 
        {
            System.out.println("E[" + i + "]: " + E[i]);
        }



        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(VS[i].estInverse(VS[j]))
                {
                    System.out.println( VS[i].ch + " is the inverse of " + VS[j].ch);
                }
            }
        }
        for (int i = 0; i < n; i++) 
        {
            if(VS[i].estPalind())
            {
                VS[i].ch = "Palind";
            }
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.println("VS[" + i + "]: " + VS[i].ch);
        }






    }
    
}
