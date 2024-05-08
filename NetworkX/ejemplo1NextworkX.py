# ejemplo de uso de Grafo

import networkx as nx
G = nx.DiGraph()

# agegar nodos
G.add_node("Anchorage")
G.add_node("Billings")
G.add_node("Edmonton")
G.add_node("Corvallis")
G.add_node("Denver")
G.add_node("Flagstaff")
G.add_node("Grand Rapids")
G.add_node("Houston")

print ("Nodos: ", G.nodes())

# agregar aristas
G.add_edge("Anchorage", "Billings")
G.add_edge("Anchorage", "Edmonton")
G.add_edge("Anchorage", "Corvallis")
G.add_edge("Billings", "Edmonton")
G.add_edge("Billings", "Denver")
G.add_edge("Corvallis", "Denver")
G.add_edge("Denver", "Edmonton")
G.add_edge("Denver", "Flagstaff")
G.add_edge("Flagstaff", "Denver")
G.add_edge("Flagstaff", "Houston")
G.add_edge("Grand Rapids", "Houston")

print ("Aristas: ", G.edges())

# Breath First Search

print ("BFS:")
#print (list(nx.bfs_edges(G,"Anchorage")))
print (list(nx.bfs_tree(G,"Anchorage")))
#print (nx.bfs_successors(G,"Anchorage"))


print ("DFS:")
print (list(nx.dfs_preorder_nodes(G,"Anchorage")))



