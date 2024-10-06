package html_matched;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> getHtmlTags() throws IOException {
        List<String> tags  = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src\\html_matched\\text.html"));

        String line;
        while ((line = reader.readLine()) != null) {
            int pos = 0;
            int ts = line.indexOf("<", pos);

            while (ts != -1) {
                int te = line.indexOf(">", ts + 1);
                if (te != -1) {
                    tags.add(line.substring(ts, te + 1));
                    pos = te + 1;
                    ts = line.indexOf("<", pos);
                } else {
                    break;
                }
            }
            }
        reader.close();
        return tags;
        }


    public static boolean isHtmlMatched(List<String> tags) {
        LinkedStack stack = new LinkedStack();

        for (String tag : tags) {
            if (tag.charAt(1) != '/') {
                stack.push(tag);
            } else {
                if (stack.empty()) {
                    return false;
                }
                String open = stack.top().substring(1);
                String close = tag.substring(2);

                if (!open.equals(close)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        try {
            if (isHtmlMatched(getHtmlTags())) {
                System.out.println("The input file is a matched HTML document.");
            } else {
                System.out.println("The input file is not a matched HTML document.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
