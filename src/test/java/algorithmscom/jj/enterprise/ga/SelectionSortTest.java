package algorithmscom.jj.enterprise.ga;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link SelectionSort}
 * 
 * @author JJ
 */
public class SelectionSortTest {
	
	@Test
	public void canary() {
		assertThat(SelectionSort.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenInputArrayToSortIsNull_ThenIllegalArgumentExceptionIsThrown() {
		try {
			SelectionSort.getInstance().sort(null);
			Assert.fail("Should have thrown an Exception!");
		}
		catch(Exception ex) {
		}
	}
	
	@Test
	public void givenInputArrayToSortIsEmpty_ThenIllegalArgumentExceptionIsThrown() {
		try {
			SelectionSort.getInstance().sort(new Integer[]{});
			Assert.fail("Should have thrown an Exception!");
		}
		catch(Exception ex) {
		}
	}
	
	@Test
	public void givenAnUnsortedInputArray_ThenTheOutputArrayIsSorted() {
		// Setup the test input(s)
		Integer[] array = {1, 99, 88, 104, 23, 54, 17};
		
		// Execute the code
		SelectionSort.getInstance().sort(array);
		
		// Verify the test result(s)
		assertThat(array[0], is(1));
		assertThat(array[1], is(17));
		assertThat(array[2], is(23));
		assertThat(array[3], is(54));
		assertThat(array[4], is(88));
		assertThat(array[5], is(99));
		assertThat(array[6], is(104));
	}

}
