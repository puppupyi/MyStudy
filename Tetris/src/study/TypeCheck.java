package study;

public class TypeCheck {
	public static Class<Byte> typeof(final byte expr) {
        return Byte.TYPE;
    }
	
	public static Class<Short> typeof(final short expr) {
        return Short.TYPE;
    }
	
    public static Class<Integer> typeof(final int expr) {
        return Integer.TYPE;
    }

    public static Class<Long> typeof(final long expr) {
        return Long.TYPE;
    }

    public static Class<Float> typeof(final float expr) {
        return Float.TYPE;
    }

    public static Class<Double> typeof(final double expr) {
        return Double.TYPE;
    }
    
    public static Class<Character> typeof(final char expr) {
        return Character.TYPE;
    }
    
    // String class에는 TYPE이 없기 때문에 그냥 문자열로 반환
    public static String typeof(final String expr) {
        return "String";
    }
    
    public static Class<Boolean> typeof(final boolean expr) {
        return Boolean.TYPE;
    }
}
