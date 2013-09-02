package cse.buffalo.edu.arrays_strings;

/*
 * Given two strings, write a method to decides if one is
 * a permutation of the other.
 */
public class TwoStringPermutation {
  private String str1;
  private String str2;
  private int[] sieve;

  public TwoStringPermutation(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
    sieve = new int[256];
  }

  public boolean isPermutation() {
    if (str1.length() != str2.length()) return false;

    for (int i = 0; i < str1.length(); i++) {
      int pos = str1.charAt(i);
      sieve[pos]++;
    }

    for (int i = 0; i < str2.length(); i++) {
      int pos = str2.charAt(i);
      if (--sieve[pos] < 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    String str1 = args[0];
    String str2 = args[1];
    TwoStringPermutation ts = new TwoStringPermutation(str1, str2);
    if (ts.isPermutation()) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
