package indio.lixinrong.javasenior.thread;

public class Act {
    private  String  name;
    private  double value;
    public Act(){

    }
    public Act(String name, double value){
        this.name = name;
        this.value = value;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void qu(double value){
        synchronized(this){
        double before = this.value;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.value = before-value;
    }



    }
}
