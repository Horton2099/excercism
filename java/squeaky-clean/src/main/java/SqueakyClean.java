import java.lang.reflect.Array;

class SqueakyClean {
    static String clean(String identifier) {
        String stepOne =  identifier.replaceAll("\\s", "_");
        String stepTwo = stepOne.replaceAll("-(\\w)", m -> m.group(1).toUpperCase());
        return stepTwo;
    }
}
//        System.out.println(identifier);
//        String noSpace = identifier.trim().replaceAll("\\s", "_");
//        System.out.println(noSpace);
//        StringBuilder sb = new StringBuilder();
//        sb.append(noSpace);
//        for (int i = 0; i < noSpace.length(); i++) {
//            char currentChar = noSpace.charAt(i);
//            char nextChar = noSpace.charAt(i+1);
//            if(currentChar == '-') {
//                sb.append(Character.toUpperCase(nextChar));
//                sb.deleteCharAt(i);
//            } else if (currentChar == '0' || currentChar == '1' || currentChar == '3' || currentChar == '4' || currentChar == '7') {
//                    char replacementChar = 'o'; // Default replacement character
//                    if (currentChar == '1') replacementChar = 'i';
//                    else if (currentChar == '3') replacementChar = 'e';
//                    else if (currentChar == '4' || currentChar == '7') replacementChar = 'r';
//                    sb.setCharAt(i, replacementChar);
//                    if (i > 0 && noSpace.charAt(i - 1) == '_') {
//                        sb.setCharAt(i, Character.toUpperCase(replacementChar));
//                    }

//            } else if (currentChar == '0') {
//                sb.replace(i, i+1, "o");
//                if(noSpace.charAt(i -1) == '_') {
//                    sb.append(Character.toUpperCase(currentChar));
//                        }
//            } else if (currentChar == '1') {
//                sb.replace(i, i+1, "i");
//                if(noSpace.charAt(i - 1) == '_') {
//                    sb.append(Character.toUpperCase(currentChar));
//                        }
//            } else if (currentChar == '3') {
//                sb.replace(i, i+1, "e");
//                if(noSpace.charAt(i -1) == '_') {
//                    sb.append(Character.toUpperCase(currentChar));
//                }
//            } else if (currentChar == '4' || currentChar == '7') {
//                sb.replace(i, i+1, "r");
//                if(noSpace.charAt(i - 1) == '_') {
//                    sb.append(Character.toUpperCase(currentChar));
//                }



//        sb.replace(0, sb.length(), sb.toString().replaceAll("[^a-zA-Z0-9]", ""));
//        System.out.println(sb.toString());
//        return sb.toString();
//            }



