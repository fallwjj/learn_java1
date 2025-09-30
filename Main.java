public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		AddMath am=new AddMath();
		System.out.println(am.add(1,2));
		BeforeSum bs=new BeforeSum();
		System.out.println(bs.sum(100));
		QuadraticEquationSolver qes=new QuadraticEquationSolver();
		qes.SolveQ(2,-5,3);
	}
}
//标识符都是下划线
//变量类型-int string byte float double char boolean long short
// 控制语句，循环，for，while，do while，条件，if else ，switch case
// 数组，方法，类，对象，继承，多态，封装，抽象接口
// 异常处理，try catch finally throw throws
// 包，import
// 常用类，String Math Random Scanner Arrays Collections Date Calendar
// 输入输出，文件操作，IO流，NIO
// 多线程，线程创建，线程同步，线程通信
// 网络编程，Socket UDP TCP
// GUI编程，AWT Swing JavaFX
// JDBC，数据库连接，SQL语句
// 注解，反射，泛型，枚举
// Lambda表达式，Stream API
// JDK新特性，模块化，JShell
// 常用设计模式，单例工厂观察者策略装饰适配器代理
// 常用框架，Spring Spring Boot Hibernate MyBatis
// 构建工具，Maven Gradle
// 版本控制，Git SVN
// 测试框架，JUnit TestNG
// 性能优化，JVM调优，垃圾回收
// 安全编程，加密解密，数字签名
// 常用算法，排序查找，递归动态规划
// 数据结构，数组链表栈队列树图哈希表
// 设计原则，SOLID KISS DRY YAGNI
// 软件开发流程，需求分析设计编码测试部署维护
 class AddMath {
	public int add(int a,int b)
	{
		return a+b;
	}
} 
class  BeforeSum 
{
	public int sum(int a)
	{
		return (1+a)*a/2;
	}
}

class QuadraticEquationSolver{
	public static void SolveQ(double a,double b,double c){
		double delta=b*b-4*a*c;
		if(delta>0){
			double x1=(-b+Math.sqrt(delta))/(2*a);
			double x2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("x1="+x1+",x2="+x2);
		}
		else if (delta==0) {
			double x=-b/(2*a);
			System.out.println("x="+x);
		}
		else{
			System.out.println("no real roots");
		}
	}
}
/*plt.rcParams.update
 * 
 * 
 * 
 */