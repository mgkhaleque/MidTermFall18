package math.problems;

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		ArrayList<Long> ar = new ArrayList<>();
		long k = 0;
		for (long i = 2; i < 1000000; i++) {
		if (i == 2) {
		System.out.println(i);
		k++;
		ar.add(i);

		} else {
		if (isPrime(i)) {
		k++;
		System.out.println(i);
		ar.add(i);
		}
		}

		}
		System.out.println(" Total Number Of Prime Numbers: " + k);
		System.out.println(ar);

		List list = new ArrayList();
		list = ar;

        public static boolean isPrime(long n) {

		if (n % 2 == 0) return false;
		for (int i = 3; i * i <= n; i += 2) {

		if (n % i == 0) return false;
		}

		return true;

		}


	}

}
