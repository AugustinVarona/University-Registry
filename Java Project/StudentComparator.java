package clase;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        int result_nume = a.nume.compareTo(b.nume);
        int result_prenume = a.prenume.compareTo(b.prenume);
        if(result_nume > 0)
            return 1;
        else
            if(result_nume < 0)
                return -1;
            else
                if(result_prenume > 0)
                    return 1;
                else
                    if(result_prenume < 0)
                        return -1;
                    else
                    if(a.grupa > b.grupa)
                        return 1;
                    else if(a.grupa < b.grupa)
                        return -1;
        return 0;

    }
}
