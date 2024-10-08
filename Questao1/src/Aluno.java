public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public void calcularMedia(){
        media=(nota1 + nota2 + nota3)/3;
        System.out.println("A média é: " + media);
    }
    public String VerificarAprovacao(){
        if (media >= 7){
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";

        }
    }
    public void exibirDetalhesAluno(){

        String situacao = VerificarAprovacao();
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}

