
import Modulos.JogarDado;
public class App {
    public static void main(String[] args){
        int[] results = JogarDado.lancarDados(6, 3);
        for (int result : results)
        {
            System.out.println(result);
        }
    }
}
