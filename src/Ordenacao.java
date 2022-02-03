public class Ordenacao {

	public int[] SelectionSort(int v[]) {

		int menor, index;

		for (int i = 0; i < v.length; i++) {
			menor = v[i];
			index = i;
			for (int j = i + 1; j < v.length; j++) {

				if (menor > v[j]) {
					menor = v[j];
					index = j;
				}
			}

			v[index] = v[i];
			v[i] = menor;

		}
		return v;
	}
}
