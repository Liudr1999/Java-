# Java-
Java课程作业项目仓库

# 阅读程序
## 程序源代码
### CPU.java
```
package pack1;

public class CPU {
	private int speed;
	private int slot;
	public CPU(){
	}
	public CPU(int speed,int slot){
		this.speed=speed;
		this.slot=slot;
	}
	protected void setSpeed(int m){				//方法
		this.speed=m;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSlots(int s){
		slot=s;
	}
	public int getSlots(){
		return slot;
	}
}
```
### PC.java
```
package pack;

import pack1.CPU;

public class PC {
	public PC(){
	}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
		
	}
	private CPU cpu;
	public HardDisk HD;
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
}
```
### HardDisk.java
```
package pack;


public class HardDisk {
	int amount;
	int rotate;
	public HardDisk(){
	}
	public HardDisk(int amount,int rotate){
		this.amount=amount;
		this.rotate=rotate;
		
	}
	public void setAmount(int m){		//方法
		amount=m;				
	}
	int getAmount(){			//方法
		return amount;			//返回int型amount
	}
	public void setRotate(int n){		
		rotate=n;				
	}
	int getRotate(){			
		return rotate;			
	}
}

```
### Test.java:
```
package pack;

import cs.CPU;

public class Test {
	public static void main(String args[]){
		CPU cpu=new CPU();		//CPU对象
  	cpu.setSpeed(2200);
		cpu.setSlots(1155);
		HardDisk HD=new HardDisk();
		HD.setAmount(200);
		HD.setRotate(7200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
}

```
## 实验目的

## 实验过程

## 核心方法


## 实验结果

## 实验感想
通过本次实验，发现了很多以前从来没有注意过的问题，我对于Java的基本参数还是不太了解和熟悉。需要查书及其他资料来确定是什么。
对我来说最大的困难是构造方法的设定，除了知道构造方法的形式（包括空的），其他带有参数的构造方法不会设置。
对于“this”也不是特别的熟悉，而且课上讲的确实明白，到了课后觉得又是一脑袋浆糊。
所以让我更加感觉到课前的复习很有必要，同时印证了理论知识是需要通过实践进行验证的。
经过这次实验，明确了我的薄弱项，并反思自己的学习方法是否正确，会在下一次的实验中进行改善。
