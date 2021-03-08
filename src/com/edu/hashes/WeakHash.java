package com.edu.hashes;

public class WeakHash implements I_hash
{
    public int hash(String str)
    {
        boolean []chars = new boolean[256];
        for (int i = 0; i < str.length(); ++i) {
            chars[str.charAt(i)] = true;
        }
        int count = 0;
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i]) count++;
        }
        return count;
    }
}
