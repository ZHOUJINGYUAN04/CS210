/**
 * An abstract data type (ADT) representing a resizable, ordered sequence of elements.
 *
 * <p>A ListADT stores elements in a linear order and allows access, insertion,
 * and removal of elements by position (index). Indices are zero-based.</p>
 *
 * <p>Assumptions about creation:
 * Implementations are assumed to create an empty list upon construction.
 * The initial list contains no elements (size = 0).
 * No assumptions are made about the underlying representation
 * (e.g., array-based or linked structure).</p>
 *
 * @param <T> the type of elements stored in the list
 */
public interface ListADT<T> {

    /**
     * Returns the number of elements currently in the list.
     *
     * @return the size of the list
     */
    int size();

    /**
     * Returns true if the list contains no elements.
     *
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the element at the specified position in the list.
     *
     * @param index the position of the element to return
     * @return the element at the given index
     * @throws IndexOutOfBoundsException if index < 0 or index >= size()
     */
    T get(int index);

    /**
     * Replaces the element at the specified position with the given element.
     *
     * @param index the position of the element to replace
     * @param element the new element to store at the given position
     * @throws IndexOutOfBoundsException if index < 0 or index >= size()
     */
    void set(int index, T element);

    /**
     * Inserts an element at the specified position in the list.
     * Elements at and after this position are shifted one position to the right.
     *
     * @param index the position at which to insert the element
     * @param element the element to insert
     * @throws IndexOutOfBoundsException if index < 0 or index > size()
     */
    void add(int index, T element);

    /**
     * Removes and returns the element at the specified position in the list.
     * Elements after this position are shifted one position to the left.
     *
     * @param index the position of the element to remove
     * @return the element that was removed
     * @throws IndexOutOfBoundsException if index < 0 or index >= size()
     */
    T remove(int index);
}
