public class InterviewBit {
    int calculate(int a, int b){
        try{
            return a - b;
        }catch (Exception e){
            return a + b;
        }finally {
            return a*b;
        }
    }
}
