package com.cursoEmVideo.POOJava.Aula10;

public class Aula10b {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Daniela");
        p2.setNome("João");
        p3.setNome("Juliana");
        p4.setNome("Augusto");

        p1.setSexo("feminino");
        p2.setSexo("Masculino");
        p3.setSexo("Feminino");
        p4.setSexo("Masculino");

        p1.setIdade(22);
        p2.setIdade(43);
        p3.setIdade(45);
        p4.setIdade(25);

        p2.setCurso("Medicina");
        p3.setSalario(2500.75f);
        p4.setTrabalhando(true);

        p3.aumento(550);
        //p4.cancelarMatr(false);
        System.out.println(p1.FichaPessoal());
        System.out.println(p2.FichaPessoal());
        System.out.println(p3.FichaPessoal());
        System.out.println(p4.FichaPessoal());
    }
}
