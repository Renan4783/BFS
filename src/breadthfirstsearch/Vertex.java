package breadthfirstsearch;

import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class Vertex {
    private String color = "Branco";
    private String name;
    private String parent = null;
    private int vt;
    private Vector adjacents = new Vector();
    
    public Vertex(String nome) {
        this.name = nome;
    }
    
    public void addAdjacent(Vertex v){
        adjacents.add(v);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }
    
    public Vector getAdjacents() {
        return adjacents;
    }

    public void setParent(String father) {
        this.parent = father;
    }

    public int getVt() {
        return vt;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }
}
