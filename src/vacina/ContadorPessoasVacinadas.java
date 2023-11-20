 package vacina;

import java.util.ArrayList;
import java.util.List;

import pessoa.Pessoa;

public class ContadorPessoasVacinadas {
    private List<Pessoa> pessoas = new ArrayList<>();

    public int contarPessoasVacinadas(String nomeVacina){
        int contador = 0;
         for (Pessoa pessoa : pessoas) {
            CartaoVacina cartaoVacina = pessoa.getCartaoVacina();
            List<Vacinas> vacinasAplicadas = cartaoVacina.getVacinasAplicadas();
            for (Vacinas vacinas : vacinasAplicadas) {
                if (vacinas.getNome().equalsIgnoreCase(nomeVacina)) {
                    contador++;
                    break;
                }
            }
         }
        return contador;
    }
}
