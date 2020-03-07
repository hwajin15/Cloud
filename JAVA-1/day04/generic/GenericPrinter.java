package generic;

public class GenericPrinter<T extends Material>{
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    public String priting(){
        return material.doPrint();
    }
}
