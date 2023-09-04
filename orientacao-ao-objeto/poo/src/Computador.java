public class Computador {

    public String marca;
    public String estadoDaMemoriaRam;
    public int tamanhoTela;
    public String processador;
    public String cor;

    public Computador(String marca, String estadoDaMemoriaRam, int tamanhoTela) {
        this.marca = marca;
        this.estadoDaMemoriaRam = estadoDaMemoriaRam;
        this.tamanhoTela = tamanhoTela;
    }

    public Computador() {
        this.processador = "Intel";
        this.cor = "Preto";
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstadoDaMemoriaRam() {
        return estadoDaMemoriaRam;
    }

    public void setEstadoDaMemoriaRam(String estadoDaMemoriaRam) {
        this.estadoDaMemoriaRam = estadoDaMemoriaRam;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getcor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Estado da memória: " + estadoDaMemoriaRam);
        System.out.println("Tamanho de tela: " + tamanhoTela);
        System.out.println("Processador: " + processador);
        System.out.println("Cor: " + cor);
    }

}
