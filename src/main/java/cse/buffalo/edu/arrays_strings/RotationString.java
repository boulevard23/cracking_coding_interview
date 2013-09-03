package cse.buffalo.edu.arrays_strings;

public class RotationString {
  private String str1;
  private String str2;

  public RotationString(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
  }

  public boolean isRotation() {
    if (str1.length() != str2.length()) return false;

    StringBuilder newStr = new StringBuilder();
    newStr.append(str1);
    newStr.append(str1);

    return false;
    //if (str2.isSubstring()) return true;
    //else return false;
  }
}
