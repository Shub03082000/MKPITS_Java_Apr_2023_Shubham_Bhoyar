class Whirlpool extends Freeze{
	public void compressor(){
		System.out.println("Whirlpool is also a company brand. In Whirlpool brand of freeze there is also a compressor");
	}
}
class Godrej extends Freeze{
	public void compressor(){
		System.out.println("Godrej is also a company brand. In Godrej brand of freeze there is also a compressor");
	}
}
class MainFreeze{
	public static void main(String[] args){
		Godrej godrej = new Godrej();
		godrej.compressor();
		
		Whirlpool whirlpool = new Whirlpool();
		whirlpool.compressor();
	}
}