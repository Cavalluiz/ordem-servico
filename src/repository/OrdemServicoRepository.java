package repository;
import model.OrdemServico;

import java.io.*;

public class OrdemServicoRepository {
    private final String CAMINHO;

    {
        CAMINHO = "data/ordens.txt";
    }

    public void salvar(OrdemServico os) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO, true))) {

            bw.write(os.toString());
            bw.write("\n----------------------\n");

        } catch (IOException e) {
            System.out.println("Erro ao salvar!");
        }
    }

    public void listar() {
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
