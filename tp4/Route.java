import java.util.Scanner;

public class Route 
{
    enum categories {RouteNationale,AutoRoute,RouteWilaya}
    enum states {Bon,Moyen,Degrade}

    private int number;
    private int num_kilom;
    private categories categorie;
    private states state;

    public Route()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter number: ");
        this.number = input.nextInt();

        System.out.print("enter num_kilom: ");
        this.num_kilom = input.nextInt();

        System.out.print("enter categorie: ");
        input.nextLine();

        String foo = input.nextLine();
        switch(foo)
        {
            case "RouteNationale":
            this.categorie = categories.RouteNationale;
            break;
            case "AutoRoute":
            this.categorie = categories.AutoRoute;
            break;
            case "RouteWilaya":
            this.categorie = categories.RouteWilaya;
            break;

            default:
            this.categorie = categories.RouteNationale;
            break;
        }
        System.out.print("enter state: ");
        foo = input.nextLine();

        switch(foo)
        {   
            case "Bon":
            this.state = states.Bon;
            break;
            case "Moyen":
            this.state = states.Moyen;
            break;
            case "Degrade":
            this.state = states.Degrade;
            break;

            default:
            this.state = states.Moyen;
            break;
        }

    }
    public void affiche()
    {
        System.out.println("route number: " + this.number);
        System.out.println("route kilometrage: " + this.num_kilom);
        System.out.println("route categorie: " + this.categorie);
        System.out.println("route state: " + this.state);
    }

    public void modif(int number, int num_kilom, String state,String categorie)
    {
        this.number = number;
        this.num_kilom = num_kilom;

        switch(state)
        {   
            case "Bon":
            this.state = states.Bon;
            break;
            case "Moyen":
            this.state = states.Moyen;
            break;
            case "Degrade":
            this.state = states.Degrade;
            break;

            default:
            this.state = states.Moyen;
            break;
        }

        switch(categorie)
        {
            case "RouteNationale":
            this.categorie = categories.RouteNationale;
            break;
            case "AutoRoute":
            this.categorie = categories.AutoRoute;
            break;
            case "RouteWilaya":
            this.categorie = categories.RouteWilaya;
            break;

            default:
            this.categorie = categories.RouteNationale;
            break;
        }
    }

    public states get_status()
    {
        return this.state;
    }



}
