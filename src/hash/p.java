/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author Luis Parra
 */
public class p {

      public String longestCommonPrefix(String[] strs) {
         String prefijo = "";
         
          if (strs == null || strs.length == 0) {
              return prefijo;
          }
            
             if (strs.length == 1) {
                return strs[0];
            }
             
             if (strs[0].equals(prefijo) && strs[1].equals(prefijo)) {
              return prefijo;
          }
          
        
        for(int i=0; i<strs.length;i++){

            String letra1 = strs[i].charAt(0)+"";
            String letra2 = strs[i].charAt(1)+"";
     
            for (int j = i+1; j < strs.length; j++) {
               String l1 = strs[j].charAt(0)+"";
         
               String l2 = strs[j].charAt(1)+"";

                if (l1.equals(letra1) && l2.equals(letra2)) {
                    return l1+l2;
                    
                }  
               
            }
            
            
        }
        
        return prefijo;
        
        }
     
    
    
     

    
    
    public static void main(String[] args) {
        p cl = new p();

        String arreglo[] = {"",""};
        System.out.println(cl.longestCommonPrefix(arreglo));
    }
    
}
