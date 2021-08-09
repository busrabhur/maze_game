
import java.util.Scanner;


public class Main {
    static MAZE maze=new MAZE();
    
    public void run(){
        maze.start();
        maze.printMaze();
        if (!maze.finished()) {
            run();
        }
    }
    
    public static void main(String[] args) {
        //play game kodları
        /*Main mainPlay=new Main();
        maze.intializeMap();//labirenti oluşturacak dizi başlatıldı
        maze.printMaze();
        mainPlay.run();*/
        
        //oyuna başlamadan görünecek oyun menüsü.
        Scanner scanner=new Scanner(System.in);
        String menu="**********MAZE GAME MENU************\n1.PLAY\n2.HELP\n3.QUİT\n************************************";
        System.out.println(menu);
        
        while (true) {            
            System.out.println("Select a number (1-2-3):");
            String selected=scanner.nextLine();
            
            if (selected.equals("1")) {//play the game
                Main mainPlay=new Main();
                maze.intializeMap();//labirenti oluşturacak dizi başlatıldı
                maze.printMaze();
                mainPlay.run();
                if(maze.finished()) {
                    System.out.println("Do you want to play again?(yes/no)");
                    Scanner scan2=new Scanner(System.in);
                    String answer=scan2.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                         
                            maze.intializeMap();//labirenti oluşturacak dizi başlatıldı
                            maze.printMaze();
                            mainPlay.run();
                    }else{
                        System.out.println(menu);
                        continue;
                    }
                }
            }
            else if (selected.equals("2")) {
                System.out.println("^#######GAME RULES######\n\n-You can play this game with wasd keys\n-When you reach the end, you solve the maze and the game is over.\n\n######################## ");
            }
            else {
                System.out.println("Çıkış yapılıyor.");
                break;
            }
        }
        
        
    }
    
}
