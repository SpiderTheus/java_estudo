public class Exemplo {
    public int numero = 20; // Variável de instância

    public void exemploMetodo(int numero) {
        System.out.print("Imóvel número (instância): " + this.numero + ", parâmetro: " + numero);
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.exemploMetodo(15); // Irá imprimir ambos os valores: 20 e 15
    }
}
