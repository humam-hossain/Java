public class RoboGrid {
    final static int MX = 100;
    final static int MY = 100;
    private int cur_x;
    private int cur_y;
    private String name;

    RoboGrid(){
        this.name = "Nimo";
        this.cur_x = 0;
        this.cur_y = 0;
    }

    RoboGrid(String name, int x, int y){
        this.name = name;
        this.cur_x = x;
        this.cur_y = y;
    }

    boolean moveUp(int z){
        if(this.cur_y+z > MY){
            this.cur_y = MY;
            return false;
        }

        if(this.cur_y+z < 0){
            this.cur_y = 0;
            return false;
        }

        this.cur_y += z;
        return true;
    }

    boolean moveRight(){
        if(this.cur_x+1 > MX){
            return false;
        }

        this.cur_x += 1;
        return true;
    }

    boolean moveRight(int z){
        if(this.cur_x+z > MX){
            this.cur_x = MX;
            return false;
        }
        
        if(this.cur_x+z < 0){
            this.cur_x = 0;
            return false;
        }

        this.cur_x += z;
        return true;
    }

    boolean setPos(int x, int y){
        if(x > MX || y > MY){
            return false;
        }

        if(x < 0 || y < 0){
            return false;
        }

        this.cur_x = x;
        this.cur_y = y;

        return true;
    }

    int getPosX(){
        return this.cur_x;
    }

    int getPosY(){
        return this.cur_y;
    }

    @Override
    public String toString(){
        return "The robot-" + this.name + " is at (" + this.cur_x + "," + this.cur_y + ")";
    }

}