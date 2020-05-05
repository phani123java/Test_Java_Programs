import java.io.*; 
  
class GFG  
{ 
      
// Returns modified n. 
public static int modifyBit(int n,  
                            int p,  
                            int b) 
{ 
    int mask = 1 << p; 
    return (n & ~mask) |  
           ((b << p) & mask); 
} 
    // Driver Code 
    public static void main (String[] args) 
    { 
        System.out.println(modifyBit(6, 2, 0)); 
        System.out.println (modifyBit(6, 5, 1)); 
    } 
} 
  