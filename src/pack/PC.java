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
