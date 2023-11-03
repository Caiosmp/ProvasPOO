import java.util.ArrayList;
import java.util.List;

public class Base {

    public List<Laboratorio> lab() {
        List<Laboratorio> labs = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
        Laboratorio laba = new Laboratorio();
        Equipamentos ep = new Equipamentos();
            laba.setId(i);
            laba.setSigla("LAB" + i);
            laba.setConjEquipamentos(ep); 
            ep.setId(i);
            ep.setDescricao("EQ" + i);
            labs.add(laba);
    }
        return labs;
    }

    public List<Professor> prof() {
        List<Professor> teach = new ArrayList<>();
        

        for (int i = 1; i < 4; i++) {
            Professor prof = new Professor();
            prof.setId(i);
            prof.setNome("PROF" + i);
            prof.setCurso("C" + i);
            teach.add(prof);
    }
    
        return teach;
    
    }

    public List <Aluno> alunos() {
        List<Aluno> aln = new ArrayList<>();
        

        for (int i = 1; i < 21; i++) {
            Aluno aluno = new Aluno();
            aluno.setId(i);
            aluno.setNome("ALN" + i);
            aluno.setMatricula("M" + i);
            aln.add(aluno);
        }

    
        return aln;
    }
}



    

