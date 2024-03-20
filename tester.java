import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Simulation s = new Simulation();
        boolean isGameFinished = false;
        int turn;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team size; ");
        int number = in.nextInt();
        s.initialize(number);
        s.listAll();
        turn = s.starter;
        while(!isGameFinished){

            for(int i = 0; i < s.robotList.size() && !isGameFinished; i++ ){
                if(turn==0 && s.robotList.get(i).getIsRedTeam()){
                    s.robotList.get(i).attack(s);
                }
                else if(turn ==1 && !s.robotList.get(i).getIsRedTeam()){
                    s.robotList.get(i).attack(s);
                }
                int numberRed = 0;
                int numberBlue = 0;
                for(int y = 0; y < s.robotList.size(); y++ ){
                    if(s.robotList.get(y).getIsRedTeam()){
                        numberRed++;
                    }
                    
                }
                for(int y = 0; y < s.robotList.size(); y++ ){
                    if(!s.robotList.get(y).getIsRedTeam()){
                        numberBlue++;
                    }
                }
                if(numberBlue ==0 || numberRed ==0){
                    isGameFinished = true;
                    System.out.println("game finished");
                    s.listAll();
                    if(numberBlue==0){
                        System.out.println("Red team wins");
                    }
                    else{
                        System.out.println("Blue team wins");
                    }
                }
            }
            

            if(turn ==0){
                turn = 1;
            }
            else{
                turn =0;
            }
        }
    }
}
