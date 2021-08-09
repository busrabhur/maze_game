
public class Player {
    int x;
    int y;

    public Player() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    private void updateX(int value){
        this.x+=value;
    }
    
    private void updateY(int value){
        this.y+=value;
    }
    
    //WASD tuşları ile hareket
    public String move(String direction){
        switch(direction){
            case ("w"):
                updateX(-1);
                return "w";
            case ("s"):
                updateX(1);
                return "s";
            case("a"):
                updateY(-1);
                return "a";
            case("d"):
                updateY(1);
                return "d";
        }
        return "";
    }

   
    
    
    
}
