package android.text;

import java.util.Iterator;

public class TextUtils {

    /**
     * Returns a string containing the tokens joined by delimiters.
     *
     * @param delimiter a CharSequence that will be inserted between the tokens. If null, the string
     *     "null" will be used as the delimiter.
     * @param tokens an array objects to be joined. Strings will be formed from the objects by
     *     calling object.toString(). If tokens is null, a NullPointerException will be thrown. If
     *     tokens is empty, an empty string will be returned.
     */
    public static String join(CharSequence delimiter, Iterable tokens) {
        final Iterator<?> it = tokens.iterator();
        if (!it.hasNext()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(delimiter);
            sb.append(it.next());
        }
        return sb.toString();
    }
}
