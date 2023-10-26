public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //set character index
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        sb.delete(1, 2);
        System.out.println(sb);
        sb.append("added");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
