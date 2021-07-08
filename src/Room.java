public class Room {
    private Integer quantDisp;
    private Integer tipo;
    private String modelo;
    private Integer preco;

    public Room(Integer quantDisp, Integer tipo, String modelo, Integer preco) {
        this.quantDisp = quantDisp;
        this.tipo = tipo;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Integer getQuantDisp() {
        return quantDisp;
    }

    public void setQuantDisp(Integer quantDisp) {
        this.quantDisp = quantDisp;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return quantDisp + " rooms of type " +
                tipo + " are available for " +
                preco + " Euros per night.";
    }
}
