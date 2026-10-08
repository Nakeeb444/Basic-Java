class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int leftRem = 0, rightRem = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                leftRem++;
            } else if (ch == ')') {
                if (leftRem > 0) {
                    leftRem--;
                } else {
                    rightRem++;
                }
            }
        }

        Set<String> res = new HashSet<>();
        StringBuilder curr = new StringBuilder();

        backtrack(s, 0, leftRem, rightRem, 0, curr, res);

        return new ArrayList<>(res);
    }

    private void backtrack(String s, int index, int leftRem, int rightRem, int balance, StringBuilder curr,
            Set<String> res) {
        if (balance < 0) {
            return;
        }

        if (index == s.length()) {
            if (leftRem == 0 &&
                    rightRem == 0 &&
                    balance == 0) {
                res.add(curr.toString());
            }

            return;
        }

        if (index == s.length()) {
            if (rightRem == 0 &&
                    rightRem == 0 &&
                    balance == 0) {
                res.add(curr.toString());
            }

            return;
        }

        char ch = s.charAt(index);

        if (ch == '(') {
            if (leftRem > 0) {
                backtrack(s, index + 1, leftRem - 1, rightRem, balance, curr, res);
            }

            curr.append('(');
            backtrack(s, index + 1, leftRem, rightRem, balance + 1, curr, res);

            curr.deleteCharAt(curr.length() - 1);
        }

        else if (ch == ')') {
            if (rightRem > 0) {
                backtrack(s, index + 1, leftRem, rightRem - 1, balance, curr, res);
            }

            if (balance > 0) {
                curr.append(')');
                backtrack(s, index + 1, leftRem, rightRem, balance - 1, curr, res);

                curr.deleteCharAt(curr.length() - 1);
            }
        }

        else {
            curr.append(ch);
            backtrack(s, index + 1, leftRem, rightRem, balance, curr, res);

            curr.deleteCharAt(curr.length() - 1);
        }
    }
}