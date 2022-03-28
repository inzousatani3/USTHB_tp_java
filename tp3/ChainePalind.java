class ChainePalind
{
    StringBuilder ch;

    ChainePalind (String s) 
    {
        ch = new StringBuilder(s);
    }
    
    String inverse()
    {
        return ch.reverse().toString();
    }

    

    boolean Palindrome()
    { 
        return ch.toString().equals(this.inverse());
    }
    
}