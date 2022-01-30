package dio.poo.entities;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    @Override
    public double calculaxp() {
        return XP_PADRAO + 20.0;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nTitulo = " + getTitulo() + "\n"
                + "Descricao = " + getDescricao() + "\n"
                + "CargaHoraria = " + date + "\n";
    }
}
