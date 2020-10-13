# Java-
Java课程作业项目仓库

# 阅读程序
## 程序源代码
### CPU类
```
	private int speed;      
	private int slot;	
```
定义了两个整型的私有属性speed、slot。
```
	protected void setSpeed(int m){				
		this.speed=m;
	}
	public int getSpeed(){
		return speed;
	}
```
定义了两个对应的方法，其中setSpeed()方法将参数m的值赋给speed，getSpeed()方法中返回speed的值。
同理定义setSlots(int n)和getSlots()方法，均是public类。
### PC类
```
import pack1.CPU;
```
调用pack1包内的CPU类。
```
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
	void show(){
		System.out.println("CPU的速度是"+cpu.getSpeed()+",CPU的信槽为"+cpu.getSlots());
		System.out.println("硬盘的容量是"+HD.getAmount()+",硬盘的转速为"+HD.getRotate()+"r每分钟");
	}
```
其中setCPU(CPU c)将参数c的值赋给cpu，setHardDisk(HardDisk h)方法中将参数h的值赋给HD。
另外定义一个返回值为空的方法show()，分别显示CPU和硬盘的相应参数（之前定义的）。
### HardDisk类
```
	public HardDisk(){
	}
	public HardDisk(int amount,int rotate){
		this.amount=amount;
		this.rotate=rotate;
	}
```
定义了两个构造方法，一个是带参数的一个是不带参数的。（其他类也有此项，并且amount和rotate属性已提前定义。）
在HardDisk类中getAmount()方法返回amount的值，setAmount(int m)方法将参数m的值赋给amount。
rotate属性的相应方法同理，setRotate(int n)方法是将参数n的值赋予rotate。
### Test类
```
		CPU cpu=new CPU();		
		cpu.setSpeed(2200);
		cpu.setSlots(1155);
```
使用new关键字，对CPU类里面的cpu对象进行实例化，调用cpu的setSpeed()和setSlots()方法并进行赋值.
```
		HardDisk HD=new HardDisk();
		HD.setAmount(200);
		HD.setRotate(7200);
```
同理使用new关键字对HD进行对象实例化，并调用相应的方法进行赋值。
```
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
```
将cpu的值代入pc.setCPU()中，将HD的值代入pc.setHardDisk()中并进行调用，最后调用pc.show()方法。
## 实验目的
1、熟悉并掌握Java的基本语法结构；  
2、熟悉并掌握Java的构造方法；  
3、尝试对属性进行多样化的定义；  
3、尝试并体会修饰符的多样化应用。
## 实验过程
1、分别创建CPU、PC、HardDisk、Test类；  
2、按照实验要求对每一个类分别进行定义；  
3、经检查无误后，执行程序；  
4、为在原程序的基础上书写附加要求；  
5、检查是否符合实验要求，实验结束。
## 核心方法
1、构造方法的设定
```
	public PC(){
	}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
		
	}
```
构造方法没有返回值类型，如果不定义修饰符类型系统将用default定义。若类里没有构造方法，则程序运行时自动添加构造方法。  
2、修饰符的不同定义
```
	private CPU cpu;
	public HardDisk HD;
	
```
private代表仅同一类的成员可见，public代表公开，任何人可见。
```
	protected void setSpeed(int m){				
		this.speed=m;
	}
```
protected除了不同包中非子类不可见，其他均可。
## 实验结果
```
CPU的速度是2200,CPU的信槽为1155
硬盘的容量是200,硬盘的转速为7200r每分钟
```
## 实验感想
通过本次实验，发现了很多以前从来没有注意过的问题，我对于Java的基本参数还是不太了解和熟悉。需要查书及其他资料来确定是什么。
对我来说最大的困难是构造方法的设定，除了知道构造方法的形式（包括空的），其他带有参数的构造方法不会设置。
对于“this”也不是特别的熟悉，而且课上讲的确实明白，到了课后觉得又是一脑袋浆糊。
所以让我更加感觉到课前的复习很有必要，同时印证了理论知识是需要通过实践进行验证的。
经过这次实验，明确了我的薄弱项，并反思自己的学习方法是否正确，会在下一次的实验中进行改善。
