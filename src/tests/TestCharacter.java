package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import characters.Character;

public class TestCharacter {

    public static Character c;

    @BeforeEach
    void beforeEach() {
		c = new Character("Merida");
    }

    @Test
    void testMove() {
		// Prep
		PrintStream originalOut = System.out;     // save to restore later
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream newOut = new PrintStream(baos);
		System.setOut(newOut);
		
		// Test: method writes to System.out which has been redirected
		c.move();

		// Check results
		System.out.flush();
		String actualOutput = baos.toString();
		String expectedOutput = "Merida walked forward 1 step\n";
		assertEquals(expectedOutput, actualOutput);

		// Cleanup
		System.setOut(originalOut);
    }

    @Test
    public void testAttack() {
		// Prep
		PrintStream originalOut = System.out;     // save to restore later
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream newOut = new PrintStream(baos);
		System.setOut(newOut);

		// Test: method writes to System.out which has been redirected
		c.attack();

		// Check results
		System.out.flush();
		String actualOutput = baos.toString();
		String expectedOutput = "Merida attacked for 10 damage\n";
		assertEquals(expectedOutput, actualOutput);

		// Cleanup
		System.setOut(originalOut);
    }
}