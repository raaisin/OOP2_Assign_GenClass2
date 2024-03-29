package Map;

import java.util.ArrayList;

public class MMap<K, V> {

    ArrayList<K> keys = new ArrayList<K>();
    ArrayList<V> values = new ArrayList<V>();

    public MMap(ArrayList<K> keys, ArrayList<V> values) {
        this.keys = keys;
        this.values = values;
    }

    public void put(K key, V val){
        for(int i = 0; i < keys.size(); i++){
            if(key.equals(keys.get(i))){
                values.set(i, val);
                return;
            }
        }

        keys.add(key);
        values.add(val);
    }

    public V get(K key){
        for(int i = 0; i < keys.size(); i++){
            if(key.equals(keys.get(i))){
                return values.get(i);
            }
        }
        return null;
    }

    public V remove(K key){

        V ret;

        for(int i = 0; i < keys.size(); i++){
            if(key.equals(keys.get(i))){
                ret = values.get(i);

                values.remove(values.get(i));
                keys.remove(keys.get(i));

                return ret;

            }
        }
        return null;

    }
}
