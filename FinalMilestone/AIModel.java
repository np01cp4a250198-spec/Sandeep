package FinalMilestone;
public abstract class AIModel {

    private String modelName;
    private double price;
    private int parameterCount;
    private int contextWindow;

    public AIModel(String modelName, double price, int parameterCount, int contextWindow) {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindow = contextWindow;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public int getParameterCount() {
        return parameterCount;
    }

    public int getContextWindow() {
        return contextWindow;
    }

    public int calculateTotalToken(String promptText, int expectedOutputTokens) {
        String[] words = promptText.trim().split("\\s+");
        int inputTokens = words.length;

        int totalTokens = inputTokens + expectedOutputTokens;

        if (totalTokens > contextWindow) {
            throw new IllegalArgumentException("Total tokens exceed context window.");
        }

        return totalTokens;
    }

    public abstract String display();
}