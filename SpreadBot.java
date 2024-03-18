public class SpreadBot extends Robot {
    SpreadBot(boolean isRedTeam){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()/2);
        this.setSPEED(Math.random()+0.5);
        this.setName("K"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        
        System.out.println(this.getName() + " attacks following targets \n" );
        for (int i =0; i < s.getLowestSpeed3(!this.getIsRedTeam()).length ; i++) {
            System.out.print(s.getLowestSpeed3(!this.getIsRedTeam())[i] + " ");
        }
        System.out.println();

        for (int i =0; i < s.getLowestSpeed3(!this.getIsRedTeam()).length ; i++) {
            
            s.damageToBot(s.getLowestSpeed3(!this.getIsRedTeam())[i], this.ATTACK); 
        }
    }
    
}
