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
		System.out.println("CPU���ٶ���"+cpu.getSpeed()+",CPU���Ų�Ϊ"+cpu.getSlots());
		System.out.println("Ӳ�̵�������"+HD.getAmount()+",Ӳ�̵�ת��Ϊ"+HD.getRotate()+"rÿ����");
	}
}
