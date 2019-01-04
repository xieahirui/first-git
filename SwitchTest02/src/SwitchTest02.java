public class SwitchTest02 {
    public static void main(String[] args){
        double score = 95.9;
        int grade = ((int)score)/10;
        switch(grade){
            case 9 : case 10 :
                System.out.println("优秀");
                break;
            case 8 : case 7 :
                System.out.println("良好");
                break;
            case 6 :
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }

    }
}
