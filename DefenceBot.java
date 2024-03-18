public class DefenceBot extends Robot {

    DefenceBot(){
        this.setATTACK(Math.random()/2);
        this.setHEALTH(Math.random()*3+3);
        this.setSPEED(Math.random()/2);
        this.setName("D"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
            
    }
    
}
