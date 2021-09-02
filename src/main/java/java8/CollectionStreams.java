package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectionStreams {
    public static boolean  findElements(String s) {
//        String[] openingTags = s.split(">");
//        String[] closingTags = s.split("</[a-z]*>");
//        Map<String, String> m = new HashMap<>();
//                m.put("<div>", "</div>");
//        m.put("<p>", "</p>");
//        m.put("<i>", "</i>");
//        m.put("<em>", "</em>");
//        m.put("<b>", "</b>");
//        int  max = Math.max(openingTags.length, closingTags.length);
//        for (int i = 0; i < max; i++) {
//            if (m.get(openingTags[i]) != closingTags[max-i]) {
//                return false;
//            }
//        }
//        return true;
        return true;
  }


    public static void main(String[] args) {
        String s = "<html><head></head></html>";
        findElements(s);
    }
}
class Test {
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a && b == test.b;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

