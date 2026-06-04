package arvore;

import model.Curso;

public class No {
    public Curso curso;
    public No esquerda;
    public No direita;

    public No(Curso curso) {
        this.curso = curso;
        this.esquerda = null;
        this.direita = null;
    }
}
