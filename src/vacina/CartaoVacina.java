package vacina;
import java.util.ArrayList;
import java.util.List;

public class CartaoVacina {
    private List<Vacinas> vacinasAplicadas;

    public CartaoVacina() {
        this.vacinasAplicadas = new ArrayList<>();
    }

    public void adicionarVacina(Vacinas vacina) {
        vacinasAplicadas.add(vacina);
    }

    public List<Vacinas> getVacinasAplicadas() {
        return vacinasAplicadas;
    }


    }
    

