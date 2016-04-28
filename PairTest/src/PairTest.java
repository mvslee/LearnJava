import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by mavis on 4/19/16.
 */
public class PairTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words =(br.readLine()).split(" ");
        for (String e:words) System.out.print(e + " ");
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class Pair<T>
{
    private T first;
    private T second;

    public Pair(){first = null; second = null;}
    public Pair(T first, T second){ this.first = first; this.second = second;}

    public T getFirst(){ return first;}
    public T getSecond(){ return second;}
}

class ArrayAlg
{
    /**
     * Compare a pair
     */
    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for(String e:a)
        {
            if (min.compareTo(e)>0) min = e;
            if (max.compareTo(e)<0) max = e;
        }
        return new Pair<String>(min, max);
    }
}
