
public class DecimalABinario2 {

    
    public static void main(String args[]) 
    {
        double decimal = 6970899.125;
        decimalabinario(parteEntera(decimal));
        System.out.print(".");
        partedecimalabinario(parteDecimal(decimal));
        System.out.println(" ");
    }
    
    public static int parteEntera(double x)
    {
        int entero = 0;
        for(int i = 1; i<=x;i++)
        {
            entero ++;
        }
        return entero;
    }
    public static float parteDecimal(double x)
    {
        double decimal = x;
        decimal = decimal - parteEntera(x);
        return (float)decimal;
    }
    public static void decimalabinario(int n)
    {
        if (n<2) 
        {
            System.out.print(n);
        }
        else 
        {
            decimalabinario(n/2);
            System.out.print(n%2);
        }
    }
    public static void partedecimalabinario(double n)
    {
        double x = n;
        for(int i = 0; i<=6; i++)
        {
        if ((parteEntera(x*2)) == 0) 
        {
            System.out.print(0);
            x = x*2;
        } 
        else 
        {
            System.out.print(1);
            x = parteDecimal(x*2);
        }
        }
    }
}
