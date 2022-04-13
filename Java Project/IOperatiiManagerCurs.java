package clase;

import java.util.ArrayList;

public interface IOperatiiManagerCurs {
    public void CitesteDateDinFisiere();
    public ArrayList<Student> PopuleazaStudenti();
    public ArrayList<Profesor> PopuleazaProfesori();
    public ArrayList<Curs> PopuleazaCursuri(ArrayList<Profesor> proflist, ArrayList<Student> studentlist);
    public void ScrieCursuriInFisier();
}
