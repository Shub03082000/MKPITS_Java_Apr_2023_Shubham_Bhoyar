class Short{
	public short addShort(short number1, short number2){
		return(number1+number2);
	}
}

class Short1{
	public static void main(String[] args){
		Short short1 = new Short();
		short ans = short1.addShort(5,7);
		System.out.println(ans);
	}
}