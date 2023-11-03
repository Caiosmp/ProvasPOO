public class Aluno extends Pessoa {
    private String matricula;

    

    @Override
    public String toString() {
        return "Aluno [matricula = " + matricula + "]\n";
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}