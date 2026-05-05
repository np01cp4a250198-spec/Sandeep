package FinalMilestone;

public class ProPlan extends AIModel {

    private int availableSlots;

    public ProPlan(String modelName, double price, int parameterCount, int contextWindow, int availableSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.availableSlots = availableSlots;
    }

    public String addTeamMember(String memberName) {
        if (availableSlots > 0) {
            availableSlots--;
            return "Team member " + memberName + " added. Remaining slots: " + availableSlots;
        } else {
            return "No available team slots.";
        }
    }

    public String removeTeamMember(String memberName) {
        availableSlots++;
        return "Team member " + memberName + " removed. Available slots: " + availableSlots;
    }

    public String enterPrompt(String promptText, int expectedOutputTokens) {
        try {
            int totalTokens = calculateTotalToken(promptText, expectedOutputTokens);

            return "Prompt: " + promptText +
                   "\nTotal tokens used: " + totalTokens +
                   "\nPro Plan: tokens are not reduced.";

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
               "\nAvailable Team Slots: " + availableSlots;
    }
}