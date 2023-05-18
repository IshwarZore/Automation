// Java Program to implement
// the above approach
import java.io.*;
import java.util.*;

class GFG {
	public static class Bits {
		public static void main(String args[]) {
			int n = 5; //0101
			int pos = 2;
			int bitMask = 1<<pos;
			int newBitMask = ~(bitMask);
			int newNumber = newBitMask & n;
			System.out.println(newNumber);
		}
	}
	// Function to print the maximum difference
	// possible between the two halves of the array
	static Long FindMaxDif(List<Long> a, int m)
	{
		int n = m / 3;

		Long[] l = new Long[m + 5];
		Long[] r = new Long[m + 5];

		for(int i = 0; i < m+5; i++) {

			l[i] = r[i] = 0L;
		}

		// Stores n maximum values from the start
		List<Long> s = new ArrayList<Long>();

		for(int i = 1; i <= m; i++)
		{

			// Insert first n elements
			if (i <= n)
			{

				// Update sum of largest n
				// elements from left
				l[i] = a.get(i - 1) + l[i - 1];
				s.add(a.get(i - 1));
			}

			// For the remaining elements
			else
			{
				l[i] = l[i - 1];

				Collections.sort(s);

				// Obtain minimum value
				// in the set
				Long d = s.get(0);

				// Insert only if it is greater
				// than minimum value
				if (a.get(i - 1) > d)
				{
					// Update sum from left
					l[i] -= d;
					l[i] += a.get(i - 1);
					// Remove the minimum
					s.remove(d);
					// Insert the current element
					s.add(a.get(i - 1));
				}
			}
		}
		// Clear the set
		s.clear();

		// Store n minimum elements from the end
		for(int i = m; i >= 1; i--)
		{

			// Insert the last n elements
			if (i >= m - n + 1)
			{

				// Update sum of smallest n
				// elements from right
				r[i] = a.get(i - 1) + r[i + 1];
				s.add(a.get(i - 1));
			}

			// For the remaining elements
			else
			{
				r[i] = r[i + 1];

				Collections.sort(s);

				// Obtain the minimum
				Long d = s.get(s.size() - 1);

				// Insert only if it is smaller
				// than maximum value
				if (a.get(i - 1) < d)
				{

					// Update sum from right
					r[i] -= d;
					r[i] += a.get(i - 1);

					// Remove the minimum
					s.remove(d);

					// Insert the new element
					s.add(a.get(i - 1));
				}
			}
		}

		Long ans = Long.MIN_VALUE;

		for(int i = n; i <= m - n; i++)
		{

			// Compare the difference and
			// store the maximum
			ans = Math.max(ans, l[i] - r[i + 1]);
		}

		// Return the maximum
		// possible difference
		return ans;
	}

	// Driver Code
	public static void main (String[] args) {

		List<Long> vtr = new ArrayList<Long>(
				Arrays.asList(3L, 1L, 4L, 1L, 5L, 9L));
		int n = vtr.size();

		System.out.println(FindMaxDif(vtr, n));
	}
}
