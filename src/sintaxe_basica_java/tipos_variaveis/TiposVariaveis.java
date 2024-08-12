package sintaxe_basica_java.tipos_variaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        //Tipos primitivos e casting
        //Preferêncialmente use int e double para tipos numericos
        int idade = 20;

        double salario = 50000.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Constante
        final double VALOR_DE_PI = 3.14;
    }
}
