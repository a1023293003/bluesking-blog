package cn.bluesking.core.demo;

public class Demo {

	// 非内部静态类
	public class Demo2 {};
	// 内部静态类
	public static class Demo3 {};
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Demo demo = new Demo();
		
		// Demo2 test1 = Demo.new Demo2(); // 报错
		// Demo2 test2 = Demo.Demo2(); // 报错
		Demo2 test3 = new Demo().new Demo2(); // OK
		// Demo2 test4 = new Demo.Demo2(); // 报错
		Demo2 test5 = demo.new Demo2(); // OK
		// Demo2 test6 = demo.Demo2(); // 报错
		
		// Demo3 test7 = Demo.new Demo3(); // 报错
		// Demo3 test8 = Demo.Demo3(); // 报错
		// Demo3 test9 = new Demo.new Demo3(); // 报错
		Demo3 test10 = new Demo.Demo3(); // OK
		// Demo3 test11 = demo.new Demo3(); // OK
		// Demo3 test12 = demo.Demo3(); // 报错
		
	}
}
