package modelo;

import java.time.LocalDate;

public class Pagamento {
    private float valor;

    private LocalDate data;

    public Pagamento(float valor, LocalDate data) {
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", data=" + data +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
