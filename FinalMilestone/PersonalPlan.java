package FinalMilestone;

public class PersonalPlan extends AIModel {

    private int availableTokens;

    public PersonalPlan(String modelName, double price, int parameterCount, int contextWindow, int availableTokens) {
        super(modelName, price, parameterCount, contextWindow);
        this.availableTokens = availableTokens;
    }

    public int getAvailableTokens() {
        return availableTokens;
    }

    public String purchaseTokens(int tokens) {
        if (tokens <= 0) {
            return "Enter a positive token value or upgrade to Pro Plan.";
        }

        availableTokens += tokens;
        return "Tokens purchased successfully. Available tokens: " + availableTokens;
    }

    public String enterPrompt(String promptText, int expectedOutputTokens) {
        try {
            int totalTokens = calculateTotalToken(promptText, expectedOutputTokens);

            if (totalTokens > availableTokens) {
                return "Not enough available tokens. Please purchase more tokens or upgrade to Pro Plan.";
            }

            availableTokens -= totalTokens;

            return "Prompt: " + promptText +
                   "\nTotal tokens used: " + totalTokens +
                   "\nAvailable tokens remaining: " + availableTokens;

        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @Override
    public String display() {
        return "Model Name: " + getModelName() +
               "\nPrice: " + getPrice() +
               "\nParameter Count: " + getParameterCount() +
               "\nContext Window: " + getContextWindow() +
               "\nAvailable Tokens: " + availableTokens;
    }
}