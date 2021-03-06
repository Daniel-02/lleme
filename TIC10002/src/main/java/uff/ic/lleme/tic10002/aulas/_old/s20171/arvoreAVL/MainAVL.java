package uff.ic.lleme.tic10002.aulas._old.s20171.arvoreAVL;

import java.util.Random;
import uff.ic.lleme.tic10002.aulas.utils.Empregado;

public class MainAVL {

    public static void main(String[] args) {
        {
            ArvoreAVLCorrigida av = new ArvoreAVLCorrigida(false);
            for (int i = 0; i < 100; i++)
                av.inserir(new Empregado((new Random()).nextInt(1000000)));

            System.out.println("===========================");
            System.out.println("altura = " + av.altura());
            System.out.println("maxSaldo = " + av.maxSaldo());
            System.out.println("===========================");
            System.out.println("");
        }

        {
            for (int n = 50; n < 300; n++) {
                ArvoreAVLCorrigida av = new ArvoreAVLCorrigida(true);
                for (int i = 0; i < n; i++)
                    av.inserir(new Empregado((new Random()).nextInt(1000000)));

                if (av.maxSaldo() > 1) {
                    System.out.println("|Elementos| = " + n);
                    System.out.println("altura = " + av.altura());
                    System.out.println("maxSaldo = " + av.maxSaldo());
                    System.out.println("");
                    av.print();
                    break;
                }

            }
        }

    }
}
