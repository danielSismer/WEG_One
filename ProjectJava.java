import java.util.Scanner;

public class ProjectJava {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("____    __    ____  _______   _______      ______   .__   __.  _______       ");
        System.out.println("\\   \\  /  \\  /   / |   ____| /  _____|    /  __  \\  |  \\ |  | |   ____|      ");
        System.out.println(" \\   \\/    \\/   /  |  |__   |  |  __     |  |  |  | |   \\|  | |  |__         ");
        System.out.println("  \\            /   |   __|  |  | |_ |    |  |  |  | |  . `  | |   __|        ");
        System.out.println("   \\    /\\    /    |  |____ |  |__| |    |  `--'  | |  |\\   | |  |____       ");
        System.out.println("    \\__/  \\__/     |_______| \\______|     \\______/  |__| \\__| |_______|      ");


        System.out.println("\n==================================================================================\n");
        int opcao;
        String[] menuOpcoes = {" 1- Cadastrar Orientação: ", " 2- Pesquisar Orientação: ", " 3- Editar Orientação: ", " 4- Excluir Orientação: ", " 5- Sair: "};


        do {
            for (int i = 0; i < menuOpcoes.length; i++) {
                System.out.println(menuOpcoes[i]);
            }

            System.out.print(" Digite aqui: ");
            opcao = input.nextInt();



        }while(opcao != 5);



    }
}