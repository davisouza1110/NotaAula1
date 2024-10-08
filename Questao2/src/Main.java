import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do produto com todos os atributos
        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tamanho/peso do produto: ");
        String tamanhoOupeso = sc.nextLine();

        System.out.println("Digite a cor do produto: ");
        String cor = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble(); // Certifique-se de que o valor aqui seja numérico.

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(codigo, nome, tamanhoOupeso, cor, valor, quantidade);

        // Exibe produto e realiza venda
        produto.exibirProduto();

        System.out.println("Digite a quantidade a vender: ");
        int quantidadeAvender = sc.nextInt();
        sc.nextLine(); // Limpar o buffer
        System.out.println("Digite a forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito");
        String formaPagamento = sc.nextLine();

        produto.venderProduto(quantidade, formaPagamento);

        if (formaPagamento.equalsIgnoreCase("especie")){
            System.out.println("Digite o valor pago: ");
            double valorPago = sc.nextDouble();
            produto.calcularTroco(valorPago, produto.getValor() * quantidade * 0.95);
        }
        sc.close();


        }
    }
