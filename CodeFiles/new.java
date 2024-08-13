class Parent{
    int add(int a, int b){
        return a+b;
    }
}
class Child extends Parent{
    
    int add(int a, int b){
        return a+b; 
    }
}

class Mainnew{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.add(2,3));
    }
}