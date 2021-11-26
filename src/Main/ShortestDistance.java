package Main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class ShortestDistance {
    // Java program to find the shortest pairwise distance between two points.


        static class Pair
        {
            int source, destination;

            public Pair(int source, int destination)
            {
                this.source = source;
                this.destination = destination;
            }

            public Pair()
            {}
        }

        static final int N = 100005;
        static final int MAXI = 99999999;

        // Function to add edges
        static void add_edge(ArrayList<Pair> weighted_edge[],
                             int x, int y, int weight)
        {
            weighted_edge[x].add(new Pair(y, weight));
            weighted_edge[y].add(new Pair(x, weight));
        }

        // Function to find the shortest
// distance between any pair of
// two different good nodes
        static int minDistance(ArrayList<Pair> weighted_edge[], int n,
                               int dist[], int vis[],
                               int a[], int k)
        {

            // Keeps minimum element on top
            PriorityQueue<Pair> q = new PriorityQueue<>(
                    new Comparator<Pair>()
                    {
                        public int compare(Pair p1, Pair p2)
                        {
                            if (p1.source == p2.source)
                            {
                                return p1.destination - p2.destination;
                            }
                            return p1.source - p2.source;
                        }
                    });

            // To keep required answer
            int ans = MAXI;

            for(int i = 1; i <= n; i++)
            {
                int[] route = {1,2,3,4,5};

                // If it is not good vertex
                if (a[i] == 0)
                    continue;


                // Keep all vertices not visited
                // and distance as MAXI
                for(int j = 1; j <= n; j++)
                {
                    dist[j] = MAXI;
                    vis[j] = 0;
                }

                // Distance from ith vertex
                // to ith is zero
                dist[i] = 0;

                // Make queue empty
                while (!q.isEmpty())
                    q.poll();

                // Push the ith vertex
                q.add(new Pair(0, i));

                // Count the good vertices
                int good = 0;

                while (!q.isEmpty())
                {

                    // Take the top element
                    int v = q.peek().destination;

                    // Remove it
                    q.poll();

                    // If it is already visited
                    if (vis[v] != 0)
                        continue;
                    vis[v] = 1;

                    // Count good vertices
                    good += a[v];

                    // If distance from vth vertex
                    // is greater than ans
                    if (dist[v] > ans)
                        break;

                    // If two good vertices are found
                    if (good == 2 && a[v] != 0)
                    {
                        ans = Math.min(ans, dist[v]);
                        break;
                    }

                    // Go to all adjacent vertices
                    for(int j = 0; j < weighted_edge[v].size(); j++)
                    {
                        int to = weighted_edge[v].get(j).source;
                        int weight = weighted_edge[v].get(j).destination;

                        // If distance is less
                        if (dist[v] + weight < dist[to])
                        {
                            dist[to] = dist[v] + weight;
                            q.add(new Pair(dist[to], to));
                        }
                    }
                }
            }

            // Return the required answer
            return ans;
        }

        // Driver code



}
