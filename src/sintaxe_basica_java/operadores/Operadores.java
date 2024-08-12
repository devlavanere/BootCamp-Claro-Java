package sintaxe_basica_java.operadores;

public class Operadores {

    public static void main(String[] args) {

        //Operadores Aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int mutiplicacao = 20 * 7;
        int divisao = 25 / 5;
        int modulo = 25 % 5;
        double resultado = (10 * 7) + (20/4);

        //Obs: O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "contatenação de textos"
        String nomeCompleto = "2" + "2"; //22

        //Operadores Unários

        //Valor positivo
        int numero = 5;

        //numero torna-se negativo
        numero = - numero;
        System.out.println(numero); // -5

        //numero trona-se positivo novamente
        numero = numero * -1;
        System.out.println(numero); // 5

        //Incremento
        numero++; //numero +1
        System.out.println(numero); // 6

        //Quando é feito dessa forma, quer dizer primeiro imprimir esse valor e depois quero incrementar esse valor
        System.out.println(numero ++); // 6
        System.out.println(numero); // 7

        //Para primeiro realizar a operação e imprimir a variável
        System.out.println(++numero); // 8

        //Decremento
        int numero2 = 5;
        numero2--; //numero -1
        System.out.println(numero2); // 4

        //Quando é feito dessa forma, quer dizer primeiro imprimir esse valor e depois quero incrementar esse valor
        System.out.println(numero2--); // 4
        System.out.println(numero2); // 3

        //Para primeiro realizar a operação e imprimir a variável
        System.out.println(--numero2); // 2

        //Negação
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel); //false

        //Operador Ternário
        int a, b;

        a= 5;
        b= 5;

        String resultado2 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        //Operadores Relacionais
        int num_1 = 1;
        int num_2 = 2;

        boolean simNao = num_1 == num_2;

        System.out.println("num1 é igual a num2? " + simNao); //false

        simNao = num_1 != num_2;
        System.out.println("num1 é diferente de num2? " + simNao); //true

        if(num_1 < num_2){
            System.out.println("A nossa consdição é verdadeira");
        }

        //Obs: Quando falamos de objetos ou texto usamos o método equals() para comparar conteúdos

        //Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4 )){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
