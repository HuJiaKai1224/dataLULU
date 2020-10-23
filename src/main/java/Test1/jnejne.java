package Test1;

public class jnejne {
    float weight;
    float height;
    public jnejne(float weight,float height){
        this.weight=weight;
        this.height=height;
    }
    public float bmi(){
        float bmi=weight / (height*height);
        return bmi;
    }
}

