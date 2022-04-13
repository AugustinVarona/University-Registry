//In Thread1 am facut exercitiul cu numerele de la 1 la 1000
//In Thread2 am thread-urile pentru citire si scriere in fisiere
package clase;
import java.util.*;
public class ClaseDemo {
    public static void main(String[] args) {
//definire studenti
        Student[] studenti = new Student[]{new Student("Andrei","Negoita",2231),new Student("Ion","Mateescu",4221)};
        Student student1 = new Student("Varona","Augustin",603);
        Student student2 = new Student("Ion","Elena",8604);
        Student student3 = new Student("Toba","Maria",5603);
        Student student4 = new Student("Varona", "Augustin", 603);
        ManagerCursCSV m = new ManagerCursCSV();
        //definire profesor
        Profesor prof = new Profesor("Anton","Panaitescu");
        Profesor prof1 = new Profesor("Ion", "Popescu");
        Profesor prof2 = new Profesor("Gicu", "Gogu");
//definire curs nou
        Curs curs = new Curs("Rezistenta Materialelor", "calculul reactiunilor; diagramele de eforturi; calculul caracteristicilor geometrice ale suprafetelor plane şi calculul elementelor de rezistenta la solicitari simple"
                );
        Curs curs1 = new Curs("Matematici Speciale", "Matematica");
        Curs curs2 = new Curs("Matematici Speciale", "Integrale; limite; Fourier");
        AWT awt = new AWT();
        /*m.AddStudent(student1);
        m.AddStudent(student2);
        m.AddStudent(student3);
        m.AddProfesor(prof);
        m.AddProfesor(prof1);
        m.AddProfesor(prof2);
        m.AddCurs(curs);
        m.AddCurs(curs1);
        m.AddCurs(curs2);
        m.DeleteCurs(curs);
        Thread4 d = new Thread4();
        d.n = m;
        d.start();
        try {
            d.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        Thread3 t = new Thread3();
        t.p = m;
        t.start();
        try{
            t.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }*/
        //m.ScrieCursuriInFisier();
        //m.CitesteDateDinFisiere();
        //cursuri.AddCurs(curs);
        //cursuri.AddCurs(curs1);
        //cursuri.ModificaCurs();
        //cursuri.StergeCurs();
       // curs.AddStudent(student1);
       // curs.AddStudent(student3);
        //curs.AddStudent(student2);
        //curs.AddStudent(student4);
        //curs.PrintHashCode(student1);
        //curs.PrintHashCode(student2);
        //curs.PrintHashCode(student4);
        //curs1.AddStudent(student1);
        //curs1.AddStudent(student3);
        //curs1.AddStudent(student2);
        //cursuri.AfiseazaCursuriLaConsola();
        //curs.UpdateStudent(student1);
        //curs1.UpdateProfesor(prof);
        //curs.AdaugareProfesor(prof);
        //curs.StergeProfesor();
        //curs.AfisareStudenti();
        //cursuri.AfisareCursuri();
        //cursuri.Notare(curs);
        //cursuri.Notare(curs1);
        //cursuri.AfiseazaNote();
        //curs.MediaNoteCurs();
        //curs.MediaNoteProfesor(prof);
        //curs.RemoveStudent(student1);
        //cursuri.AfiseazaCursuriLaConsola();
        //System.out.println("Media studentior de gen masculin este: " + String.format("%.2f", curs.medieNoteStudentiGen(Persoana.Gen.MASCULIN)));
        //System.out.println("Media studentior de gen feminin este: " + String.format("%.2f", curs.medieNoteStudentiGen(Persoana.Gen.FEMININ)));
       // cursuri.procentajIntegralistiDupaGen(Persoana.Gen.MASCULIN);
        //cursuri.procentajIntegralistiDupaGen(Persoana.Gen.FEMININ);
        /*curs.TreeSet(student1);
        curs.TreeSet(student2);
        curs.TreeSet(student3);
        curs.TreeSet(student4);
        curs.PrintTreeSet();*/
        /*curs.HashSet(student1);
        curs.HashSet(student2);
        curs.HashSet(student3);
        curs.HashSet(student4);
        curs.PrintHashSet();*/
        /*cursuri.Tree(curs);
        cursuri.Tree(curs1);
        cursuri.Tree(curs2);
        cursuri.PrintTree();*/
    }
}