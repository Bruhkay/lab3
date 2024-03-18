public class OneBot extends Robot {
    OneBot(){
        this.setHEALTH(Math.random()/2);
        this.setATTACK(Math.random()+4);
        this.setSPEED(Math.random()/2);
        this.setName("O"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
