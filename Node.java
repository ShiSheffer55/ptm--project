package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
    
    public void setName(String name) {this.name = name;}
    public void setEdges(List<Node> edges) {this.edges = edges; }
    public void setMsg(Message msg) {this.msg = msg;} 
    
    
    public void addEdge(Node n) {
    	this.edges.add(n); 
    }
    
    public boolean hasCycles(Node n) {
    	Set<Node> hasSeen = new HashSet<>(); 
    	Set<Node> k = new HashSet<>(); 
    	return hasCyclesHelper(this, hasSeen, k); 
    }
    
    public boolean hasCyclesHelper(Node current, Set<Node> hasSeen, Set<Node> k) {
    	if(k.contains(current)) {
    		return true; 
    	}
    	if(hasSeen.contains(current)) {
    		return false; 
    	}
    }
    
    
    
    


}