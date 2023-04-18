public class Result extends Student implements Exam{
    public Result(String name, int roll_no, int marks1, int marks2, int marks3) {
        super(name, roll_no, marks1, marks2, marks3);
    }


    @Override
    public double percent_Cal()
    {
        double percent = (marks1 + marks2 + marks3)/300.0 * 100.0;
        return percent;
    }
}