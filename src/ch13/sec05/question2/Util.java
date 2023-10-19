package ch13.sec05.question2;

public class Util {
    public static <K, V, P extends Pair<K,V>> V getValue(P pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        return null;
    }
}
