import java.util.ArrayList;
import java.util.Comparator;

public class ShellSort {
    public static ArrayList<Saskaita> shellSort(ArrayList<Saskaita> saskaitos, Comparator<Saskaita> cmp) {
            int n = saskaitos.size();
            int h=1;
            int j;
            while(h <= n/3){
                h = 3*h + 1;   //h is equal to highest sequence of h<=length/3 (1,4,13,40...)
            }
            while(h>0){
                for (int i = h; i < saskaitos.size(); i++) {
                    Saskaita value = saskaitos.get(i);
                    for (j = i; j >= h && cmp.compare(value, saskaitos.get(j - h)) < 0; j -= h) {
                        saskaitos.set(j, saskaitos.get(j - h));
                    }
                    saskaitos.set(j, value);
                } h = (h-1)/3;
            }
            return saskaitos;
    }
}