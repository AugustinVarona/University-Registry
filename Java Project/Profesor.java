package clase;
import javax.naming.directory.InvalidAttributesException;

public class Profesor extends Persoana {
    @Override
    public String toString() {
        return nume + "," + prenume ;
    }

    public Profesor() {
        nume = "";
        prenume = "";
    }

    public Profesor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
}