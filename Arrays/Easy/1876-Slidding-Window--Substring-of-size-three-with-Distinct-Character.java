//optimized answer
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}

My answer
import java.util.HashSet;
import java.util.Stack;

class Solution {

    public boolean good(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size() == s.length();
    }

    public String convert(Stack<Character> st) {
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public int countGoodSubstrings(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();

        // First window of size 3
        for (int i = 0; i < 3; i++) {
            st.push(s.charAt(i));
        }

        if (good(convert(st))) {
            count++;
        }

        // Slide the window
        for (int i = 3; i < s.length(); i++) {
            st.remove(0);
            st.push(s.charAt(i));

            if (good(convert(st))) {
                count++;
            }
        }

        return count;
    }
}

//Secondary Solution
import java.util.HashSet;
import java.util.Stack;

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));

            if (st.size() > 3) {
                st.remove(0);
            }

            if (st.size() == 3) {
                HashSet<Character> set = new HashSet<>(st);

                if (set.size() == 3) {
                    count++;
                }
            }
        }

        return count;
    }
}