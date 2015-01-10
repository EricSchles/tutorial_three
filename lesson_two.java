class lesson_two{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		//making a computer count
		for(int i=0;i<200;i++){
			print(i+" is the number we are up to");
		}
		//notice starts at 0, stops at 199

		//basic array
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int elem: numbers){
			print(elem);
		}
	}
}