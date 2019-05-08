class Solution {
    public String intToRoman(int num) {
        // java.util.List<Character> list = new ArrayList<>();
        java.util.List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int factor = 1;
        while (num % 10 != 0 || (num % 10 == 0 && num >= 10)) {
        // while(!(num % 10 == 0 && num < 10))
            int lastDigit = num % 10;
            list.add(lastDigit * factor);
            factor *= 10;
            /*
            switch(lastDigit) {
                case 1:
                case 2:
                case 3:
                    for (int i = 0; i < lastDigit; i++) {
                        list.add(1);                    }
                    break;
                case 4:
                    list.add('V');
                    list.add('I');
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    for (int i = 0; i < lastDigit - 5; i++) {
                        list.add('I');
                    }
                    list.add('V');
                    break;
                case 9:
                    list.add('X');
                    list.add('I');
                    break;
            }
            */
            
            num /= 10;
        }
        System.out.println(list);
        // for (int i : list) {
        for (int index = list.size() - 1; index >=0; index--) {
            int i = list.get(index);
            if (i >= 1000) {
                for (int j = 0; j < i / 1000; j++) {
                    sb.append('M');
                }
            } else if (i == 900) {
                sb.append("CM");
            } else if (i >= 500 && i < 900) {
                sb.append('D');
                for (int j = 0; j < (i - 500) / 100; j++) {
                    sb.append('C');
                }
            } else if (i == 400) {
                sb.append("CD");                
            } else if (i >= 100 && i < 400) {
                for (int j = 0; j < i / 100; j++) {
                    sb.append('C');
                }
            } else if (i == 90) {
                sb.append("XC");
            } else if (i >= 50 && i < 90) {
                sb.append('L');
                for (int j = 0; j < (i - 50) / 10; j++) {
                    sb.append('X');
                }
            } else if (i == 40) {
                sb.append("XL");
            } else if (i >= 10 && i < 40) {
                for (int j = 0; j < i / 10; j++) {
                    sb.append('X');
                }
            } else if (i == 9) {
                sb.append("IX");
            } else if (i >=5 && i < 9) {
                sb.append('V');
                for (int j = 0; j < i - 5; j++) {
                    sb.append('I');
                }
            } else if (i == 4) {
                sb.append("IV");
            } else {
                for (int j = 0; j < i; j++) {
                    sb.append('I');
                }
            }
        }
        String res = sb.toString();
        return res;
    }
}
