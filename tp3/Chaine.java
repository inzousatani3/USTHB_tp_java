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

    }






}
