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
	public void setAmount(int m){		//����
		amount=m;				
	}
	int getAmount(){			//����
		return amount;			//����int��amount
	}
	public void setRotate(int n){		//����
		rotate=n;				//��ֵ��
	}
	int getRotate(){			//����
		return rotate;			
	}
}
