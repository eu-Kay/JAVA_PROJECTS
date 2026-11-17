// Me chamo Ryan Rosa e estou aprendendo a linguagem Java.
// Vou fazer comentarios no codigo para explicar e me auxiliar futuramente com essa linguagem.
// Sobre esse codigo, a ideia era fazer uma cifra de cesar de forma automatizada. Como tive algumas dificuldades, acabei fazendo de forma manual e com auxilio do Claude.


// Importando o Scanner para o codigo ler o que o usuario digitar. 
import java.util.Scanner;

public class cifra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o que precisa ser criptografado: ");
// String mensagem = teclado.nextLine(); vai nos retornar uma String que o usuario digitar, e vamos armazenar essa String na variavel "mensagem".
        String mensagem = teclado.nextLine();

// mensagem.toUpperCase() vai nos retornar a mensagem em letras maiusculas, e vamos armazenar essa mensagem na variavel "mensagem".
        mensagem = mensagem.toUpperCase();

        System.out.print("Digite a chave (Quantidade de posições a deslocar): ");

// int chave = teclado.nextInt(); vai nos retornar um numero inteiro que o usuario digitar, e vamos armazenar esse numero na variavel "chave".
        int chave = teclado.nextInt();

// Declaramos a variavel "cifrado" como uma String vazia, que vai receber o resultado da criptografia da mensagem, e vamos imprimir no console a mensagem criptografada.
// Ou como outras palavras, ela vai interpretar a mensagem que o usuario digitou e vai criptografar ela de acordo com a chave que o usuario digitou. 
        String cifrado = ""; // ISSO O CLAUDE ME AJUDOU A ENTENDER// 


        // Esse FOR também tive ajuda do Claude, e ele vai nos retornar a mensagem criptografada, e vamos imprimir no console a mensagem criptografada
// Aqui o For vai percorrer cada letra da mensagem que o usuario digitou, e vai verificar se a letra é uma letra maiuscula (A-Z).
// Se for, ele vai calcular a nova posicao da letra de acordo com a chave que o usuario digitou, e vai adicionar a letra cifrada na variavel "cifrado". 
// Se nao for uma letra maiuscula, ele vai adicionar a letra original na variavel "cifrado".
            for (int i = 0; i < mensagem.length(); i++) {
            char letra = mensagem.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                int posicao = letra - 'A';
                int novaPosicao = (posicao + chave) % 26;
                char letraCifrada = (char) (novaPosicao + 'A');
                cifrado = cifrado + letraCifrada;
            } else {
                cifrado = cifrado + letra;
            }
        }


// Por fim essa etapa do codigo vai imprimir no console a mensagem original e a mensagem criptografada, e vai fechar o Scanner para liberar os recursos utilizados por ele. Isso é muito importante para evitar vazamentos de memoria e garantir que o programa funcione corretamente.
        System.out.println();
        System.out.println("Texto original:  " + mensagem);
        System.out.println("Texto cifrado:   " + cifrado);

// E de praixe, vamos fechar o Scanner. 
        teclado.close();
    }
}
