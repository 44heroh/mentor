package com.company.DijkstrasAlgorithm;

import java.util.*;

// Java-реализация алгоритма Дейкстры
// использование приоритетной очереди
public class DPQ {

    private int dist[];// Это массив, который используется для хранения текущих расстояний (кратчайших путей) от начальной вершины до всех других вершин в графе
    private Set<Integer> settled; //Это множество вершин, которые уже были обработаны и для которых найдены кратчайшие пути
    private PriorityQueue<Node> pq; //  Это приоритетная очередь (PriorityQueue), которая используется для выбора вершины с наименьшим расстоянием на каждом шаге алгоритма
    private int V; // Количество вершин
    List<List<Node> > adj; //матрица смежности

    public DPQ(int V)
    {
        this.V = V;
        dist = new int[V];// Инициализация массива dist для хранения кратчайших расстояний.
        settled = new HashSet<Integer>();// Инициализация множества settled для отслеживания установленных вершин.
        pq = new PriorityQueue<Node>(V, new Node());// Инициализация приоритетной очереди pq для выбора вершин с наименьшим расстоянием.
    }

    public void dijkstra(List<List<Node>> adj, int src) {
        // Метод dijkstra выполняет алгоритм Дейкстры для поиска кратчайших путей в графе. Принимает список смежности adj и начальную вершину src.
        this.adj = adj;

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE; // Инициализация массива dist с max значениями.
        }

        // Расстояние до источника равно 0
        dist[0] = 0;

        // Добавляем исходный узел в приоритетную очередь
        pq.add(new Node(src, 0));

        while (settled.size() != V && !pq.isEmpty()) {
            // Начало цикла, который выполняется, пока не все вершины станут "установленными" (расстояние до них найдено) и когда приоритетная очередь не пуста.
            int u = pq.remove().node; // Извлечение вершины с наименьшим расстоянием из приоритетной очереди.

            settled.add(u);// Добавление вершины u в множество "установленных" вершин.

            e_Neighbours(u);// Вызов метода e_Neighbours(u), который обновит расстояния до соседних вершин от вершины u.
        }
    }

    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;// Переменная для хранения веса ребра.
        int newDistance = -1;// Переменная для хранения нового расстояния

        for (int i = 0; i < adj.get(u).size(); i++) {
            // Начало цикла для перебора соседних вершин вершины u в списке смежности.
            Node v = adj.get(u).get(i);// Получение соседней вершины v и ее стоимости (веса ребра).

            if(!settled.contains(v.node)) {
                // Проверка, не была ли вершина v уже установлена (расстояние до нее уже найдено).
                edgeDistance = v.cost; // Присвоение веса ребра переменной edgeDistance.
                newDistance = dist[u] + edgeDistance; // Вычисление нового расстояния до вершины v через вершину u.

                // Проверка, является ли новое расстояние меньшим, чем текущее известное расстояние до вершины v.
                if(newDistance < dist[v.node]) {
                    dist[v.node] = newDistance; // Если да, обновление расстояния до вершины v.
                }

                pq.add(new Node(v.node, dist[v.node])); // Добавление вершины v в приоритетную очередь с обновленным расстоянием.
            }
        }
    }

    // Driver code
    public static void main(String arg[])
    {
        int V = 6;
        int source = 0;

        // Представление списка смежности
        // соединенные ребра
        List<List<Node> > adj = new ArrayList<List<Node> >();

        // Инициализировать список для каждого узла
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Входные данные для графика DPQ
//        adj.get(0).add(new Node(1, 9));
//        adj.get(0).add(new Node(2, 6));
//        adj.get(0).add(new Node(3, 5));
//        adj.get(0).add(new Node(4, 3));
//
//        adj.get(2).add(new Node(1, 2));
//        adj.get(2).add(new Node(3, 4));
        adj.get(0).add(new Node(1, 7));
        adj.get(0).add(new Node(2, 9));
        adj.get(0).add(new Node(5, 14));

        adj.get(1).add(new Node(2, 10));
        adj.get(1).add(new Node(3, 15));

        adj.get(2).add(new Node(3, 11));
        adj.get(2).add(new Node(5, 2));

        adj.get(3).add(new Node(4, 6));

        adj.get(4).add(new Node(5, 9));

        adj.get(5).add(new Node(4, 9));

        // Рассчитываем кратчайший путь из одного источника
        DPQ dpq = new DPQ(V);
        dpq.dijkstra(adj, source);

        // Печатаем кратчайший путь ко всем узлам
        // из исходного узла
        System.out.println("The shorted path from node :");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " to " + i + " is "
                    + dpq.dist[i]);
    }
}

// Класс для представления узла в графе
class Node implements Comparator<Node> {
    public int node;
    public int cost;

    public Node()
    {
    }

    public Node(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compare(Node node1, Node node2)
    {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        return 0;
    }
}
