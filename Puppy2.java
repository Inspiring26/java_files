 public class Puppy2{
 	int puppyAge;
 	public Puppy2(String name){
 		//这个构造器仅有一个参数 name
 		System.out.println("小狗的名字是："+name);
 	}
 	public void setAge(int age){
 		puppyAge = age;
 	}
 	//getAge don't need parameter
 	public int getAge(){
 		System.out.println("小狗的年龄为："+puppyAge);
 		//why there is a 'return'??
 		return puppyAge;
 	}
 	public static void main(String[] args) {
 		//create a object
 		Puppy2 myPuppy = new Puppy2("tommy");
 		//use method	use it to set age
 		myPuppy.setAge(2);
 		//use method	use this method to get age/to print age
 		myPuppy.getAge();
 		// we also can use member variable like this 
 		//what is member variable?	in class out method,such as puppyAge
 		System.out.println("成员变量值："+myPuppy.puppyAge);
 	}
 }