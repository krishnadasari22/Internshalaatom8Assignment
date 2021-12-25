package com.assignment;
import java.util.*;

public class Trie
{
    String key;
    Trie[] character;
    Trie()
    {
        character = new Trie[26];
    }
}
 
class Main
{
    public static void insert(Trie head, String str)
    {
        Trie curr = head;
 
        for (char c: str.toCharArray())
        {
            if (curr.character[c - 'a'] == null) {
                curr.character[c - 'a'] = new Trie();
            }
            curr = curr.character[c - 'a'];
        }
        curr.key = str;
    }
    public static void preorder(Trie curr)
    {
        if (curr == null) {
            return;
        }
 
        for (int i = 0; i < 26; i++)
        {
            if (curr.character[i] != null && curr.character[i].key != null) {
                System.out.println(curr.character[i].key);
            }
 
            preorder(curr.character[i]);
        }
    }
 
    public static void main (String[] args)
    {
        String s = "pqr"+"zrg";
        String[] dict = s.split(" ");
 
        Trie head = new Trie();
        for (String word: dict) {
            insert(head, word);
        }
        preorder(head);
    }
}