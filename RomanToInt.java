class Solution {
    public int romanToInt(String s) {
        int res = 0;
     //   for (char c : s) {
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            System.out.println(c);
            if (c == 'M') {
                res += 1000;
            } else if (c == 'D') {
                res += 500;
            } else if (c == 'C') {
                // if (s.indexOf(c) != s.length()  &&
                /*
                if (s.indexOf(c) != s.length() -1 &&
                    (s.charAt(s.indexOf(c) + 1) == 'M' ||
                    s.charAt(s.indexOf(c) + 1) == 'D'))
                    */
                if (index != s.length() - 1 &&
                   (s.charAt(index + 1) == 'M' ||
                   s.charAt(index + 1) == 'D'))
                {
                    res -= 100;
                    System.out.println("minus 100");
                }
                else {
                    res += 100;
                    System.out.println("plus 100");
                }
            } else if (c == 'L') {
                res += 50;
            } else if (c == 'X') {
                /*
                if (s.indexOf(c) != s.length() -1 &&
                    (s.charAt(s.indexOf(c) + 1) == 'C' ||
                    s.charAt(s.indexOf(c) + 1) == 'L'))
                    */
                if (index != s.length() - 1 &&
                   (s.charAt(index + 1) == 'C' ||
                   s.charAt(index + 1) == 'L'))
                {
                    res -= 10;
                    System.out.println("minus 10");
                }
                else {
                    res += 10;
                    System.out.println("plus 10");
                }
            } else if (c == 'V') {
                res += 5;
            } else if (c == 'I') {
                /*
                if (s.indexOf(c) != s.length() -1 &&
                    (s.charAt(s.indexOf(c) + 1) == 'X' ||
                     s.charAt(s.indexOf(c) + 1) == 'V'))
                     */
                if (index != s.length() - 1 &&
                   (s.charAt(index + 1) == 'X' ||
                   s.charAt(index + 1) == 'V'))
                {
                    res -= 1;
                    System.out.println("minus 1");
                }
                else {
                    res += 1;
                    System.out.println("plus 1");
                }
            }
        }

        return res;
    }
}

/**
 *
 *  class Solution {
 *      public int romanToInt(String s) {
 *          int res = 0;
 *       //   for (char c : s) {
 *          for (int index = 0; index < s.length(); index++) {
 *              char c = s.charAt(index);
 *              System.out.println(c);
 *              if (c == 'M') {
 *                  res += 1000;
 *              } else if (c == 'D') {
 *                  res += 500;
 *              } else if (c == 'C') {
 *                  // if (s.indexOf(c) != s.length()  &&
 *                  if (s.indexOf(c) != s.length() -1 &&
 *                      (s.charAt(s.indexOf(c) + 1) == 'M' ||
 *                      s.charAt(s.indexOf(c) + 1) == 'D'))
 *                  {
 *                      res -= 100;
 *                      System.out.println("minus 100");
 *                  }
 *                  else {
 *                      res += 100;
 *                      System.out.println("plus 100");
 *                  }
 *              } else if (c == 'L') {
 *                  res += 50;
 *              } else if (c == 'X') {
 *                  if (s.indexOf(c) != s.length() -1 &&
 *                      (s.charAt(s.indexOf(c) + 1) == 'C' ||
 *                      s.charAt(s.indexOf(c) + 1) == 'L'))
 *                  {
 *                      res -= 10;
 *                      System.out.println("minus 10");
 *                  }
 *                  else {
 *                      res += 10;
 *                      System.out.println("plus 10");
 *                  }
 *              } else if (c == 'V') {
 *                  res += 5;
 *              } else if (c == 'I') {
 *                  if (s.indexOf(c) != s.length() -1 &&
 *                      (s.charAt(s.indexOf(c) + 1) == 'X' ||
 *                       s.charAt(s.indexOf(c) + 1) == 'V'))
 *                  {
 *                      res -= 1;
 *                  }
 *                  else {
 *                      res += 1;
 *                  }
 *              }
 *          }
 *
 *          return res;
 *      }
 *  }
 */
