package breadthfirstsearch;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {
        //ArrayList<Vertex> vertices = new ArrayList<>();
        Vector vertices = new Vector();
        ReaderVertex l = new ReaderVertex("teste.txt", vertices);
        Graph g = new Graph(vertices);
        System.out.println("Vertices");
        g.printVertexes();
        g.printAdjacents();
        new BreadthFirstSearch(g, (Vertex)vertices.get(0));
        g.printTimes();
    }
}
