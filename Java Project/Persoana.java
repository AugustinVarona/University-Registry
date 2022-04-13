package clase;
import javax.naming.directory.InvalidAttributesException;
public abstract class Persoana {
    String nume;
    String prenume;
    Gen gen;
    public enum Gen {
        MASCULIN ,
        FEMININ,
        NESPECIFICAT
    }
    public void setNume(String nume)
    {
        this.nume = nume;
        try{
            if(nume == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }
    public String getNume()
    {
        return nume;
    }
    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
        try{
            if(prenume == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }
    public String getPrenume()
    {
        return prenume;
    }

    public void setGen(Gen gen)
    {
        this.gen = gen;
        try{
            if(gen == null)
                throw new InvalidAttributesException();
        }catch (InvalidAttributesException e)
        {
            System.out.println("Valoarea citita este invalida.");
            System.exit(0);
        }
    }
    public Gen getGen() {
        return gen;
    }
    @Override
    public String toString() {
        return "Persoana{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }
}