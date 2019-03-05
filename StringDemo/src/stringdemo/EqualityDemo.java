
package stringdemo;


public class EqualityDemo {
    public static void main(String[] args) {
        ComperableObject comp1 = new ComperableObject();
        comp1.id=0;
        ComperableObject comp2 = new ComperableObject();
        comp2.id=0;
        System.out.println("comp1 == comp2");
        System.out.println(comp1 == comp2);
        System.out.println("comp1.equals(comp2)");
        System.out.println(comp1.equals(comp2));
        
    }
}


class ComperableObject{
    int id;
    public boolean equals (ComperableObject obj){
        if(obj.id == id){
            return true;
        }
        else{
            return false;
        }
    }
}