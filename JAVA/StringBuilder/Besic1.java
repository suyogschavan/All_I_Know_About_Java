package StringBuilder;

public class Besic1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        
        // Insert chat at index 3
        sb.insert(3,'n');
        System.out.println(sb);

        // delete the extra n
        sb.delete(2, 3);

        // Appending in string builder
        sb.append(" S");
        sb.append(" u");
        sb.append(" y");
        sb.append(" o");
        sb.append(" g");
        System.out.println(sb);

        // Get the length of String Builder
        System.out.println(sb.length());

    }
}
