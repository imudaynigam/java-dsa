public class RemoveDuplicatesString {

    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newStr.toString());
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            //Duplicate found
            removeDuplicates(str, index+1, newStr, map);
        } else {
            //Unique 
            map[currChar - 'a'] = true;
            removeDuplicates(str, index+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "udaaayyyniigaaaeeem";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
