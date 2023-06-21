package Exercicio1;

public class AppGenero {

    public static void main(String[] args) {
        Genero g1 = new Genero();
        g1.setCod(001);
        g1.setDesc("Terror");

        System.out.println(g1.getCod());
        System.out.println(g1.getDesc());
    }

}
