import model.OrdemServico;
import service.OrdemServicoService;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static OrdemServicoService service = new OrdemServicoService();

    public static void main(String[] args) {

        int opcao;

        do{
            System.out.println("\n=== SISTEMA DE ORDEM DE SERVIÇO ===");
            System.out.println("1 - Nova ordem de serviço");
            System.out.println("2 - Listar ordens");
            System.out.println("3 - Sair");
            System.out.println("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> service.criarOrdem();
                case 2 -> service.listarOrdens();
                case 3 ->System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao !=3);
    }
}