public class Question10 {
    public int change(int amount, int[] coins) {
        int[] result = new int[amount+1];
        result[0]=1;
        int n=coins.length;
        for(int i=0;i<n;i++){
            for(int j=coins[i];j<=amount;j++){
                result[j] += result[j-coins[i]];
            }
        }
        return result[amount];
    }
}
