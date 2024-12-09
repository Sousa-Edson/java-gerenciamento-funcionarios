import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<FuncionarioInterno> funcionarios = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new FuncionarioInterno(nome, departamento, salario));
        }

        double aumento = scanner.nextDouble();


        for (int i = 0; i < funcionarios.size(); i++) {
            // TODO: Complete o código para atualizar os salários dos funcionários
            // 1. Obtenha o funcionário atual da lista.
            FuncionarioInterno funcionario = funcionarios.get(i);
            // 2. Calcule o novo salário: novoSalario = salario * (1 + aumento / 100).
            double novoSalario = funcionario.salario * (1 + aumento / 100);
            // 3. Imprima o nome e o novo salário do funcionário no formato: "Nome: X - Novo Salario: Y".
            System.out.printf("Nome: %s - Novo Salario: %.2f%n", funcionario.nome, novoSalario);
            // 4. Certifique-se de que o novo salário seja impresso com duas casas decimais.


        }

        scanner.close();
    }
}

class FuncionarioInterno {
    String nome;
    String departamento;
    double salario;

    FuncionarioInterno(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}