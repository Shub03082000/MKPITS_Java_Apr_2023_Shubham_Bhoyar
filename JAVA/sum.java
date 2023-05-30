class Sum{
	public int addInteger(int number1, int number2){
		return number1 + number2;
	}

	public static void main(String[] args){
		int answer;
		Sum sum1 = new Sum();
		answer = sum1.addInteger(10,13);
		System.out.println(answer); 
	}
	
}
	
	