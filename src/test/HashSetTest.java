package test;

import java.util.HashSet;

class Name 
{ 
    private String first;
    private String last;
    public Name(String first, String last)
    { 
        this.first = first; 
        this.last = last; 
    } 
    // 根据 first 判断两个 Name 是否相等
    public boolean equals(Object o) 
    { 
        if (this == o) 
        { 
            return true; 
        } 
        if (o.getClass() == Name.class) 
        { 
            Name n = (Name)o; 
            return n.first.equals(first); 
        } 
        return false; 
    } 
	 
    // 根据 first 计算 Name 对象的 hashCode() 返回值
    public int hashCode() 
    { 
        return first.hashCode(); 
    }

    public String toString() 
    { 
        return "Name[first=" + first + ", last=" + last + "]"; 
    } 
 } 
 
 public class HashSetTest 
 { 
    public static void main(String[] args) 
    { 
        HashSet<Name> set = new HashSet<Name>(); 
        set.add(new Name("abc" , "123")); 
        set.add(new Name("abc" , "456")); 
        System.out.println(set); 
    } 
}