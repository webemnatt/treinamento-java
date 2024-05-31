import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import livro.Livro;
import livro.Comparator.*;

public class App {
    public static void main(String[] args) throws Exception {
        Box box = new Box();
        box.set("Hello");
        String message = (String) box.get();
        System.out.println("mensagem1 " + message);

        Box2<String> box2 = new Box2<String>();
        box2.set("Olá");
        String message2 = box2.get();

        System.out.println("mensagem2 " + message2);

        List<? extends Number> numbers = new ArrayList<Integer>();

        // numbers.add(10);//erro

        addNumber(numbers, 10);
        List<Number> result = new ArrayList<>(numbers);
        System.out.println(result);

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Senhor dos Anéis", "tokien", 2001));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997));
        livros.add(new Livro("O Hobbit", "Tokien", 1937));
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("----------com Collections.sort()------------------");
        Collections.sort(livros);

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("----------com Comparable.compareTo() customizado------------------");
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 2001);
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937);

        System.out.println(livro1.compareTo(livro2));
        System.out.println(livro2.compareTo(livro1));
        // saída 1: é o mais recente.
        // saída -1: é o mais antigo

        System.out.println("----------fazendo uso do Comparator estilizado em classe--------------");
        // Ordenar a lista usando o Comparator personalizado
        livros.sort(new CompararAutor());

        // Imprimir a lista ordenada
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("----------Comparator ordem direta por titulo-----------------");
        // Ordenar a lista usando o Comparator personalizado

        Comparator<Livro> comparador = (l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo());
        livros.sort(comparador);

        // Imprimir a lista ordenada
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("----------Comparator ordem inversa por ano-----------------");
        Comparator<Livro> comparadorInverso = Collections.reverseOrder((l1, l2) -> l1.getAno() - l2.getAno());
        livros.sort(comparadorInverso);

        // Imprimir a lista ordenada
        for (Livro livro : livros) {
            System.out.println(livro.getAno());
        }

    }

    public static void addNumber(List<? extends Number> list, Number number) {
        List<Number> tempList = new ArrayList<>(list);
        tempList.add(number);
    }

}
