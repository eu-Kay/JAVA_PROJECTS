// Me chamo Ryan Rosa e estou aprendendo a linguagem Java.
// Vou fazer comentarios no codigo para explicar e me auxiliar futuramente com essa linguagem.
// Agradeço a paciencia de quem estiver lendo e espero que seja util para quem estiver aprendendo tambem.
// Todos esses metodos foram aprendido no canal do YOUTUBE da Fernanda Kipper "Curso de programação: JAVA DO ZERO" e tambem no canal "Curso em Video" do professor Gustavo Guanabara.


// Importar o Scanner é importante para o codigo conseguir ler o que o usuario digitar.
import java.util.Scanner;

// A classe tabuada é a classe principal do programa, onde o codigo sera executado.
public class tabuada {

//Public static void main(String[] args) é o metodo principal do programa, onde o codigo sera executado.
//Puclic static é um modificador de acesso que indica que o metodo main é publico e pode ser acessado de qualquer lugar do programa.
//void é o tipo de retorno do metodo, que nesse caso nao retorna nada.Ou seja, o metodo main nao retorna nenhum valor.

    public static void main(String[] args) {
// Aqui estamos declarando o Scanner como "teclado" e instanciando ele com "new Scanner(System.in)" para que possamos ler o que o usuario digitar no console.
        Scanner teclado = new Scanner( System.in );
        System.out.print("Digite um número para ver a tabuada: ");
      
//Esse INT vai nos retornar um numero inteiro que o usuario digitar, e vamos armazenar esse numero na variavel "numero".
        int numero = teclado.nextInt();
        System.out.println("Tabuada do " + numero + ":");

// Já esse FOR vai nos retornar a tabuada do numero que o usuario digitou, e vamos imprimir no console a tabuada do numero.
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

// Por fim, fechamos o Scanner para liberar os recursos utilizados por ele. Isso é muito importante para evitar vazamentos de memoria e garantir que o programa funcione corretamente.
        teclado.close();
    }
}
