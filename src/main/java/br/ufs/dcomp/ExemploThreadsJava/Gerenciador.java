package br.ufs.dcomp.ExemploThreadsJava;

/**
 * Gerenciador de Lembretes
 *
 */
public class Gerenciador 
{
    public static void main( String[] args )
    {
        Lembrete l1 = new Lembrete("Dorflex", 10, 4);
        Lembrete l2 = new Lembrete("Pracetamol", 8, 3);
        Lembrete l3 = new Lembrete("Piroxican", 4, 8);
        Lembrete l4 = new Lembrete("Omeprazol", 12, 5);
        
        l1.start();
        l2.start();
        l3.start();
        l4.start();
    }
}
