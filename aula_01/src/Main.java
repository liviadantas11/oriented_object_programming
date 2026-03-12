import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastoClientes cliente = new CadastoClientes();
        Estoque materiaL = new Estoque();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastrando clientes...");
        cliente.cadastrarclientes(entrada);

        System.out.println("Cadastrando roupas...");
        materiaL.roupa.cadastrarroupas(entrada);

        System.out.println("Atualizando estoque...");
        materiaL.atualizarEstoque(entrada);

        System.out.println("Nome: "+cliente.nome);
    }
}