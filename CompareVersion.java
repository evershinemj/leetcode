import java.util.StringTokenizer;
class Solution {
    public int compareVersion(String version1, String version2) {
        // String[] version1List = version1.split(".");
        // String[] version2List = version2.split(".");
        StringTokenizer st1 = new StringTokenizer(version1, ".");
        StringTokenizer st2 = new StringTokenizer(version2, ".");
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (st1.hasMoreTokens()) {
            list1.add(st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            list2.add(st2.nextToken());
        }
        String[] version1List = new String[list1.size()];
        String[] version2List = new String[list2.size()];
        for (int i = 0; i < version1List.length; i++) {
            version1List[i] = list1.get(i);
        }
        for (int i = 0; i < version2List.length; i++) {
            version2List[i] = list2.get(i);
        }
        // String[] version1List = list1.toArray();
        // String[] version1List = (String[]) list1.toArray();
        // String[] version2List = list2.toArray();
        // String[] version2List = (String[]) list2.toArray();
        System.out.println(java.util.Arrays.asList(version1List));
        System.out.println(java.util.Arrays.asList(version2List));
        int length1 = version1List.length;
        int length2 = version2List.length;
        int min = Math.min(length1, length2);
        for (int i = 0; i < min; i++) {
            if (Integer.parseInt(version1List[i]) < 
                Integer.parseInt(version2List[i])) {
                return -1;
            } else if (Integer.parseInt(version1List[i]) >
                      Integer.parseInt(version2List[i])) {
                return 1;
            } 
        }
        if (length1 > min) {
            // for (int i = length1 - min - 1; i < length1; i++) {
            for (int i = min; i < length1; i++) {
                if (Integer.parseInt(version1List[i]) != 0) {
                    return 1;
                }
            }
        }
        if (length2 > min) {
            // for (int i = length2 - min - 1; i < length2; i++) {
            for (int i = min; i < length2; i++) {
                if (Integer.parseInt(version2List[i]) != 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
