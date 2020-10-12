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
	public void setRotate(int n){		//方法
		rotate=n;				//赋值？
	}
	int getRotate(){			//方法
		return rotate;			
	}
}
