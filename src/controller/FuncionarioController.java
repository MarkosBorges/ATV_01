package controller;
import model.Funcionario;


public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcos", 1.110);
        Funcionario f2 = new Funcionario();
        f2.setNome("Joao");
        f2.setSalario(222220);

        System.out.println(f1);
        System.out.println("Nome:"+ f2.getNome());
        System.out.println("Salario:"+ f2.getSalario());
    }
}
