package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (verificaArray(array, leftIndex, rightIndex)) {
			for (int i = 1; i <= rightIndex; i++) {

				T key = array[i];
				int j = i;

				while ((j > leftIndex) && (array[j - 1].compareTo(key) > 0)) {
					array[j] = array[j - 1];
					j--;
				}
				array[j] = key;
			}
		}
	}

	private boolean verificaArray(T[] array, int leftIndex, int rightIndex) {
		boolean ehValido;
		if (array != null && leftIndex >= 0 && rightIndex < array.length && array.length != 0) {
			ehValido = true;
		} else {
			ehValido = false;
		}
		return ehValido;
	}
}
