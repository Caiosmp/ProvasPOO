public class Professor extends Pessoa {
    private String curso;

    

    @Override
    public String toString() {
        return "Professor [curso = " + curso + "]\n";
    }



    public String getCurso() {
        return curso;
    }



    public void setCurso(String curso) {
        this.curso = curso;
    }
}