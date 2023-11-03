
public class Laboratorio {
    private int id;
    private String sigla;
    private Equipamentos conjEquipamentos;
    private int capacidade = 20;

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getSigla() {
        return sigla;
    }



    public void setSigla(String string) {
        this.sigla = string;
    }



    public int getCapacidade() {
        return capacidade;
    }



    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

      public Equipamentos getConjEquipamentos() {
        return conjEquipamentos;
    }

   
    public void setConjEquipamentos(Equipamentos conjEquipamentos) {
        this.conjEquipamentos = conjEquipamentos;
    }



    @Override
    public String toString() {

        return "Laboratorio [id = " + id + ", sigla = "  + sigla + ", Equipamentos = " + conjEquipamentos + ", capacidade = " + capacidade + "]\n";

}


  

}


