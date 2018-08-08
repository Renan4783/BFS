package breadthfirstsearch;

import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class BreadthFirstSearch {
    private Vector openVertices = new Vector();
    
    public BreadthFirstSearch(Graph g, Vertex start) {
        Vertex aux = new Vertex(null);
        for (Object v : start.getAdjacents()) {
            aux = (Vertex) v;
            aux.setVt(Integer.MAX_VALUE);
            aux.setParent(null);
            aux.setColor("Branco");
        }
        start.setVt(0);
        start.setParent(null);
        start.setColor("Cinza");
        BFS(g, start);
    }
    
    private void BFS(Graph g, Vertex start) {
        Vertex aux = new Vertex(null);
        openVertices.add(start);
        while (!openVertices.isEmpty()) {
            aux = (Vertex) openVertices.remove(0);
            for (Object v : aux.getAdjacents()) {
                Vertex aux2 = new Vertex(null);
                aux2 = (Vertex) v;
                if (aux2.getColor().equals("Branco")) {
                    aux2.setVt(aux.getVt()+1);
                    aux2.setParent(aux.getName());
                    aux2.setColor("Cinza");
                    openVertices.add(v);
                }
            }
            aux.setColor("Preto");
        }
    }
}
