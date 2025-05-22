import java.util.*;
class EXO1
{
    public static void main (String args[])
    {
        double mnt , nbcopie;
        System.out.print(" donner le nombre de copies ");
        Scanner clavier= new Scanner (System.in);
        nbcopie = clavier.nextDouble();
        if( nbcopie <= 10) mnt = nbcopie * 2;
        else if( nbcopie > 10 && nbcopie <= 30) mnt= (10 * 2) + (nbcopie - 10)* 1.5;
        else mnt =  (10 * 2) + (nbcopie - 10)* 1.5 + (nbcopie - 30);
        System.out.print(" le montant est :"+ mnt);
        clavier.close();
    }
}
