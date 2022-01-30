package dio.poo.entities;

public class Curso extends Conteudo {

    private double cargaHoraria;


    @Override
    public double calculaxp() {
        return XP_PADRAO * cargaHoraria;
    }


    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nTitulo = " + getTitulo() + "\n"
                + "Descricao = " + getDescricao() + "\n"
                + "CargaHoraria = " + cargaHoraria + "\n";
    }
}
