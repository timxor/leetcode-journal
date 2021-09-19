class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int valueX = 0;

        if (operations == null || operations.length == 0) { return valueX; }

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].contains("-")){
                valueX -= 1;
            } else if (operations[i].contains("+")) {
                valueX += 1;
            }
        }

        return valueX;
    }
}
