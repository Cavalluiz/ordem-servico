package model;

public class OrdemServico {

    private String nomeCliente;
    private String cnpj;
    private String tipoEquipamento;
    private String categoria;
    private String marca;
    private String modelo;

    private String problema;
    private String diagnostico;
    private String servico;

    private boolean liga;
    private boolean bateria;
    private boolean tensaoEntrada;
    private boolean tensaoSaida;

    private String status;

    // getters e setters

    @Override
    public String toString() {
        return "\nCliente: " + nomeCliente +
                "\nCNPJ: " + cnpj +
                "\nEquipamento: " + tipoEquipamento + " - " + categoria +
                "\nMarca/Modelo: " + marca + modelo +
                "\nProblema: " + problema +
                "\nDiagnostico: " + diagnostico +
                "\nServiço: " + servico +
                "\nChecklist: Liga= " + liga +
                "\n, Bateria= " + bateria +
                "\n, Entrada= " + tensaoEntrada +
                "\n, Saída= " + tensaoSaida +
                "\nStatus: " + status;

    }

    public void setNomeCliente(String s) {
    }

    public void setCnpj(int s) {
    }

    public void setTipoEquipamento(String s) {
    }

    public void setCategoria(String s) {
    }

    public void setMarca(String s) {
    }

    public void setModelo(String s) {
    }

    public void setProblema(String s) {
    }

    public void setDiagnostico(String s) {
    }

    public void setServico(String s) {
    }

    public void setLiga(boolean liga) {
        this.liga = liga;
    }

    public boolean isLiga() {
        return liga;
    }

    public void setBateria(boolean pergunta) {
    }

    public void setTensaoEntrada(boolean pergunta) {
    }

    public void setTensaoSaida(boolean pergunta) {
    }

    public void setStatus(String concluído) {

    }
}
