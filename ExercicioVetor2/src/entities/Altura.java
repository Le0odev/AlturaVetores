package entities;

import java.util.ArrayList;

public class Altura {

    public String name;
    public int idade;
    public double altura;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Altura(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public static double calcularMediaAltura(Altura[] alturas) {
        double soma = 0;
        for (Altura pessoa : alturas) {
            soma += pessoa.getAltura();
        }
        return soma / alturas.length;
    }

    public static ArrayList<String> listarNomesMenores(Altura[] alturas) {
        ArrayList<String> nomesMenores = new ArrayList<>();
        for (Altura pessoa : alturas) {
            if (pessoa.getIdade() < 16) {
                nomesMenores.add(pessoa.getName());
            }
        }
        return nomesMenores;
    }

    public static double calcularPercentualMenores(Altura[] alturas) {
        int totalMenores = 0;
        for (Altura pessoa : alturas) {
            if (pessoa.getIdade() < 16) {
                totalMenores++;
            }
        }
        if (alturas.length == 0) {
            return 0; // Retorna 0 se não houver nenhuma pessoa no array
        }
        return ((double) totalMenores / alturas.length) * 100;
    }

}
