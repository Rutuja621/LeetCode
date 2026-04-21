class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
         int n = source.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        // Group indices that can be swapped
        for (int[] swap : allowedSwaps) {
            int rootA = find(parent, swap[0]);
            int rootB = find(parent, swap[1]);
            if (rootA != rootB) parent[rootA] = rootB;
        }

        // Map each root to the counts of elements in its component
        Map<Integer, Map<Integer, Integer>> components = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(parent, i);
            components.putIfAbsent(root, new HashMap<>());
            components.get(root).put(source[i], components.get(root).getOrDefault(source[i], 0) + 1);
        }

        int distance = 0;
        for (int i = 0; i < n; i++) {
            int root = find(parent, i);
            Map<Integer, Integer> counts = components.get(root);
            
            // If target element exists in the allowed swap group, "use" it
            if (counts.getOrDefault(target[i], 0) > 0) {
                counts.put(target[i], counts.get(target[i]) - 1);
            } else {
                distance++; // Cannot match this position
            }
        }
        return distance;
    }

    private int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]); // Path compression
    
    }
}