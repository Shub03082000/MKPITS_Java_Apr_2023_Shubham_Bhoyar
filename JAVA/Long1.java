class Long{
	public long addLong(long number1, long number2){
		return number1 + number2;
	}
}
class Long1{
	public static void main(String[] args){
		Long long1 = new Long();
		long ans = long1.addLong(50,50);
		System.out.println(ans);
	}
}