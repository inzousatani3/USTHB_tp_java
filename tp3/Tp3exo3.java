public class Tp3exo3
{ 
    public static void main (String [] args)
    { 
        String s = "radar";
        ChainePalind chaine = new ChainePalind(s);

        System.out.println ("Inverse de : " + s + " est :" + chaine.inverse());
        System.out.println (s + " est un palindrome :" + chaine.Palindrome ());
        s = "classeur";
        System.out.println(s + " est un palindrome :" + new ChainePalind(s).Palindrome());
    }
}