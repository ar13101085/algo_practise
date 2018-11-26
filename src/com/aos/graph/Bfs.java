package com.aos.graph;

import java.util.ArrayList;
import java.util.Stack;

public class Bfs {

	public static void main(String[] args) {

		//Grap init
		Node a=new Node("A");
		Node b=new Node("B");
		Node c=new Node("C");
		Node d=new Node("D");
		Node e=new Node("E");
		Node f=new Node("F");
		Node g=new Node("G");

		//graph represent
		a.nodes.add(b);
		a.nodes.add(c);

		b.nodes.add(a);
		b.nodes.add(d);

		c.nodes.add(a);
		c.nodes.add(d);
		c.nodes.add(e);

		d.nodes.add(b);
		d.nodes.add(c);

		e.nodes.add(c);
		e.nodes.add(f);

		f.nodes.add(e);
		f.nodes.add(g);

		/*****************/

		BFS(a).stream().forEach(node->{
			System.out.println(node.name+" ---- "+node.level);
		});

	}

	public static ArrayList<Node> BFS(Node sourceNode) {
		ArrayList<Node> visitedNode=new ArrayList<>();
		Stack<Node> stackNodes=new Stack<>();
		sourceNode.level=0;
		stackNodes.push(sourceNode);
		while(!stackNodes.isEmpty()) {
			Node currentNode=stackNodes.firstElement();
			
			currentNode.isVisited=true;
			visitedNode.add(currentNode);

			for (Node node : currentNode.nodes) {
				if(!node.isVisited) {	
					node.isVisited=true;
					node.level=currentNode.level+1;
					stackNodes.push(node);
					//System.out.println(node.name);
				}
			}
			stackNodes.remove(0);
		}
		return visitedNode;
	}

}
