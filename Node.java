package test;

import java.util.ArrayList;
import java.util.List;


public class Node {
    private String name;
    private List<Node> edges;
    private Message msg;

    
    public Node(String edge_name) {
    	this.name = edge_name;
    	this.edges = new ArrayList<Node>(); 
    	this.msg = new Message(edge_name); 
    	
    }
    
    public String getName() {return this.name;}
    public List<Node> getEdges(){return this.edges; }
    public Message getMsg() {return this.msg;}
    
    
    public void addEdge(Node n) {
    	this.edges.add(n); 
    }
    
    public boolean hasCycles(Node n) {
    	
    }
    
    
    
    


}