
public class Equipamentos {

    private int id;
    private String descricao;

    enum tipo {
        COMPUTADOR, PROJETOR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Equipamento [id = "+ getId() + ", tipo = " + tipo.COMPUTADOR + ", Descrição: = " + descricao ;
    }

     


}
