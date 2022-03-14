package Time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	//testGetTotalSeconds - Good/Boundary and Bad
			@ParameterizedTest
			@ValueSource(strings = { "00:00:59" })
			void testGetTotalSeconds(String candidate) {
				int seconds = Time.getTotalSeconds(candidate);
				assertTrue("The seconds were not calculated properly", seconds==59);
			}
			
			@Test
			public void testGetTotalSecondsBad() {
			assertThrows(StringIndexOutOfBoundsException.class,()-> {Time.getTotalSeconds("10:00");});
			}
			
			//testGetTotalMinutes - Good/Boundary and Bad
			@ParameterizedTest
			@ValueSource(strings = { "00:59:15", "05:59:59"})
			void testGetTotalMinutes(String candidate) {
			int minutes= Time.getTotalMinutes(candidate);
			assertTrue("The minutes were not calculated properly", minutes==59);
			}
			
			@Test
			public void testGetTotalMinutesBad() {
			assertThrows(NumberFormatException.class,()-> {Time.getTotalMinutes("100:00");});
			}
			
			
			//testGetTotalHours - Good/Boundary and Bad
			@ParameterizedTest 
			@ValueSource(strings = { "09:00:00", "09:15:15", "09:59:59"})
			void testGetTotalHours(String candidate) {
			int hours= Time.getTotalHours(candidate);
			assertTrue("The hours were not calculated properly", hours==9);
			}
			
			@Test
			public void testGetTotalHoursBad() {
				assertThrows(NumberFormatException.class,()-> {Time.getTotalHours("6:09:00");});
			}
			
			
			//testGetSeconds - Good/Boundary and Bad
			@ParameterizedTest
			@ValueSource(strings = { "00:00:59"})
			void testGetSeconds(String candidate) {
			int seconds= Time.getSeconds(candidate);
			assertTrue("The seconds were not calculated properly", seconds==59);
			}
			
			@Test
			public void testGetSecondsBad() {
				assertThrows(StringIndexOutOfBoundsException.class,()-> {Time.getSeconds("02");});
			}
			
			
		
		/**Default test cases
		@Test
		void testGetTotalSeconds() {
			fail("Not yet implemented");
		}

		@Test
		void testGetSecondsBad() {

			fail("Not yet implemented");
		}

		@Test
		void testGetTotalMinutesBoundary() {
			fail("Not yet implemented");
		}

		@Test
		void testGetTotalHoursGood() {
			fail("Not yet implemented");
		}*/
		
		/**In-class examples
		@Test
		public void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds==18305);
		}

		@Test
		public void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class,()-> {Time.getTotalSeconds("10:00");});
		}
		
		@ParameterizedTest
		@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59"})
		void testGetTotalHours(String candidate) {
		int hours= Time.getTotalHours(candidate);
		assertTrue("The hours were not calculated properly", hours==5);
		}
		*/
		

}
