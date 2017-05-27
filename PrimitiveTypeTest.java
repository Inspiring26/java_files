public class PrimitiveTypeTest{
	public static void main(String[] args) {
		//byte
		System.out.println("byte的二进制位数："+Byte.SIZE);
		System.out.println("最小值："+Byte.MIN_VALUE);
		System.out.println("最大值："+Byte.MAX_VALUE);

		//short
		System.out.println("short的二进制位数："+Short.SIZE);
		System.out.println("最小值："+Short.MIN_VALUE);
		System.out.println("最大值："+Short.MAX_VALUE);

		//int 	有时会用Integer获取它的基础信息
		System.out.println("int的二进制位数："+Integer.SIZE);
		System.out.println("最小值："+Integer.MIN_VALUE);
		System.out.println("最大值："+Integer.MAX_VALUE);
	}
}