import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vacina.Vacinas;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        List<Vacinas> listaVacinas = new ArrayList<>();
        // String nomeAuxilixar;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar Vacina");
            System.out.println("2. Remover Vacina");
            System.out.println("3. Listar Vacinas Cadastradas");
            System.out.println("4. Buscar Vacinas");
            System.out.println("5. Consultar Quantidade de Pessoas Vacinadas com uma Vacina");
            System.out.println("6. Editar Vacinas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    do {
                        Vacinas vacinas = new Vacinas();
                        vacinas.addVacina();
                        listaVacinas.add(vacinas);
                        System.out.println("Vacina cadastrada com sucesso!\n");
                        System.out.println("Deseja cadastrar outra vacina? (S/N)");
                        String resposta = scanner.next().trim().toUpperCase();
                        if (!resposta.equals("S")) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("Digite o nome da vacina que deseja remover do sistema: ");
                    String nome = scanner.nextLine();
                    Vacinas vacinas = new Vacinas();
                    boolean vacinaRemovida = vacinas.removeVacina(nome);
                    if (vacinaRemovida) {
                        System.out.println("Vacina removida com sucesso!");
                    } else {
                        System.out.println("Falha ao remover a vacina!");
                    }

                    break;
                    case 3:
                        System.out.println("Deseja listar todas as vacinas [S] ou apenas uma [U]?");
                        String opcaoVaString = scanner.nextLine().toUpperCase();
                        Vacinas vacinas2 = new Vacinas();

                        if (opcaoVaString.equals("S")) {
                            List<Vacinas> todasVacinas = vacinas2.getListaDeVacinas();
                            vacinas2.listarVacinasCadastradas(todasVacinas);
                        } else if (opcaoVaString.equals("U")) {
                            System.out.println("Digite o nome da vacina que deseja listar: ");
                            String nomeVacina = scanner.nextLine();
                            List<Vacinas> vacinasEncontradas = vacinas2.listaVacinasCadastradas(nomeVacina);
                            vacinas2.listarVacinasCadastradas(vacinasEncontradas);
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        break;

                

                case 4:
                    // Lógica para buscar vacinas
                    break;
                case 5:
                    // Lógica para consultar quantidade de pessoas vacinadas com uma vacina
                    break;
                case 6:
                    // Lógica para editar vacinas
                    break;
                case 7:
                    System.out.println("Obrigada por utilizar nosso sistema!\nAté mais.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
