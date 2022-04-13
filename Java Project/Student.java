package clase;
import javax.naming.directory.InvalidAttributesException;
import java.util.Objects;
import java.util.Set;
public class Student extends Persoana {
    int grupa;
    int nota;
    int[] note = new int[0];
    long id;
    public Student()
    {
        nume = "";
        prenume = "";
        grupa = 0;
        gen = Gen.NESPECIFICAT;
    }
    public Student(String nume, String prenume, int grupa)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
    }
    @Override
    public String toString() {
        return nume + "," + prenume + "," + grupa;
    }
    public void setGrupa(int grupa)
    {
        this.grupa = grupa;
        try{
            if(grupa == 0 || grupa < 0)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Student))
            return false;
        if (getClass() != o.getClass())
        {
            return false;
        }
        Student student = (Student) o;
        if(this.nume == student.nume)
            return false;
        if(this.prenume == student.prenume)
            return false;
        if(this.grupa == student.grupa)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + nume.hashCode();
        result = 31 * result + prenume.hashCode();
        result = 31 * result + grupa;
        return result;
    }
    public void setNota(int nota)
    {
        try{
        if(nota == 0)
            throw new InvalidAttributesException();
        else
        if(nota < 0)
            throw new InvalidAttributesException();
        else
        if(nota > 10)
            throw new InvalidAttributesException();
    }catch (InvalidAttributesException e)
    {
        System.out.println("Valoarea citita este invalida.");
        System.exit(0);
    }
        int noualungime = note.length+1;
        int[] aux = new int[noualungime];
        int i = 0;
        for(int s : note)
        {
            aux[i++] = s;
        }
        aux[i] = nota;
        this.note = new int[noualungime];
        System.arraycopy(aux, 0, note, 0, noualungime);

    }
    public int getNota(int i)
    {
        return note[i];
    }
    public int  getLungime()
    {
        return note.length;
    }
    public int getGrupa() {
        return grupa;
    }
}