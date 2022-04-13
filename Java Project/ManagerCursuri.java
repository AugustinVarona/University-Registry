package clase;
import javax.naming.directory.InvalidAttributesException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import clase.Persoana.Gen;
import java.util.*;
public class ManagerCursuri implements OperatiiManagerCursuri {
    Curs[] cursuri;
    List<Curs> cursuriH = new ArrayList<>();
    TreeSet<Curs> cursuriT = new TreeSet<>(new CursComparator());
    public int[] note = new int[0];
    public ManagerCursuri()
    {
        Connection conn = null;
        cursuri = new Curs[0];
    }
    public void List(Curs curs)
    {
        cursuriH.add(curs);
    }
    public void Tree(Curs curs)
    {
        cursuriT.add(curs);
    }
    public void PrintTree()
    {
        System.out.println(cursuriT);
    }

    public void procentajIntegralistiDupaGen(Gen gen)
    {
        boolean Integralist = false;
        int ibaiat = 0;
        int ifete = 0;
        int nr = 0;int c = 0;
        for (int i = 0; i < cursuri.length; i++)
            for (int j = 0; j < cursuri[i].studenti.length; j++)
            {

                if(gen == cursuri[i].studenti[j].getGen())
                {
                    if(cursuri[i].studenti[j].getNota(i) >= 5)
                    {
                        nr++;
                    }
                    if(nr == cursuri[i].studenti[j].getLungime())
                    {
                        Integralist = true;
                    }
                    if(Integralist == true)
                    {
                        c++;
                    }if(gen == Gen.MASCULIN)
                {
                    ibaiat++;
                }
                else
                    ifete++;

                }
            }

        if(gen == Gen.MASCULIN)
        {
            System.out.println(c*100/ibaiat + "% dintre baieti sunt integralisti. ");
        }
        else
        {
            System.out.println(c*100/ifete + "% dintre fete sunt integraliste.");
        }
    }
    public void AddCurs(Curs curs)
    {
        try{
            if(curs == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        int noualungime = cursuri.length+1;
        Curs[] aux = new Curs[noualungime];
        int index =0;
        for(Curs c : cursuri)
        {
            aux[index++] = c;
        }
//la final adaugam noul curs pe ultimul index
        aux[index] = curs;
//si realocam lista de curs cu aux;
        this.cursuri = new Curs[noualungime];
        System.arraycopy(aux, 0, cursuri, 0, noualungime);
    }
    public void DeleteCurs(Curs curs)
    {
        try{
            if(curs == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        int noualungime = cursuri.length-1;
        Curs[] copy = new Curs[noualungime];
        int index =0;
        for(int i = 0;i< cursuri.length;i++)
        {
            if(cursuri[i].equals(curs))
            {
                copy[index] = cursuri[i];
                index++;
            }
        }
        cursuri = copy;
    }
    public void UpdateCurs(Curs curs)
    {
        try{
            if(curs == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;i<cursuri.length; i++)
        {
            System.out.println("Introduceti un nou nume:");
            cursuri[i].SetNume(keyboard.next());
            System.out.println("Introduceti o noua descriere:");
            cursuri[i].SetDescriere(keyboard.next());
        }
    }
    public void AfisareCursuri()
    {
        for(int i = 0; i < cursuri.length; i++)
        {
            System.out.println("Curs " + i);
            System.out.println("Nume:" + cursuri[i].GetNume());
            System.out.println("Descriere:" + cursuri[i].GetDescriere());
        }
    }
    public void AfiseazaCursuriLaConsola()
    {
        for(Curs c : cursuri)
            System.out.println(c);
    }
    public void AfiseazaNote() {
        for (int i = 0; i < cursuri.length; i++)
            for (int j = 0; j < cursuri[i].studenti.length; j++)
        {
            System.out.println("Curs " + i);
            System.out.println("Student:");
            System.out.print("  Nume:" + cursuri[i].studenti[j].getNume());
            System.out.print("  Prenume:" + cursuri[i].studenti[j].getPrenume());
            System.out.print("  Grupa:" + cursuri[i].studenti[j].getGrupa());
            System.out.println("  Nota:" + cursuri[i].studenti[j].getNota(i));
        }
    }
    public void Notare(Curs curs)
    {
        try{
            if(curs == null)
                throw new InvalidAttributesException();
        }
        catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < cursuri.length; i++)
        {
            for (int j = 0; j < cursuri[i].studenti.length; j++) {
                if(cursuri[i].equals(curs))
                {
                    System.out.println("Introduceti nota:");
                    cursuri[i].studenti[j].setNota(keyboard.nextInt());
                }
            }
        }
    }
}