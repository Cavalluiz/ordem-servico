package service;
import model.OrdemServico;
import repository.OrdemServicoRepository;

import java.util.Scanner;

public class OrdemServicoService {

        Scanner sc = new Scanner(System.in);
        OrdemServicoRepository repo = new OrdemServicoRepository();

        public void criarOrdem() {

            OrdemServico os = new OrdemServico();

            System.out.print("Cliente: ");
            os.setNomeCliente(sc.nextLine());

            System.out.print("CNPJ: ");
            os.setCnpj(sc.nextInt());

            System.out.println("Tipo: 1-Nobreak 2-Estabilizador");
            int tipo = sc.nextInt();
            sc.nextLine();
            os.setTipoEquipamento(tipo == 1 ? "Nobreak" : "Estabilizador");

            System.out.println("Categoria: 1-Monofásico 2-Trifásico");
            int cat = sc.nextInt();
            sc.nextLine();
            os.setCategoria(cat == 1 ? "Monofásico" : "Trifásico");

            System.out.print("Marca: ");
            os.setMarca(sc.nextLine());

            System.out.print("Modelo: ");
            os.setModelo(sc.nextLine());

            System.out.print("Problema: ");
            os.setProblema(sc.nextLine());

            System.out.print("Diagnóstico: ");
            os.setDiagnostico(sc.nextLine());

            System.out.print("Serviço: ");
            os.setServico(sc.nextLine());

            os.setLiga(pergunta("Liga?"));
            os.setBateria(pergunta("Bateria OK?"));
            os.setTensaoEntrada(pergunta("Entrada OK?"));
            os.setTensaoSaida(pergunta("Saída OK?"));

            os.setStatus("Concluído");

            repo.salvar(os);

            System.out.println("✅ Ordem salva!");
        }

        public void listarOrdens() {
            repo.listar();
        }

        private boolean pergunta(String msg) {
            System.out.print(msg + " (s/n): ");
            return sc.next().equalsIgnoreCase("s");
        }
}
