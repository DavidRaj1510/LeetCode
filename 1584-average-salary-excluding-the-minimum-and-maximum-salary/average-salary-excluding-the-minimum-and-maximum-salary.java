class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;int c=0;
        for(int i=1;i<salary.length-1;i++)
        {
            c++;
            sum+=salary[i];
        }
        return sum/c;
    }
}