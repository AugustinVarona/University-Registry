package clase;

import java.util.Comparator;

public class CursComparator implements Comparator<Curs>
{

    public int compare(Curs a, Curs b) {
        int result_nume = a.nume.compareTo(b.nume);
        int result_profu = a.profu.getNume().compareTo(b.profu.getNume());
        if (result_nume > 0)
            return 1;
        else if (result_nume < 0)
            return -1;
        else if (result_profu > 0)
            return 1;
        else if (result_profu < 0)
            return -1;
        else if (a.studenti.length > b.studenti.length)
            return 1;
        else if (a.studenti.length < b.studenti.length)
            return -1;
        else return 0;
    }
}
