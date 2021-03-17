package taller3.televisores;

public class Control {
    TV tv;

    public void turnOn(){
        tv.estado = true;
    }
    public void turnOff(){
        tv.estado = false;
    }
    public void canalUp(){
        if (tv.canal < 120 && tv.estado){
            tv.canal ++;
        }
    }
    public void canalDown(){
        if (tv.canal > 1 && tv.estado){
            tv.canal --;
        }
    }
    public void setCanal(int canal){
        if(canal >= 1 && canal <= 120 && tv.estado){
            tv.canal = canal;
        }
    }
    public void volumenUp(){
        if (tv.volumen < 7 && tv.estado){
            tv.volumen ++;
        }
    }
    public void volumenDown(){
        if (tv.volumen > 0 && tv.estado){
            tv.volumen --;
        }
    }
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }
}
