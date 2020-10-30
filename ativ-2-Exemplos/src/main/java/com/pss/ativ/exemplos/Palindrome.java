package com.pss.ativ.exemplos;

public class Palindrome {

    private String palavra;
    private boolean palindrome;

    public Palindrome(String palavra) {
        this.palavra = palavra;
    }

    public boolean isPalindrome() {
        String invertida = new StringBuffer(palavra).reverse().toString();
        if (palavra.equals(invertida)) {
            return true;
        }
        return false;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }

}
