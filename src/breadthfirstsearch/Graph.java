package breadthfirstsearch;

import java.util.Vector;
/**
 *
 * @author Carlos
 */
public class Graph {    
    private Vector vertexes = new Vector();
    
    public Graph(Vector v) {
        this.vertexes = v;
    }
    
    public Vector getVertexes() {
        return vertexes;
    }

    public void printVertexes(){
        Vertex aux = new Vertex(null);
        for (Object u : vertexes) {
            aux = (Vertex)u;
            System.out.println(aux.getName());
        }
    }
    
    public Vector getAdjacents(Vertex v){
        return v.getAdjacents();
    }
    
    public void printAdjacents(){
        Vertex aux = new Vertex(null);
        for (Object u : vertexes) {
            aux = (Vertex) u;
            System.out.print(aux.getName()+" | ");
            Vector vector = new Vector();
            vector = aux.getAdjacents();
            for (Object v : vector) {
                aux = (Vertex) v;
                System.out.print(" -> "+aux.getName());
            }
            System.out.println();
        }
    }
    
    public void printTimes(){
        Vertex aux = new Vertex(null);
        for (Object u : vertexes) {
            aux = (Vertex) u;
            System.out.println();
            System.out.println("-----------"+aux.getName()+"-------------------");
            System.out.println("Nome: "+aux.getName());
            System.out.println("Cor: "+aux.getColor());
            System.out.println("Pai: "+aux.getParent());
            System.out.println("Numero de vértices: "+aux.getVt());
        }
    }  
}
