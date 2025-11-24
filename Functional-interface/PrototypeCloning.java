class Model implements Cloneable {
    String type = "Prototype";
    public Model clone() throws CloneNotSupportedException {
        return (Model) super.clone();
    }
}

public class PrototypeCloning {
    public static void main(String[] args) throws Exception {
        Model m1 = new Model();
        Model m2 = m1.clone();
        System.out.println(m2.type);
    }
}

