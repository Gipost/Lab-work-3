package com.edu.hashes;

 public class StrongHash implements I_hash
{
    public int hash(String str)
    {
        int hashsumm = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char hashChar = str.charAt(i);
            int hashCharInt = (int) hashChar;
            hashsumm += hashCharInt*i;
        }
        return hashsumm;
    }
}
