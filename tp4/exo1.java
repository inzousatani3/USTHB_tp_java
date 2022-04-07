public class exo1
{
    public static void main(String[] args) {
        int n = 2;
        Route T[] = new Route[n];

        T[0] = new Route();
        T[1] = new Route();

        for (int i = 0; i < T.length; i++) 
        {
            if( T[i].get_status() == Route.states.Degrade)
            {
                T[i].affiche();  
            }
        }
    }







}