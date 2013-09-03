package cse.buffalo.edu.arrays_strings;

public class ChangeSpaceToOthers {
  private char[] char_array;
  private char[] target_array;
  private int length;

  public ChangeSpaceToOthers(String str, int length) {
    char_array = str.toCharArray();
    target_array = new char[str.length()];
    this.length = length;
  }

  public String replaceSpace() {
    int j = 0;
    for (int i = 0; i < length; i++) {
      System.out.println(char_array[i]);
      if (char_array[i] == ' ') {
        target_array[i+j*3] = '%';
        target_array[i+j*3+1] = '2';
        target_array[i+j*3+2] = '0';
        j++;
      } else {
        target_array[i+j*3] = char_array[i];
      }
    }
    return new String(target_array);
  }

  public String replaceSpaceInPlace() {
    int index = char_array.length - 1;
    for (int i = length - 1; i >= 0; i--) {
      if (char_array[i] == ' ') {
        char_array[index--] = '0';
        char_array[index--] = '2';
        char_array[index--] = '%';
      } else {
        char_array[index--] = char_array[i];
      }
    }
    return new String(char_array);
  }

  public static void main(String[] args) {
    String str = "abc edf fff    ";
    int length = 11;
    ChangeSpaceToOthers cs = new ChangeSpaceToOthers(str, 11);
    System.out.println(cs.replaceSpaceInPlace());
  }
}
