
import java.util.Scanner;
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String texto){
        super(texto);
    }
}

    public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm , parametroDois);

            } catch (ParametrosInvalidosException e) {
                System.out.println("Nao pode ser inserido ao parametro 1 um valor maior que no parametro 2");
            }

            terminal.close();
            }

            static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
                if( numero1 > numero2){
                    throw  new ParametrosInvalidosException("Putz, deu pau me algo");
                }
                int contagem = numero2 - numero1;

                for(int i = 0 ; i < contagem ; i++)
                {
                    System.out.println("Numero impresso : "+(i+1));
                }
            }
    }

