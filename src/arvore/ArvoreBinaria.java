package arvore;

import model.Curso;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(Curso curso) {
        raiz = inserirRecursivo(raiz, curso);
    }

    private No inserirRecursivo(No no, Curso curso) {
        if (no == null) return new No(curso);
        if (curso.codigo < no.curso.codigo)
            no.esquerda = inserirRecursivo(no.esquerda, curso);
        else if (curso.codigo > no.curso.codigo)
            no.direita = inserirRecursivo(no.direita, curso);
        return no;
    }

    public Curso buscar(int codigo) {
        No resultado = buscarRecursivo(raiz, codigo);
        return resultado != null ? resultado.curso : null;
    }

    private No buscarRecursivo(No no, int codigo) {
        if (no == null || no.curso.codigo == codigo) return no;
        if (codigo < no.curso.codigo) return buscarRecursivo(no.esquerda, codigo);
        return buscarRecursivo(no.direita, codigo);
    }

    public void remover(int codigo) {
        raiz = removerRecursivo(raiz, codigo);
    }

    private No removerRecursivo(No no, int codigo) {
        if (no == null) return null;
        if (codigo < no.curso.codigo)
            no.esquerda = removerRecursivo(no.esquerda, codigo);
        else if (codigo > no.curso.codigo)
            no.direita = removerRecursivo(no.direita, codigo);
        else {
            if (no.esquerda == null) return no.direita;
            if (no.direita == null) return no.esquerda;
            No menor = menorNo(no.direita);
            no.curso = menor.curso;
            no.direita = removerRecursivo(no.direita, menor.curso.codigo);
        }
        return no;
    }

    private No menorNo(No no) {
        while (no.esquerda != null) no = no.esquerda;
        return no;
    }

    private No maiorNo(No no) {
        while (no.direita != null) no = no.direita;
        return no;
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
    }

    private void emOrdemRecursivo(No no) {
        if (no == null) return;
        emOrdemRecursivo(no.esquerda);
        System.out.println(no.curso);
        emOrdemRecursivo(no.direita);
    }

    public void preOrdem() {
        preOrdemRecursivo(raiz);
    }

    private void preOrdemRecursivo(No no) {
        if (no == null) return;
        System.out.println(no.curso);
        preOrdemRecursivo(no.esquerda);
        preOrdemRecursivo(no.direita);
    }

    public void posOrdem() {
        posOrdemRecursivo(raiz);
    }

    private void posOrdemRecursivo(No no) {
        if (no == null) return;
        posOrdemRecursivo(no.esquerda);
        posOrdemRecursivo(no.direita);
        System.out.println(no.curso);
    }

    public int altura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(No no) {
        if (no == null) return -1;
        int altEsq = calcularAltura(no.esquerda);
        int altDir = calcularAltura(no.direita);
        return 1 + Math.max(altEsq, altDir);
    }

    public int contar() {
        return contarRecursivo(raiz);
    }

    private int contarRecursivo(No no) {
        if (no == null) return 0;
        return 1 + contarRecursivo(no.esquerda) + contarRecursivo(no.direita);
    }

    public Curso menorCodigo() {
        if (raiz == null) return null;
        return menorNo(raiz).curso;
    }

    public Curso maiorCodigo() {
        if (raiz == null) return null;
        return maiorNo(raiz).curso;
    }
}
