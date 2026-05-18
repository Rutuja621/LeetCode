class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;

        // Map to store all indices for each value
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        // Start from the first index
        queue.offer(0);
        visited[0] = true;
        int steps = 0;

        // Standard BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();

                // Base case: reached the last index
                if (curr == n - 1) return steps;

                // Option 1: Jump to same values
                if (graph.containsKey(arr[curr])) {
                    for (int next : graph.get(arr[curr])) {
                        if (!visited[next]) {
                            visited[next] = true;
                            queue.offer(next);
                        }
                    }
                    // Crucial optimization: clear the entries to prevent O(N^2)
                    graph.remove(arr[curr]);
                }

                // Option 2: Jump forward (i + 1)
                if (curr + 1 < n && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    queue.offer(curr + 1);
                }

                // Option 3: Jump backward (i - 1)
                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    queue.offer(curr - 1);
                }
            }
            steps++;
        }

        return -1;
 
    }
}