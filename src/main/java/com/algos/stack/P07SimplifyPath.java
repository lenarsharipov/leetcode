package com.algos.stack;

import java.util.Stack;

/**
 * Problem Statement
 * Given an absolute file path in a Unix-style file system,
 * simplify it by converting ".." to the previous directory
 * and removing any "." or multiple slashes.
 * The resulting string should represent the shortest absolute path.
 *
 * Examples:
 * 1.
 *    Input: "/a//b////c/d//././/.."
 *    Output: "/a/b/c"
 * 2.
 *    Input: "/../"
 *    Output: "/"
 * 3.
 *    Input: "/home//foo/"
 *    Output: "/home/foo"
 *
 *    Time and Space Complexity
 * The time complexity of the algorithm is O(n),
 * where n is the size of the input path, since
 * we process each character once. The space
 * complexity is also O(n), as we store each
 * directory in a stack.
 */
public class P07SimplifyPath {
    public static String simplifyPath(String path) {
        // Create a stack to store the simplified path components
        Stack<String> stack = new Stack<>();

        // Split the input path string using '/' as a delimiter
        for (String p : path.split("/")) {
            if (p.equals("..")) {
                // If the component is '..', pop the last component from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!p.isEmpty() && !p.equals(".")) {
                // If the component is not empty and not '.', push it onto the stack
                stack.push(p);
            }
        }

        // Create a StringBuilder to build the simplified path
        StringBuilder result = new StringBuilder();

        // Reconstruct the simplified path by popping components from the stack
        for (String dir : stack) {
            // Insert '/' before each component to ensure correct path format
            result.append("/");
            result.append(dir);
        }

        // If the result is empty, return '/', otherwise return the simplified path
        return result.isEmpty() ? "/" : result.toString();
    }

}
