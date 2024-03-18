public class SpeedBot extends Robot{
    SpeedBot(){
        this.setHEALTH(Math.random()+1);
        this.setATTACK(Math.random()+1);
        this.setSPEED(Math.random()+3);
        this.setName("X"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
