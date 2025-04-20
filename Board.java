package board;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Board {

    // Dimensions of the board
    int width, height;
    
    // Start and finish positions
    int startX=0, startY=0, finalX=0, finalY=0;

    // The possible moves
    final int[][] legalMoves = {{1,2}, {2,1}, {1,-2}, {2,-1}, {-1,2}, {-2,1}, {-1,-2}, {-2,-1} };

    // Graph vertices. Each keeps track of where it was reached from.
    public class Vertex {
        public int posX, posY;
        public Vertex parent;
        public Vertex(int x, int y, Vertex p){
            posX = x;
            posY = y;
            parent = p;
        }
    };
    
    // Keeps track of which squares have been visited, and stores the vertices.
    // This works as the closed list for bfs/dfs.
    boolean visited[][];
    
    // Creates a new vertex for a given square.
    // Private since it does not check if there already is one; that is done by bfsMove/dfsMove.
    // Note the (y,x) coordinates: this is done to make printing the board row by row easier if needed.
    private Vertex makeVertex(int x, int y, Vertex p) {
        Vertex v = new Vertex(x, y, p);
        visited[y][x] = true;
        return v;
    }

    // Sets up the board, initially filled with null pointers.
    // Note dimensions are [height][width] since we use [y][x] coordinates. 
    public Board(int w, int h){
        width = w;
        height = h;
        visited = new boolean[height][width];
    }

    public void setFinal(int x, int y) {
    	finalX = x;
	finalY = y;
    }

    public void setStart(int x, int y) {
	startX = x;
	startY = y;
    }

    // Print a path to vertex v. 
    // Follows the predecessor pointers to get a reversed version and uses a stack to flip it.
    public void printPath(Vertex v) {
	// TO DO
    }

    // Checks if the square (x,y) is within bounds and unvisited.
    public boolean available(int x, int y) {
        return ((x >= 0) && (y >= 0) && (x < width) && (y < height) && !visited[y][x] );
    }

    // If the move (dx,dy) is possible, creates and enqueues a vertex for the destination
    // dx and dy are the horizontal/vertical difference of the move, e.g. (2,0) would move 2 to the right.
    // Used by bfs.
    public void bfsMove(Vertex v, int dx, int dy, Queue<Vertex> q) {
        // TO DO
    }

    // Breadth-first search. For each explored vertex, tries all possible knight's moves (e.g. (1,2) or (-2,1))
    void bfs() {
        // TO DO
    }
    
    // If the move (dx,dy) is possible, creates and pushes a vertex for the destination
    // dx and dy are the horizontal/vertical difference of the move, e.g. (2,0) would move 2 to the right.
    // Used by dfs.
    public void dfsMove(Vertex v, int dx, int dy, Stack<Vertex> q) {
        // TO DO
    }

    // Depth-first search. For each explored vertex, tries all possible knight's moves (e.g. (1,2) or (-2,1))
    void dfs() {
        // TO DO
    }
    
    public static void main(String[] args) {
        Board b = new Board(8, 8);
        b.setStart(1, 1);
        b.setFinal(7, 6);
        b.dfs();    
    }
    
}
