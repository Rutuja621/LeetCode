class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int bestIdx = 0; // Tracks the optimal container word index for this node
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        TrieNode root = new TrieNode();
        
        // Find the absolute default best index (smallest length, earliest appearance)
        for (int i = 1; i < wordsContainer.length; i++) {
            if (wordsContainer[i].length() < wordsContainer[root.bestIdx].length()) {
                root.bestIdx = i;
            }
        }

        // Build the Trie with reversed words
        for (int i = 0; i < wordsContainer.length; i++) {
            String word = wordsContainer[i];
            TrieNode curr = root;
            
            for (int j = word.length() - 1; j >= 0; j--) {
                int c = word.charAt(j) - 'a';
                if (curr.children[c] == null) {
                    curr.children[c] = new TrieNode();
                    curr.children[c].bestIdx = i; // First time visiting this node means i is the earliest index
                }
                curr = curr.children[c];
                
                // Update node if the current word is strictly shorter
                if (word.length() < wordsContainer[curr.bestIdx].length()) {
                    curr.bestIdx = i;
                }
            }
        }

        // Process each query
        int[] ans = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            String query = wordsQuery[i];
            TrieNode curr = root;
            
            for (int j = query.length() - 1; j >= 0; j--) {
                int c = query.charAt(j) - 'a';
                if (curr.children[c] == null) break;
                curr = curr.children[c];
            }
            ans[i] = curr.bestIdx;
        }

        return ans;
    }
}