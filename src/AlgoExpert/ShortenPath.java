package AlgoExpert;

import java.util.Arrays;
import java.util.Stack;

public class ShortenPath {
    public static void main(String[] args) {
        String path = "/";
        System.out.println(shortenPath(path));
    }

    public static String shortenPath(String path) {
        boolean isAbsolute = path.charAt(0) == '/';
        String[] filtered = Arrays.stream(path.split("/"))
                .filter(each -> each.length() != 0 && !each.equals("."))
                .toArray(String[]::new);
        Stack<String> shortenedStrs = new Stack<>();
        if (isAbsolute) {
            shortenedStrs.push("");
        }
        for (String each : filtered) {
            if (each.equals("..")) {
                if (shortenedStrs.isEmpty() || shortenedStrs.peek().equals("..")) {
                    shortenedStrs.push(each);
                } else if (!shortenedStrs.peek().equals("")) {
                    shortenedStrs.pop();
                }
            } else {
                shortenedStrs.push(each);
            }
        }
        if (shortenedStrs.size() == 1 && shortenedStrs.peek().equals("")) {
            return "/";
        }
        return String.join("/", shortenedStrs);
    }
}

