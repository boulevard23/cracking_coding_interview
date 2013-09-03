package cse.buffalo.edu.arrays_strings;

public class BasicStringCompression {
  private char[] char_arr;
  private char[] source;

  public BasicStringCompression(String str) {
    source = str.toCharArray();
    char_arr = new char[str.length()];
  }

  public String getCompressedString() {
    char_arr[0] = source[0];
    int index = 0;
    int count = 0;

    for (int i = 0; i < source.length; i++) {
      if (source[i] == char_arr[index]) {
        count++;
      } else {
        char_arr[index+1] = (char) ('0' + count);
        char_arr[index+2] = source[i];
        index += 2;
        count = 1;
      }
      char_arr[index+1] = (char) ('0' + count);
    }

    if ((index + 2) < source.length) {
      return new String(char_arr);
    } else {
      return "No compression";
    }
  }

  public static void main(String[] args) {
    BasicStringCompression bs = new BasicStringCompression("aabcccccaaa");
    System.out.println(bs.getCompressedString());
  }
}
