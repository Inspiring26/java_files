public class Puppy{
	public Puppy(String name){
		//这个构造器仅有一个参数：name
		System.out.println("小狗的名字是："+name);
	}
	public static void main(String[] args) {
		//创建一个puppy对象
		Puppy myPuppy = new Puppy("tommy");
	}
}