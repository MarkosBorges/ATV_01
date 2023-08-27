package controller;
import model.Funcionario;
import model.Produto;
import model.Carro;
import model.Conta;

import java.util.ArrayList;
import java.util.List;


public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcos", 1.110);
        Funcionario f2 = new Funcionario();
        f2.setNome("Joao");
        f2.setSalario(2000);

        System.out.println("==== FUNCIONARIO =====");
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        f2.setSalario(1000);
        System.out.println("Salario atualizado: " + f2.getSalario());
        System.out.println();

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        System.out.println(funcionarios);

        // =================== PORDUTO =============================
        Produto p1 = new Produto("Mouse","Mouse USB OEX", 25.00, 50);
        Produto p2 = new Produto("Teclado", "Teclado sem fio", 80.00, 15);

        System.out.println();
        System.out.println("==== PRODUTO =====");
        System.out.println(p1.toString());
        System.out.println(p2.toString());


        //============ CARRO ============================

        Carro c1 = new Carro("Ford","Freestyle",2015);

        System.out.println("\n");
        System.out.println("==== CARRO =====");
        System.out.println(c1.toString());

        //=============== CONTA =======================

        Conta con1 = new Conta(120.000,2500.00);
        System.out.println();
        System.out.println("======= CONTA ========");
        System.out.println(con1.toString());

    }
}
