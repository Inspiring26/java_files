class FreshJuice{
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}

public class FreshJuiceTest{
	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		//这种赋值变量的方法，要记得
		//类名.属性名.值
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	}
}