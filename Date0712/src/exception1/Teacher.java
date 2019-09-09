package exception1;

public class Teacher {
        public void check(int score) throws MyException{
            if(score>100||score<0)
            {
                throw new MyException("分数必须在0-100直接");
            }else{
                System.out.println("莫得问题");
            }
        }
}
