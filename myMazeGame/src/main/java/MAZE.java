
import java.util.Scanner;


public class MAZE {
    Scanner scan=new Scanner(System.in);
    Player player=new Player();
    String[][] gameMap= new String[10][10];
    
    public void intializeMap() {
        gameMap[0][0] = "Blank";
        gameMap[0][1] = "Blank";
        gameMap[0][2] = "Wall";
        gameMap[0][3] = "Wall";
        gameMap[0][4] = "Wall";
        gameMap[0][5] = "Wall";
        gameMap[0][6] = "Wall";
        gameMap[0][7] = "Wall";
        gameMap[0][8] = "Wall";
        gameMap[0][9] = "Wall";
        gameMap[1][0] = "Wall";
        gameMap[1][1] = "Blank";
        gameMap[1][2] = "Wall";
        gameMap[1][3] = "Blank";
        gameMap[1][4] = "Wall";
        gameMap[1][5] = "Wall";
        gameMap[1][6] = "Blank";
        gameMap[1][7] = "Blank";
        gameMap[1][8] = "Blank";
        gameMap[1][9] = "Wall";
        gameMap[2][0] = "Wall";
        gameMap[2][1] = "Blank";
        gameMap[2][2] = "Wall";
        gameMap[2][3] = "Blank";
        gameMap[2][4] = "Blank";
        gameMap[2][5] = "Blank";
        gameMap[2][6] = "Blank";
        gameMap[2][7] = "Wall";
        gameMap[2][8] = "Blank";
        gameMap[2][9] = "Wall";
        gameMap[3][0] = "Wall";
        gameMap[3][1] = "Blank";
        gameMap[3][2] = "Wall";
        gameMap[3][3] = "Blank";
        gameMap[3][4] = "Wall";
        gameMap[3][5] = "Wall";
        gameMap[3][6] = "Blank";
        gameMap[3][7] = "Wall";
        gameMap[3][8] = "Blank";
        gameMap[3][9] = "Wall";
        gameMap[4][0] = "Wall";
        gameMap[4][1] = "Blank";
        gameMap[4][2] = "Blank";
        gameMap[4][3] = "Blank";
        gameMap[4][4] = "Wall";
        gameMap[4][5] = "Wall";
        gameMap[4][6] = "Blank";
        gameMap[4][7] = "Blank";
        gameMap[4][8] = "Wall";
        gameMap[4][9] = "Wall";
        gameMap[5][0] = "Wall";
        gameMap[5][1] = "Blank";
        gameMap[5][2] = "Wall";
        gameMap[5][3] = "Wall";
        gameMap[5][4] = "Wall";
        gameMap[5][5] = "Wall";
        gameMap[5][6] = "Wall";
        gameMap[5][7] = "Blank";
        gameMap[5][8] = "Wall";
        gameMap[5][9] = "Wall";
        gameMap[6][0] = "Wall";
        gameMap[6][1] = "Blank";
        gameMap[6][2] = "Blank";
        gameMap[6][3] = "Blank";
        gameMap[6][4] = "Blank";
        gameMap[6][5] = "Blank";
        gameMap[6][6] = "Wall";
        gameMap[6][7] = "Blank";
        gameMap[6][8] = "Blank";
        gameMap[6][9] = "Wall";
        gameMap[7][0] = "Wall";
        gameMap[7][1] = "Blank";
        gameMap[7][2] = "Wall";
        gameMap[7][3] = "Blank";
        gameMap[7][4] = "Wall";
        gameMap[7][5] = "Wall";
        gameMap[7][6] = "Wall";
        gameMap[7][7] = "Wall";
        gameMap[7][8] = "Blank";
        gameMap[7][9] = "Wall";
        gameMap[8][0] = "Wall";
        gameMap[8][1] = "Blank";
        gameMap[8][2] = "Wall";
        gameMap[8][3] = "Blank";
        gameMap[8][4] = "Blank";
        gameMap[8][5] = "Blank";
        gameMap[8][6] = "Blank";
        gameMap[8][7] = "Wall";
        gameMap[8][8] = "Blank";
        gameMap[8][9] = "Blank";
        gameMap[9][0] = "Wall";
        gameMap[9][1] = "Wall";
        gameMap[9][2] = "Wall";
        gameMap[9][3] = "Wall";
        gameMap[9][4] = "Wall";
        gameMap[9][5] = "Wall";
        gameMap[9][6] = "Wall";
        gameMap[9][7] = "Wall";
        gameMap[9][8] = "Wall";
        gameMap[9][9] = "Finish";//!!!!!!!!
    }
    
    public String start(){
        String direction=printMenu().toLowerCase();//print menu methodu ile input alınıyor(WASD).
        return AllIsValid(direction);
    }
    
    public boolean finished(){
        if (player.getX()==9 && player.getY()==9) {
            System.out.println("CONGRATS ! YOU WON THE GAME");
            return true;
        }
        else{
            return false;
        }
    }
    
    private String printMenu(){
        System.out.println("\nEnter a direction using WASD(w-a-s-d):");
        String direction=scan.nextLine(); //girilen yön direction değişkenine atandı.
        if (!direction.equalsIgnoreCase("w") && (!direction.equalsIgnoreCase("a")) && (!direction.equalsIgnoreCase("s")) && (!direction.equalsIgnoreCase("d"))) {
            printMenu();//geçerli bir yön girilmediyse menü tekrar yazdırılır.
        }
        return direction;
    }
    /*
     
    */
    
    private void printEachPoint(int corX,int corY){
        if (player.getY()==corY && player.getX()==corX) {
            if (player.getY()!=9) {
                System.out.print("ME");
            }else{
                System.out.println("ME");
            }
        }else{
            if (corY!=9) {
                if (gameMap[corX][corY].equalsIgnoreCase("Wall")) {
                    System.out.print("####");
                }
                else if (gameMap[corX][corY].equalsIgnoreCase("Blank")) {
                    System.out.print("    ");
                }
                else if (gameMap[corX][corY].equalsIgnoreCase("Finish")) { //[9][9] noktasının ismi finish
                    System.out.print(" END");
                }
            }else{
                if (gameMap[corX][corY].equalsIgnoreCase("Wall")) {
                    System.out.println("####");
                }
                else if (gameMap[corX][corY].equalsIgnoreCase("Blank")) {
                    System.out.println("    ");
                }
                else if (gameMap[corX][corY].equalsIgnoreCase("Finish")) { //[9][9] noktasının ismi finish
                    System.out.println(" END");
                }    
            }      
        } 
    }//end of method
    
    public void printMaze(){//printgameMAP
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                printEachPoint(i, j);
            }
        }
    }
    
    private boolean checkMoveIsWall(String direction){//gitmeye çalıştığı yer yol mu yoksa duvar mı? ,duvarsa TRUE döndür
        boolean result=true;
        switch(direction){
            case("w"):
                result=gameMap[player.getX()-1][player.getY()].equalsIgnoreCase("Wall");
                break;
            case ("s"):
                result=gameMap[player.getX()+1][player.getY()].equalsIgnoreCase("Wall");
                break;
            case ("d"):
                result=gameMap[player.getX()][player.getY()+1].equalsIgnoreCase("Wall");
                break;
            case ("a"):
                result=gameMap[player.getX()][player.getY()-1].equalsIgnoreCase("Wall");
                break;
        }
        return !(result);// !!! değili ,yani eğer yaptığı hamle duvara çarpmıyorsa yani yolsa TRUE döner.
    }
    
    private boolean onTheGameMap(String direction){
        boolean result=true;
        switch(direction){
            case("w"):
                result=(player.getX()-1 < 0);
                break;
            case("s"):
                result=(player.getX()+1 > 9);
                break;
            case("d"):
                result=(player.getY()+1 > 9);
                break;
            case("a"):
                result=(player.getY()-1 < 0);
                break;
        }
        return !(result);// !! değili ,yani istenmeyen bu durumlardan hiçbiri yoksa TRUE döner.
        
    }
    
    private String AllIsValid(String direction){//check all is valid
        if (onTheGameMap(direction) && checkMoveIsWall(direction)) { //yapılan hamle dizi sınırlarını aşmayacaksa ve oyuncu duvara çarpmayacaksa
            return player.move(direction); //oyuncunun hareketi istenen yönde sağlandı.
        }else{
            System.out.println("INVALID MOVE (Geçersiz Hamle) !!!");
            direction=printMenu().toLowerCase(); //tekrar yön girmesi istendi ve girilen yön directiona atandı.
            AllIsValid(direction); //method kendini tekrar çağıracak ve oyunun devamlılığı sürdürülecek.
        }
        return ""; 
    }    

   
         
    
    
    

}