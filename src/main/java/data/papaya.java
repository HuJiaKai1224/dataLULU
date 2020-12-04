package data;

public class papaya {
    String name;
    float weight;
    float height;
    public papaya(float weight,float height) {
        this.weight = weight;
        this.height = height;
    }
    public papaya(String name,float weight,float height){
        this(weight,height);
        this.name=name;
    }

    public float bmi(){
        float bmi= weight / (height*height);
        return bmi;
    }
    public void xd(){
        System.out.println("i love you");
    }
}
