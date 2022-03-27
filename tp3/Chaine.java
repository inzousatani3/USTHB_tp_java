public class Chaine {
    String ch;

    Chaine(String word)
    {
        this.ch = word;
    }

    int longueur()
    {
        return this.ch.length();
    }
    void affiche()
    {
        //loop over all chars in the string
        for (int i = 0; i < this.ch.length(); i++) 
        {
            System.out.printf("%c \t",this.ch.charAt(i));
        }
        System.out.println();
    }
    boolean IsCharInString(char c)
    {
        for(int i = 0; i < this.ch.length(); i++)
        {
            if(this.ch.charAt(i) == c)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean IsCharInString (Chaine word, char c) 
    {
        for(int i = 0; i < word.ch.length(); i++)
        {
            if(word.ch.charAt(i) == c)
            {
                return true;
            }
        }
        return false;
    }
    int nbChiffre()
    {
        int counter = 0;
        for(int i = 0; i < this.longueur(); i++)
        {
            
            if(Character.isDigit(this.ch.charAt(i)))
            {
                counter++;
            }
        }
        return counter;
    }

    int nbLettre()
    {
        int counter = 0;
        for(int i = 0; i < this.ch.length(); i++)
        {
            if(Character.isLetter(this.ch.charAt(i)))
            {
                counter++;
            }
        }
        return counter;
    }
    int nbAutre()
    {
        int counter = 0;
        for(int i = 0; i < this.ch.length(); i++)
        {
            // check if char is not letter or number
            if( !(Character.isLetter(this.ch.charAt(i)) && (Character.isDigit(this.ch.charAt(i)))) )
            {
                counter++;
            }
        }
        return counter;
    }
    boolean estEgal(Chaine s)
    {
        //chack if stging are the same
        if(this.ch == s.ch)
        {
            return true;
        }
        return false;
    }
    boolean estPalind()
    {
        int start = 0;
        int end = this.longueur() - 1;
        while(end > start)
        {
            if(this.ch.charAt(start) != this.ch.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    boolean estInverse(Chaine s)
    {
        if(this.longueur() != s.longueur())
        {
            return false;
        }
        for (int i = 0; i < this.longueur(); i++) {
            if(this.ch.charAt(i) != s.ch.charAt(this.longueur() - i -1))
            {
                return false;
            }
            
        }
        return true;
    }
    public static boolean estInverse(Chaine s1 ,Chaine s2)
    {
        if(s1.longueur() != s2.longueur())
        {
            return false;
        }
        for (int i = 0; i < s1.longueur(); i++) {
            if(s1.ch.charAt(i) != s2.ch.charAt(s1.longueur() - i -1))
            {
                return false;
            }
        }
        return true;
    }

}
