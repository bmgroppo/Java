package Exercicio2;

public class Funcionario {

    private int matricula;
    private String nome;
    private double salario;

    public int getMat(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setMatricula(int mat){
        this.matricula = mat;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double sal){
        this.salario = sal;
    }
    public String toString(int numero){
        return numero+"";
    }
}
