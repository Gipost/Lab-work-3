package com.edu;
import com.edu.hashes.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        StrongHash S_Hash = new StrongHash();
        WeakHash W_Hash= new WeakHash();
        System.out.println("Enter string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Strong Hash: " + S_Hash.hash(str));
        System.out.println("Weak Hash: " + W_Hash.hash(str));
    }

}
