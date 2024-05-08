import networkx as nx

# Creamos un grafo dirigido
G = nx.DiGraph()

# Añadimos nodos al grafo
G.add_nodes_from([1, 2, 3, 4])

# Añadimos aristas ponderadas al grafo
G.add_weighted_edges_from([(1, 2, 1), (1, 3, 4), (2, 3, 2), (2, 4, 5), (3, 4, 1)])

# Calculamos la distancia más corta usando el algoritmo de Dijkstra
dijkstra_distances = nx.single_source_dijkstra_path_length(G, 1, weight='weight')
print("Distancias más cortas usando Dijkstra:", dijkstra_distances)

# Calculamos la distancia más corta usando el algoritmo de Floyd-Warshall
floyd_warshall_distances = dict(nx.floyd_warshall(G))
print("Distancias más cortas usando Floyd-Warshall:", floyd_warshall_distances[1])

# Calculamos la distancia más corta usando el algoritmo de Bellman-Ford
bellman_ford_distances = nx.single_source_bellman_ford_path_length(G, 1, weight='weight')
print("Distancias más cortas usando Bellman-Ford:", bellman_ford_distances)