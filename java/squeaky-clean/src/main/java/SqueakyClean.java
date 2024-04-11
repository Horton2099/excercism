import java.lang.reflect.Array;

class SqueakyClean {
    static String clean(String identifier) {
        String partOne = identifier.replaceAll("\\s","_");
        String partTwo = partOne.replaceAll("[^\\x00-\\x7F]", "");
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;
        System.out.println(sb);
            for (char c : partTwo.toCharArray()) {
                if (c == '4') {
                    sb.append("a");
                } else if (c == '3') {
                    sb.append('e');
                } else if (c == '0') {
                    sb.append('o');
                } else if (c == '1') {
                    sb.append('l');
                } else if (c == '7') {
                        sb.append('t');
                } else if(c == '-'){
                    capitalizeNext = true;
                } else if (capitalizeNext) {
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else if (Character.isLetter(c) || c == '_'){
                    sb.append(c);
                }
            }
    return sb.toString();
    }
}




