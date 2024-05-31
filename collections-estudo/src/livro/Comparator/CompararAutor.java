package livro.Comparator;

import java.util.Comparator;

import livro.Livro;

public class CompararAutor implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}
