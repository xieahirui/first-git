public class Hotel {
    //房间
    Room[][] rooms;
    //Constructor
    Hotel(){
        //5层  每层十个房间
        rooms = new Room[5][10];
        //赋值
        //1,2标准间
        //3,4双人间
        //5豪华间
        for (int i = 0;i<rooms.length;i++){
            for (int j = 0;j<rooms[i].length;j++){
                if(i==0 || i==1 ){
                    rooms[i][j] = new Room(((i+1)*100)+j+1+"","标准间",false);
                }
                if(i==2 || i==3 ){
                    rooms[i][j] = new Room(((i+1)*100)+j+1+"","双人间",false);
                }
                if(i==4){
                    rooms[i][j] = new Room(((i+1)*100)+j+1+"","豪华间",false);
                }
            }
        }
    }
    //对要打印酒店房间信息
    public void print(){
        for(int i=0;i<rooms.length;i++){
            for(int j = 0;j<rooms.length;j++){
                System.out.println(rooms[i][j]);
            }
        }
    }
    //对外提供一个预订酒店的方法
    public void order(String no){
        for(int i =0;i<rooms.length;i++){
            for(int j = 0;j<rooms[i].length;j++){
                if(rooms[i][j].getNo().equals(no)){
                    //将该房间的状态改为占用
                    rooms[i][j].setUse(true);
                    return;
                }
            }
        }
    }
    //对外提供一个退订酒店的方法
    public void exit(String no){
        for(int i =0;i<rooms.length;i++){
            for(int j = 0;j<rooms[i].length;j++){
                if(rooms[i][j].getNo().equals(no)){
                    //将该房间的状态改为占用
                    rooms[i][j].setUse(false);
                    return;
                }
            }
        }
    }
}
