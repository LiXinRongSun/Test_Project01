package indio.lixinrong.oriented.object04.fbsbasics04;

public class Context {
    private Swimming swimming;
    public Context(){

    }
    public Context(Swimming swimming){
        this.swimming =swimming;

    }
    public void doSwimming(){
        this.swimming.swimm();
    }
}