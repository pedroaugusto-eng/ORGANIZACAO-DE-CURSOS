package model;

public class Curso {
    public int codigo;
    public String nome;
    public int cargaHoraria;
    public String area;

    public Curso(int codigo, String nome, int cargaHoraria, String area) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.area = area;
    }

    public String toString() {
        return "Codigo: " + codigo + " | Nome: " + nome +
                " | Carga Horaria: " + cargaHoraria + "h | Area: " + area;
    }
}
