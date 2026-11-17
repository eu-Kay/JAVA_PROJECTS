// AUTENTICADO DE USUARIO E SENHA BASICO EM JAVA
// Me chamo Ryan, sou um estudante de programação e estou aprendendo Java. 
// Este é um exemplo simples de autenticação de usuário e senha em Java. O programa solicita ao usuário que digite seu nome de usuário e senha, e verifica se eles correspondem aos valores corretos. Se a autenticação for bem-sucedida, o acesso é permitido; caso contrário, o acesso é negado. O usuário tem três tentativas para inserir as credenciais corretas.


//Vamos iniciar solicitando o Scanner para ler a entrada do user... PADRÃO
import java.util.Scanner;

public class autentica {
    public static void main(String[] args) {
        //Vamos soliciar o nome do usuario primeiro. 
        System.out.print("Digite o nome de usuario: ");
        Scanner teclado = new Scanner(System.in);
        String usuario = teclado.nextLine();
        //E aqui vamos mostrar o nome que o user digitou
        System.out.println("Usuario: " + usuario);


        //Aqui vamos definir o nome e a senha corretos para autenticação.
        //Meu objetivo era o user cadastrar esses valores em uma memoria temporaria, mas para primeiro teste, vamos deixar fixo.
        String usuarioCorreto = "Ryan";
        String senhaCorreta = "1234";

        //Vamos solicitar a senha do user agora.
        System.out.print("Digite a senha: ");
        String senha = teclado.nextLine();
        //E aqui vamos mostrar a senha que o user digitou
        System.out.println("Senha: " + senha);

        //Aqui vamos verificar se o nome de usuario e a senha digitados correspondem aos valores corretos.
        //Se sim, o acesso é permitido; caso contrário, o acesso é negado.
        if (usuario.equals(usuarioCorreto)&& senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        //Vamos implementar o sistema de tentativas
        //Essa parte é mais chatinha, mas é importante para a segurança do sistema. O usuário terá três tentativas para inserir as credenciais corretas.
        //e nota que pedimos de novo o nome de usuario e senha, caso ele erre. Também vamos mostrar quantas tentativas ele ainda tem.
        int tentativas = 3;
        
        //While loop para permitir múltiplas tentativas de autenticação
        while (tentativas > 0) {
            System.out.print("Digite o nome de usuario: ");
            usuario = teclado.nextLine();
            System.out.println("Usuario: " + usuario);

            System.out.print("Digite a senha: ");
            senha = teclado.nextLine();
            System.out.println("Senha: " + senha);

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
                break;
            } else {
                //tentativas--; significa que vamos diminuir o numero de tentativas em 1 a cada erro do user. 
                // Esse "--" é um operador de decremento em Java, que subtrai 1 do valor da variável.
                tentativas--;
                System.out.println("Acesso negado. Tentativas restantes: " + tentativas);
            }
        }

        teclado.close();
    }
}
