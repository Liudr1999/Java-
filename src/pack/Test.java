package pack;

import cs.CPU;

public class Test {
	public static void main(String args[]){
		CPU cpu=new CPU();		//CPU∂‘œÛ
//		cpu.setSpeed(2200);
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
