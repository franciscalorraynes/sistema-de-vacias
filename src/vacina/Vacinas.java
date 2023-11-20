package vacina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Vacinas {
    private String nome;
    private String lote;
    private String dataFabricacao;
    private String validade;
    private static List<Vacinas> listaDeVacinas = new ArrayList<>();

    public Vacinas() {
        // Construtor vazio
    }

    public Vacinas(String nome, String lote, String dataFabricacao, String validade) {
        this.nome = nome;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.validade = validade;
    }

    public void addVacina() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da vacina: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o lote da vacina: ");
        String lote = entrada.nextLine();

        System.out.println("Digite a data de fabricação da vacina: ");
        String dataFabricacao = entrada.nextLine();

        System.out.println("Digite a validade da vacina: ");
        String validade = entrada.nextLine();

        Vacinas novaVacina = new Vacinas(nome, lote, dataFabricacao, validade);
        listaDeVacinas.add(novaVacina);

        System.out.println("Vacina adicionada à lista.");
    }

    public List<Vacinas> getListaDeVacinas() {
        return listaDeVacinas;
    }

    public static void setListaDeVacinas(List<Vacinas> listaDeVacinas) {
        Vacinas.listaDeVacinas = listaDeVacinas;
    }

     public boolean removeVacina(String nomeVacina) {
        Iterator<Vacinas> iterator = listaDeVacinas.iterator();
        while (iterator.hasNext()) {
            Vacinas vacinas = iterator.next();
            if (vacinas.getNome().equalsIgnoreCase(nomeVacina)) {
                iterator.remove();
                System.out.println("Vacina ' " + nomeVacina + "' removida da lista");
                return true;
            }

        }
        System.out.println("Vacina '" + nomeVacina + "' não encontrada na lista.");
        return false;

    }

    public List<Vacinas> listaVacinasCadastradas(String nomeVacina) {
        List<Vacinas> listaVacinasEncontradas = new ArrayList<>();
        for (Vacinas vacina : listaDeVacinas) {
            if (vacina.getNome().equalsIgnoreCase(nomeVacina)) {
                listaVacinasEncontradas.add(vacina);
            }
        }
        return listaVacinasEncontradas;
    }
    
    public void listarVacinasCadastradas(List<Vacinas> listaVacinas) {
        if (listaVacinas.isEmpty()) {
            System.out.println("Nenhuma vacina encontrada.");
        } else {
            System.out.println("Vacina(s) encontrada(s):");
            for (Vacinas vacina : listaVacinas) {
                System.out.println("Nome: " + vacina.getNome());
                System.out.println("Lote: " + vacina.getLote());
                System.out.println("Data de Fabricação: " + vacina.getDataFabricacao());
                System.out.println("Validade: " + vacina.getValidade());
                System.out.println("--------------------------------------");
            }
        }
    }
    
    
    

    public static Vacinas buscarVacina(String nomeVacina) {
        for (Vacinas vacina : listaDeVacinas) {
            if (vacina.getNome().equalsIgnoreCase(nomeVacina)) {
                return vacina; // Retorna a vacina encontrada
            }
        }
        return null; // Retorna null se a vacina não for encontrada
    }

    public void edtirarVacinas(String nomeVacina) {
        Vacinas vacina = buscarVacina(nomeVacina);
        if (vacina != null) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o novo lote da vacina: ");
            String novoLote = entrada.nextLine();
            vacina.setLote(novoLote);

            System.out.println("Digite a nova data de fabricação da vacina: ");
            String novaDataFabricacao = entrada.nextLine();
            vacina.setDataFabricacao(novaDataFabricacao);

            System.out.println("Digite a nova validade da vacina: ");
            String novaValidade = entrada.nextLine();
            vacina.setValidade(novaValidade);
            System.out.println("Vacina '" + nomeVacina + "' editada com sucesso.");
        } else {
            System.out.println("Vacina '" + nomeVacina + "' não encontrada na lista.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

}
