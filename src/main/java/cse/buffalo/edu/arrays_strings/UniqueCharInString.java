package cse.buffalo.edu.arrays_strings;

/*
 * Implement an algorithm to determine if a string has
 * all unique characters. What if you cannot use additional
 * data structures.
 */

public class UniqueCharInString {
  private boolean[] sieve;
  private String input;

  public UniqueCharInString(String input) {
    this.input = input;
    this.sieve = new boolean[256];
  }

  public boolean checkUnique() {
    if (input.length() > 256) return false;

    for (int i = 0; i < input.length(); i++) {
      int pos = input.charAt(i);
      if (sieve[pos] == false) sieve[pos] = true;
      else return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String input = args[0];
    UniqueCharInString us = new UniqueCharInString(input);
    if (us.checkUnique()) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
