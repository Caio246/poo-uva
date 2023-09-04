import java.util.Scanner;

public class TestandoComputador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Computador computadorPaulo = new Computador();
        Computador computadorJulia = new Computador();
        Computador computadorPedro = new Computador();
        Computador computadorJuca = new Computador();

        System.out.println("Informe os dados do computador de Paulo:");
        System.out.print("Marca: ");
        computadorPaulo.setMarca(scan.nextLine());
        System.out.print("Estado da memória: ");
        computadorPaulo.setEstadoDaMemoriaRam(scan.nextLine());
        System.out.print("Tamanho da tela: ");
        computadorPaulo.setTamanhoTela(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe os dados do computador de Julia:");
        System.out.print("Marca: ");
        computadorJulia.setMarca(scan.nextLine());
        System.out.print("Estado da memória: ");
        computadorJulia.setEstadoDaMemoriaRam(scan.nextLine());
        System.out.print("Tamanho da tela: ");
        computadorJulia.setTamanhoTela(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe os dados do computador de Pedro:");
        System.out.print("Marca: ");
        computadorPedro.setMarca(scan.nextLine());
        System.out.print("Estado da memória: ");
        computadorPedro.setEstadoDaMemoriaRam(scan.nextLine());
        System.out.print("Tamanho da tela: ");
        computadorPedro.setTamanhoTela(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe os dados do computador de Juca:");
        System.out.print("Marca: ");
        computadorJuca.setMarca(scan.nextLine());
        System.out.print("Estado da memória: ");
        computadorJuca.setEstadoDaMemoriaRam(scan.nextLine());
        System.out.print("Tamanho da tela: ");
        computadorJuca.setTamanhoTela(scan.nextInt());
        scan.nextLine();

        System.out.println("Informações sobre o computador de Paulo:");
        computadorPaulo.imprimir();
        System.out.println("-------------------------");

        System.out.println("Informações sobre o computador de Julia:");
        computadorJulia.imprimir();
        System.out.println("-------------------------");

        System.out.println("Informações sobre o computador de Pedro:");
        computadorPedro.imprimir();
        System.out.println("-------------------------");

        System.out.println("Informações sobre o computador de Juca:");
        computadorJuca.imprimir();
        System.out.println("-------------------------");

    }
}