// Importando o Scanner para que o codigo possa ler o que o usuario digitar no console 
import java.util.Scanner;

//lembrando que o sempre precisamos declarar a classe principal do programa, que nesse caso é a classe conversor
public class conversor {


//Public static void main(String[] args) é o metodo principal do programa, onde o codigo sera executado.
//Puclic static é um modificador de acesso que indica que o metodo main é publico e pode ser acessado de qualquer lugar do programa.
//void é o tipo de retorno do metodo, que nesse caso nao retorna nada.Ou seja, o metodo main nao retorna nenhum valor.
    public static void main(String[] args) { 
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");

// Double é um tipo primitivo de dado que representa um numero decimal, e nesse caso estamos declarando a variavel "celsius" como um numero decimal que o usuario digitar, e vamos armazenar esse numero na variavel "celsius".
        double celsius = Teclado.nextDouble();
       
// Declaramos a variavel "fahrenheit" como um numero decimal que vai receber o resultado da conversao de Celsius para Fahrenheit, e vamos imprimir no console a temperatura em Fahrenheit.
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    
// Por fim, fechamos o Scanner para liberar os recursos utilizados por ele. Isso é muito importante para evitar vazamentos de memoria e garantir que o programa funcione corretamente.
        Teclado.close();
    }

}
