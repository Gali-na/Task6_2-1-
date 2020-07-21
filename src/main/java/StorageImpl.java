import java.util.Objects;

public class StorageImpl<K, V> implements Storage<K, V> {
    final int SIZE = 10;
    private static int count;
    Object[] keyArry;
    Object[] valueArry;

    public StorageImpl() {
        keyArry = new Object[SIZE];
        valueArry = new Object[SIZE];
        count = 0;
    }

    @Override
    public void put(K key, V value) {
        boolean test = true;
        for (int i = 0; i < keyArry.length; i++) {
            if ((key != null && key.equals(keyArry[i])) || key == keyArry[i]) {
                valueArry[i] = value;
                test = false;
            }
        }
        if (test = true) {
            keyArry[count] = key;
            valueArry[count] = value;
            count++;
        }
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < keyArry.length - 1; i++) {
            if (key == keyArry[i] || (key != null && key.equals(keyArry[i]))) {
                return (V) valueArry[i];
            }
        }
        return null;
    }
}



