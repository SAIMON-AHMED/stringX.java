/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
  String newString = "";
  if (str.length() > 1) {
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length()-1);
    for (int i = 1; i < str.length()-1; i++) {        
      if (!(str.charAt(i) == 'x')) {
        newString += str.charAt(i);
      }
    }
    newString = firstChar + newString + lastChar;
  } else if(str.length() == 1) {
    newString += str.charAt(0);
  }
  return newString;
}
