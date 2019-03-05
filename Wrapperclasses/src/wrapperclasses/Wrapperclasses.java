
package wrapperclasses;


public class Wrapperclasses {

    public static void main(String[] args) {
        
        Integer integer = new Integer(10);
        Integer integer2 = new Integer(10);
        Double.sum(5.6, 6.8);
        boolean equals = integer==integer2;
        System.out.println("Equales = "+equals);
        
        
        Integer integer3 = 10;
        Integer integer4 = 15;
        
        Integer stInt = Integer.valueOf("10");
        Integer int3 = Integer.valueOf(10);
        boolean equals2 = stInt == int3;
        System.out.println("Equals = " + equals2);
        
        addDoubles(12.5, 12.66);
        Double dbA = 15.5;
        Double dbB = 17.4;
        addDoubles2(dbA, dbB);
        
        
        
        
        
    }
    
    
     public static void addDoubles2(Double db1, Double db2){
         System.out.println("Sum:"+(db1+db2));
     }
    
    
    public static void addDoubles(Double db1, Double db2){
         System.out.println("Sum:"+(db1.doubleValue() + db2.doubleValue()));
     }
    
}
