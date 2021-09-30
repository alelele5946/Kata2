package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    protected T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public HashMap<T,Integer> getHistogram(){
        HashMap<T, Integer> histogram = new HashMap<T, Integer>();
        for (T key : this.data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) +1 : 1);
            
        }
        return histogram;
    }
    
}
