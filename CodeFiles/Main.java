// package OOP;
class encapsulationClass{
	int age;
	char character;
	float floatvalue;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age > 18);
			this.age = age; 
	}
	public int getCharacter(){
		return character;
	}
	public void setCharacter(char character){
		this.character = character;
	}
	
}

class Parent{
	int getAge(){
		return 30;
	}
	//method overloading
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
}

class Child extends Parent{

}

abstract class abstractClass{
	abstract void abstractMethod();
	public int getage(){
		return 10;
	}
}

class Main{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getAge());
	}
}