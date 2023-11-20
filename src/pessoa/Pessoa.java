package pessoa;

import vacina.CartaoVacina;

public class Pessoa extends CartaoVacina{
    int idade;
    String nome;
    int cpf;
   CartaoVacina cartaoVacina;

    public Pessoa() {

    }

    public Pessoa(int idade, String nome, int cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.cartaoVacina = new CartaoVacina();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public CartaoVacina getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(CartaoVacina cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }
    
}