package Modulos;

import Interfaces.InterfaceDado;
import java.util.Random;

public class JogarDado implements InterfaceDado {

    public static int[] lancarDados(int tipo, int quantidade){
        Random gerador = new Random();
        int tipoDado = tipo;
        int quantidadeDado = quantidade;
        int [] resultado = new int[quantidadeDado];
        int indexDado = 0; 
        if (quantidadeDado == 1)

        {
            resultado[indexDado] = gerador.nextInt(1, tipoDado + 1);
            return  resultado;
        }
        else
        {
           for (int i=0; i < quantidadeDado; i++)
           {
                resultado[i] = gerador.nextInt(1, tipoDado +1);
           }
            return resultado;
        }
    }

}
