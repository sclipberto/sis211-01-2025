import java.util.*;

public class Programa11 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> d = new HashMap<Character, Character>();
        d.put(')', '(');
        d.put(']', '[');
        d.put('}', '{');
        ArrayList<Character> v = new ArrayList<Character>();
        try {
            for (Character c : s.toCharArray()) {
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        v.add(c);
                        break;
                    // case ')':
                    // if (v.isEmpty())
                    // return false;
                    // if (v.removeLast() != '(')
                    // return false;
                    // break;
                    // case ']':
                    // if (v.isEmpty())
                    // return false;
                    // if (v.removeLast() != '[')
                    // return false;
                    // break;
                    // case '}':
                    // if (v.isEmpty())
                    // return false;
                    // if (v.removeLast() != '{')
                    // return false;
                    // break;
                    case ')':
                    case ']':
                    case '}':
                        if (v.isEmpty())
                            return false;
                        Character last = v.removeLast();
                        // System.out.println("last=" + last + " c=" + c + " d[c]=" + d.get(c));
                        if (last != d.get(c))
                            return false;
                }
            }
        } catch (NoSuchElementException ex) {

        }
        if (!v.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        String a = "(){}[]";
        String b = "({[]})";
        String c = "({[}])";
        String[] v = { a, b, c, "()", "(", "]" };
        for (String caso : v) {
            if (isValid(caso))
                System.out.println(caso + "-" + "True");
            else
                System.out.println(caso + "-" + "False");
        }
    }
}