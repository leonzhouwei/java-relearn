import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Reference {

	public static void main(String[] args) {
		String abc = new String("abc"); // 1
		SoftReference<String> abcSoftRef = new SoftReference<String>(abc); // 2
		WeakReference<String> abcWeakRef = new WeakReference<String>(abc); // 3
		abc = null; // 4
		abcSoftRef.clear();
		// ---------------------------------------------------------------------
		abc = null;
		System.out.println("before gc: " + abcWeakRef.get());
		System.gc();
		System.out.println("after gc: " + abcWeakRef.get());
	}

}
