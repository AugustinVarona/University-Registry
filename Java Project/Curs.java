package clase;
import javax.naming.directory.InvalidAttributesException;
import java.lang.reflect.Array;
import java.util.*;

import clase.Student.*;

public  class Curs implements OperatiiCurs {
    String nume;
    String descriere;
    Profesor profu;
    Set<Student> studentiH = new HashSet<>();
    TreeSet<Student> tree = new TreeSet<>(new StudentComparator());
    Student[] studenti;
    Gen gen;
    public Curs()
    {
        nume = "";
        descriere = "";
        profu = null;
        studenti = new Student[0];
    }
    public Curs(String nume, String descriere)
    {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
        this.studenti = studenti;
    }
    public enum Gen {
        MASCULIN ,
        FEMININ,
        NESPECIFICAT
    }
    double medieNoteStudentiGen(Persoana.Gen gen)
    {
        float medie = 0;
        int nr = 0;
        float suma = 0;
        for (int i = 0; i < studenti.length; i++)
        {   for(int j = 0; j < studenti[i].getLungime(); j++)
            {
                if (gen == studenti[i].getGen())
                {
                    nr++;
                    suma = suma + studenti[i].getNota(j);
                }
            }
        }
        medie = suma / nr;
        return medie;
    }
    public void HashSet(Student student)
    {
        studentiH.add(student);
    }
    public void PrintHashSet()
    {
        System.out.println(studentiH);
    }
    public void PrintHashCode(Student student)
    {
        System.out.println(student);
        System.out.println(student.hashCode());
    }
    public void TreeSet(Student student)
    {
        tree.add(student);
    }
    public void PrintTreeSet()
    {
        System.out.println(tree);
    }
    public void SetNume(String Nume)
    {
        this.nume = Nume;
        try{
            if(nume == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }
    public void SetDescriere(String Descriere)

    {
        this.descriere = Descriere;
        try{
            if(Descriere == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }
    public String GetNume()
    {
        return nume;
    }
    public String GetDescriere()
    {
        return descriere;
    }
    public void UpdateProfesor(Profesor profu)
    {
        this.profu = profu;
        try{
            if(profu == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
        }
    }
    public void AddProfesor(Profesor profu)
    {
        try{
            if(profu == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduceti nume profesor:");
        profu.setNume(keyboard.next());
        System.out.println("Introduceti un nou prenume:");
        profu.setPrenume(keyboard.next());
    }
    public void DeleteProfesor()
    {
        profu.setNume("");
        profu.setPrenume("");
    }
    public void AddStudent(Student student)
    {
        try{
            if(student == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        int noualungime = studenti.length+1;
        Student[] aux = new Student[noualungime];
        int index =0;
        for(Student s : studenti)
        {
            aux[index++] = s;
        }
        aux[index] = student;
//si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0, noualungime);
    }
    public void UpdateStudent(Student student)
    {
        try{
            if(student == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;i < studenti.length; i++)
        {
            if(studenti[i].equals(student))
            {
                System.out.println("Introduceti nume:");
                studenti[i].setNume(keyboard.next());
                System.out.println("Introduceti prenume:");
                studenti[i].setPrenume(keyboard.next());
                System.out.println("Introduceti grupa:");
                studenti[i].setGrupa(keyboard.nextInt());
            }
        }
    }
    public void RemoveStudent(Student student)
    {
        try{
            if(student == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        int noualungime = studenti.length-1;
        Student[] copy = new Student[noualungime];
        int index = 0;
        for(int i = 0; i < studenti.length; i++)
        {
            if(!studenti[i].equals(student))
            {
                copy[index] = studenti[i];
                index++;
            }
        }
        studenti = copy;
    }
    public void AfisareStudenti()
    {
        for(int i = 0;i< studenti.length;i++)
        {
            System.out.println("Index:" + i + " " + studenti[i]);
        }
    }
    public void MediaNoteCurs()
    {
        float media = 0;float suma = 0;int nr = 0;
        for(int i = 0;i < studenti.length;i++)
        {
            nr++;
            //suma = suma + note[i];

        }
        media = suma / nr;
        System.out.println("Media notelor studentilor la curs:" + media);
    }
    public void MediaNoteProfesor(Profesor profu)
    {
        try{
            if(profu == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        float media = 0;float suma = 0;int nr = 0;
        for(int i = 0;i < studenti.length;i++)
        {
            nr++;
            suma = suma + studenti[i].getNota(i);

        }
        media = suma / nr;
        System.out.println("Profesor:" + profu.getNume() + " " + profu.getPrenume());
        System.out.println("Media notelor studentilor date de profesorul " + profu.getNume() + " " + profu.getPrenume() + " este:" + media);
    }
    public void UpdateCurs(String nume, String descriere)
    {
        try{
            if(nume == null || descriere == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        this.nume = nume;
        this.descriere = descriere;
    }
    @Override
    public String toString() {
           return nume + "," + descriere;
    }
    }