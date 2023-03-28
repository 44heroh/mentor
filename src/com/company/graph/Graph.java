package com.company.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {

    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean[] visited;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjLists = new LinkedList[numVertices];
        visited = new boolean[numVertices];

        for(int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    private void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    private void DFS(int vertex) {
        // помечаем текущий узел как обнаруженный
        visited[vertex] = true;
        System.out.println(vertex + " ");
        // получаем объект итератора
        Iterator<Integer> ite = adjLists[vertex].listIterator();
        // проверяем есть ли следующий элемент
        while(ite.hasNext()) {
            int adj = ite.next();
            // проверяем входит ли следующий элемент в массив посещенных
            if(!visited[adj])
                DFS(adj);
        }
    }

    private void BFS(int vertex) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // помечаем текущий узел как обнаруженный
        visited[vertex] = true;
        // добавляем в очередь
        queue.add(vertex);

        // пока очередь не пуста
        while(!queue.isEmpty()) {
            // забираем верхний элемент
            int top = queue.poll();
            System.out.println(top);

            // получаем объект итератора
            Iterator<Integer> ite = adjLists[top].listIterator();
            // проверяем есть ли следующий элемент
            while(ite.hasNext()) {
                int n = ite.next();
                // проверяем входит ли следующий элемент в массив посещенных
                if(!visited[n]){
                    // помечаем текущий узел как обнаруженный
                    visited[n] = true;
                    // добавляем в очередь
                    queue.add(n);
                }
            }
        }
    }

    public static void dfs()
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS(0);
    }

    public static void bfs()
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.BFS(0);
    }

}
