// ===== EditArray.java =====
import java.util.Arrays;

public class EditArray {

    public static int[] editArray(int[] data, int index, int datum) {
        if (data == null) throw new NullPointerException("data null");
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("index: " + index);
        }

        int[] copy = Arrays.copyOf(data, data.length); // salin agar tidak mutasi data lama
        copy[index] = datum;                            // ganti hanya pada index
        return copy;
    }
}
