public class Bola {
    
    // ----- Atributos (encapsulados) -----
    private String material;
    private String cor;
    private int tamanho;
    private boolean cheia;

    // ----- Construtor padrão -----
    public Bola() {
        this.material = "desconhecido";
        this.cor = "desconhecida";
        this.tamanho = 0;
        this.cheia = false;
    }

    // ----- Construtor sobrecarregado (todos os atributos) -----
    public Bola(String material, String cor, int tamanho, boolean cheia) {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = cheia;
    }

    // ----- Construtor sobrecarregado (cor e tamanho) -----
    public Bola(String cor, int tamanho) {
        this.material = "desconhecido";
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = false;
    }

    // ----- Getters (assessores) -----
    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isCheia() {  // Para boolean, é comum usar "is"
        return cheia;
    }

    // ----- Setters (modificadores) -----
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    // ----- Métodos específicos -----
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("A bola foi pintada de " + novaCor);
    }

    public void encher() {
        this.cheia = true;
        System.out.println("A bola está cheia.");
    }

    public void esvaziar() {
        this.cheia = false;
        System.out.println("A bola foi esvaziada.");
    }
}