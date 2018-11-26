package com.aos.graph;

import java.util.ArrayList;
import java.util.Stack;

public class Dfs {

	public static void main(String[] args) {
		Node a=new Node("A");
		Node b=new Node("B");
		Node c=new Node("C");
		Node d=new Node("D");
		Node e=new Node("E");
		
		//connected graph represent
		a.nodes.add(b);
		a.nodes.add(c);
		c.nodes.add(d);
		c.nodes.add(e);
		e.nodes.add(c);
		d.nodes.add(b);
		
		
		Dfs(a).stream().forEach(node->{
			System.out.println(node.name);
		});;
	}
	
	public static ArrayList<Node> Dfs(Node a) {

		ArrayList<Node> dfsPath=new ArrayList<>();
		Stack<Node> stackNode=new Stack<>();
		
		stackNode.push(a);
		while(!stackNode.isEmpty()) {
			Node currentNode=stackNode.pop();
			if(!currentNode.isVisited) {
				currentNode.isVisited=true;
				dfsPath.add(currentNode);
				for (Node node : currentNode.nodes) {
					if(!node.isVisited) {
						//System.out.println("push "+node.name);
						stackNode.push(node);
					}
				}
				
			}
			
			
		}
		return dfsPath;
	}

}

class Node{
	boolean isVisited;
	String name;
	int level=0;
	ArrayList<Node> nodes=new ArrayList<>();
	public Node(String name) {
		super();
		this.name = name;
	}
}
