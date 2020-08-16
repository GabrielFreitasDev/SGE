import java.util.Scanner;

public class SistemaDeCadastro {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite uma senha para usar-lá nos proximos acessos: ");
        String senha = scanner.nextLine();


        StringBuilder ultimo = new StringBuilder("_");

        for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){
            if (i < nome.length()) {
                ultimo.append(nome.charAt(i));
            }
        }

        // define login como a primeira letra do nome e ultimo sobrenome
        String login = nome.charAt(0)+ultimo.toString();


        if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
            System.out.println("Senha padrao forte!!!");

        } else {
            System.out.println("Senha fraca!!!");

        }

        System.out.println(" seu login é: ");
        System.out.print("nome: ");
        System.out.println(login);
        System.out.print("senha: ");
        System.out.println(senha);



        boolean doLogin = false;

        while (doLogin == false){

            System.out.println("Insira seu login:");
            String vLogin = scanner.nextLine();

            System.out.println("Insira sua senha:");
            String vSenha = scanner.nextLine();

            if (vLogin.equals(login) && vSenha.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                doLogin = true;
            }else{
                System.out.println("Login ou senha errados... tente novamente!");
            }

        }

    }

}


