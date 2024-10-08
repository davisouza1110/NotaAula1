public class Produto {
    private String codigo;
    private String nome;
    private String tamanhoOupeso;
    private String cor;
    private double valor;
    private int quantidade;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.tamanhoOupeso = tamanhoOupeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void exibirProduto(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoOupeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade: " + quantidade);
    }

    public void venderProduto(int quantidade, String formaPagamento){
        if (quantidade > quantidade){
            System.out.println("Estoque insuficiente.");
            return;
        }

        double valorFinal = valor = quantidade;

        if (formaPagamento.equalsIgnoreCase("pix") || formaPagamento.equalsIgnoreCase("especie") || formaPagamento.equalsIgnoreCase("transferencia") || formaPagamento.equalsIgnoreCase("debito") || formaPagamento.equalsIgnoreCase("credito")){
            valorFinal *= 0.95; // 5% de desconto
        }

        System.out.println("Valor final: R$ " + valorFinal);
        quantidade -= quantidade;
    }

    public void calcularTroco(double valorPago, double valorFinal){
        if (valorPago > valorFinal){
            double troco = valorPago - valorFinal;
            System.out.println("Troco: R$ " + troco);
        }
    }
}

