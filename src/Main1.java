public class Main1 {
    public static void main(String[]args){
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.cooking();
        student.sweep();
        IFactory gwyfactory = new OfficialFactory();
        LeiFeng gwy = gwyfactory.createLeiFeng();
        gwy.cooking();


    }
}