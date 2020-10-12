package pack2;

public class CPU {
	private int speed;
	private int slot;
	public CPU(){
	}
	public CPU(int speed,int slot){
		this.speed=speed;
		this.slot=slot;
	}
	protected void setSpeed(int m){				//·½·¨
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
