public class TapHandler {
    public float maxDistanceForTap = 40;

    public void handleTap(float tapX, float tapY) {
        // Example logic to determine if tap is within max distance
        float distance = calculateDistance(tapX, tapY);
        if (distance <= maxDistanceForTap) {
            System.out.println("Tap within max distance.");
        } else {
            System.out.println("Tap too far.");
        }
    }

    private float calculateDistance(float x, float y) {
        // Example distance calculation method
        // Replace with your actual distance calculation logic
        return (float) Math.sqrt(x * x + y * y);
    }
}
