/*
        1.自己编写一个程序，完成数组的拷贝
        2.使用一位数组模拟栈这种数据结构
        3.编写一个程序模拟酒店管理系统，显示所有房间列表。退房，订房
 */
//酒店的房间
public class Room {
    private String no;
    private String type;//标准间，双人间 ，豪华间
    private boolean isUse;//false表示空，true表示占用
    public Room(){
        super();
    }
    public Room(String no,String type,boolean isUse){
        super();
        this.no = no;
        this.isUse = isUse;
        this.type = type;
    }
    public String getNo(){
        return no;
    }
    public void getNo(String no){
        this.no = no;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public boolean isUse(){
        return isUse;
    }
    public void setUse(boolean isUse){
        this.isUse = isUse;
    }
    public String toString(){
        return "["+no+","+type+","+(isUse?"占用":"空闲")+"]";
    }
}
