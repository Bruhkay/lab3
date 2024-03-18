public class tester {
    public static void main(String[] args) {
        Simulation s = new Simulation();
        boolean isGameFinished = false;
        int turn;
        s.initialize(5);
        s.listAll();
        turn = s.starter;
        while(!isGameFinished){
            if(turn == 0){
                for(int i = 0; i < s.robotList.size(); i++ ){
                    if(turn==0 && s.robotList.get(i).getIsRedTeam()){

                    }
                    else if(turn ==1 && !s.robotList.get(i).getIsRedTeam()){
                        
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
