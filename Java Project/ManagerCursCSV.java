package clase;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ManagerCursCSV extends ManagerCursuri implements IOperatiiManagerCurs {
    File studenti, profesori, cursuri;
    ArrayList<Curs> lista = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Profesor> profesors = new ArrayList<>();

    public ManagerCursCSV() {
        try {
            studenti = new File("studenti.csv");
            studenti.createNewFile();
            profesori = new File("profesori.csv");
            profesori.createNewFile();
            cursuri = new File("cursuri.csv");
            cursuri.createNewFile();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ManagerCursCSV(File studenti, File profesori, File cursuri) {
        this.studenti = studenti;
        this.profesori = profesori;
        this.cursuri = cursuri;
    }

    public void CitesteDateDinFisiere() {
        try {
            profesors = PopuleazaProfesori();
            students = PopuleazaStudenti();
            lista = PopuleazaCursuri(profesors, students);

        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            for (Curs d : lista)
                System.out.println(d);
        }
        }

    @Override
    public ArrayList<Student> PopuleazaStudenti() {
        ArrayList<Student> studentilist = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(studenti));
            String line = br.readLine();
            if (line != null)
                line = br.readLine();
            while (line != null) {
                String[] splituri = line.split(",");
                Student s = new Student(splituri[0], splituri[1].trim(), Integer.parseInt(splituri[2].trim()));
                studentilist.add(s);
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return studentilist;
    }

    @Override
    public ArrayList<Profesor> PopuleazaProfesori() {
        ArrayList<Profesor> profilist = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(profesori));
            String line = br.readLine();
            if (line != null)
                line = br.readLine();
            while (line != null) {
                String[] splituri = line.split(",");
                Profesor p = new Profesor(splituri[0], splituri[1].trim());
                profilist.add(p);
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return profilist;
    }

    @Override
    public ArrayList<Curs> PopuleazaCursuri(ArrayList<Profesor> profesor, ArrayList<Student> student) {
        ArrayList<Curs> curslist = new ArrayList<>();
        Student[] st = new Student[student.size()];
        Profesor[] pr = new Profesor[profesor.size()];
        st = student.toArray(st);
        pr = profesor.toArray(pr);
        Iterator<Profesor> i = profesor.iterator();
        int index = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(cursuri));
            String line = br.readLine();
            if (line != null)
                line = br.readLine();
            while (line != null)
            {
                if (i.hasNext())
                    i.next();
                String[] splituri = line.split(",");
                Curs c = new Curs(splituri[0], splituri[1].trim());
                curslist.add(c);
                index++;
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return curslist;
    }

    public void ScrieCursuriInFisier() {
        try {
            BufferedWriter bwc = new BufferedWriter(new FileWriter(cursuri));
            BufferedWriter bws = new BufferedWriter(new FileWriter(studenti));
            BufferedWriter bwp = new BufferedWriter(new FileWriter(profesori));
            try
            {
                bwc.write("Nume, Descriere\r\n");
                bws.write("Nume, Prenume, Grupa\r\n");
                bwp.write("Nume, Prenume\r\n");
                for(Student stud : students)
                {
                    bws.write(stud.toString() + "\r\n");
                }
                for(Profesor prof : profesors)
                {
                    bwp.write(prof.toString() + "\r\n");
                }
                for(Curs cursur : lista)
                {
                    bwc.write(cursur.toString() + "\r\n");
                }
                bwc.flush();
                bwp.flush();
                bws.flush();
            }catch (IOException e)
            {
                e.printStackTrace();
            }finally {
                bwc.close();
                bwp.close();
                bws.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void AddStudent(Student student)
    {
        int noualungime = students.size()+1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for(Student s : students)
        {
            aux[index++] = s;
        }
        aux[index] = student;
        students.add(aux[index]);
    }
    public void DeleteStudent(Student student)
    {
        Iterator<Student> i = students.iterator();
        while(i.hasNext())
        {
            if(i.next() == student)
            {
                i.remove();
            }
        }
    }
    public void UpdateStudent(Student student,Student student1)
    {
        int index = 0;
        for(Student s : students)
        {
            if(s.getNume().equals(student.getNume()))
            {
                index = students.indexOf(s);
                students.set(index,student1);
            }
        }
    }
    public void AddProfesor(Profesor profesor)
    {
        int noualungime = profesors.size()+1;
        Profesor[] aux = new Profesor[noualungime];
        int index = 0;
        for (Profesor pr : profesors)
        {
            aux[index++] = pr;
        }
        aux[index] = profesor;
        profesors.add(aux[index]);
    }
    public void DeleteProfesor(Profesor profesor)
    {
        Iterator<Profesor> i = profesors.iterator();
        while(i.hasNext())
        {
            if(i.next() == profesor)
            {
                i.remove();
            }
        }
    }
    public void UpdateProfesor(Profesor profesor,Profesor profesor1)
    {

        int index = 0;
        for(Profesor p : profesors)
        {
            if(p.getNume().equals(profesor.getNume()))
            {
                index = profesors.indexOf(p);
                profesors.set(index, profesor1);
            }
        }

    }
    public void AddCurs(Curs curs)
    {
        int noualungime = lista.size()+1;
        Curs[] aux = new Curs[noualungime];
        int index = 0 ;
        for (Curs c : lista)
        {
            aux[index++] = c;
        }
        aux[index] = curs;
        lista.add(aux[index]);
    }
    public void DeleteCurs(Curs curs)
    {
        Iterator<Curs> i = lista.iterator();
        while (i.hasNext())
        {
            if(i.next() == curs)
            {
                i.remove();
            }
        }
    }
    public void UpdateCurs(Curs curs,Curs curs1)
    {
        int index = 0;
        for(Curs c : lista) {
            if(c.GetNume().equals(curs.GetNume()))
            {
                index = lista.indexOf(c);
                lista.set(index, curs1);
            }
        }
    }
}