class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // Edge Case: If the target color is the same as the original color,
        // no changes are needed, and avoiding this prevents an infinite loop.
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }

        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Base case: Check bounds and ensure the current pixel matches the original color
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor) {
            return;
        }

        // Update the pixel color
        image[r][c] = newColor;

        // Recursively visit all 4 adjacent directions
        dfs(image, r - 1, c, originalColor, newColor); // Up
        dfs(image, r + 1, c, originalColor, newColor); // Down
        dfs(image, r, c - 1, originalColor, newColor); // Left
        dfs(image, r, c + 1, originalColor, newColor); // Right
    }
}