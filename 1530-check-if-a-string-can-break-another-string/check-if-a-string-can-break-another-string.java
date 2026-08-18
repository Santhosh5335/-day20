class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int n = s1.length();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0;i<n;i++)
            {
                char c = s1.charAt(i);
                char c2 = s2.charAt(i);
                arr1[i]=c;
                arr2[i]=c2;
            }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag1 = true,flag2 = true;
        for(int i=0;i<n;i++)
            {
                if(arr1[i]<arr2[i])flag1=false;
                if(arr2[i]<arr1[i])flag2=false;
            }
        return flag1 || flag2 ;
    }
}