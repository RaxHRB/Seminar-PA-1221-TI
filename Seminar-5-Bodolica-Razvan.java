
package com.mycompany.seminar5;
//Bodolica Razvan-Gabriel 1221 B TI

public class Seminar5 {


    public static StringBuffer encrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();
 

        for (int i=0; i<text.length(); i++)
        {

            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 65) % 26 + 65);
                result.append(ch);
            }

            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 97) % 26 + 97);
                result.append(ch);
            }

            else {
                result.append(text.charAt(i));
            }
        }

        return result;
    }
    
    

    public static StringBuffer decrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();
 

        for (int i=0; i<text.length(); i++)
        {

            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 65) % 26 + 65);
                result.append(ch);
            }

            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 97) % 26 + 97);
                result.append(ch);
            }

            else {
                result.append(text.charAt(i));
            }
        }

        return result;
    }
 

    public static void main(String[] args)
    {
        
        String text = "BO DO";

        int step = 13;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + step);
        
        String encrypted = encrypt(text,step).toString();
        System.out.println("Cipher: " + encrypted);
        
        String decrypted = decrypt(encrypted,step).toString();
        System.out.println("Decrypted: " + decrypted);
        
        
    }}
