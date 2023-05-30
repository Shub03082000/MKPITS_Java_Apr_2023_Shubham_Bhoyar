class Byte{
	public byte addByte(byte number1, byte number2){
		return(number1 + number2);
	}
}
class Byte1{
	public static void main(String[] args){
		Byte byte1 = new Byte();
		byte ans = byte1.addByte(40,60);
		System.out.println(ans);
	}
}