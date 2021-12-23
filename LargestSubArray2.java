class LargestSubArray2
{
	int findLength(int[] ar, int n) {
		int min, max, ans = 1;
		for (int i = 0; i < n; i++) {
          HashSet<Integer> set = new HashSet<Integer>();
			min = max = ar[i];
			set.add(ar[i]);
			for (int j = i+1; j< n ; j++) {
				if (set.contains(ar[j]))
					break;
				else {
					set.add(ar[j]);
					min = Math.min(min, ar[j]);
					max = Math.max(max, ar[j]);
					if (max-min+1 == set.size())
						ans = Math.max( ans,set.size());
				}
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		LargestSubArray2 large = new LargestSubArray2();
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		int n = arr.length;
		System.out.println("Length of the longest contiguous subarray is "
				+ large.findLength(arr, n));
	}
}
