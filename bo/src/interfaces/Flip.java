package interfaces;

public class Flip implements CharSequence {
    private String toBeFlipped;

    public Flip(String s) {
        this.toBeFlipped = s;

    }

    private int fromEnd(int i) {
        return toBeFlipped.length() - 1 - i;
    }

    public char charAt(int i) {
        return toBeFlipped.charAt(fromEnd(i));
    }

    public int length() {
        return toBeFlipped.length();
    }

    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder(toBeFlipped.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.toBeFlipped);
        return s.reverse().toString();
    }
}
