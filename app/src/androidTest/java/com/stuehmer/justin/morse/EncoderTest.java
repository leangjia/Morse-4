package com.stuehmer.justin.morse;

import com.stuehmer.justin.morse.models.Encoder;
import com.stuehmer.justin.morse.models.Message;

import junit.framework.TestCase;

public class EncoderTest extends TestCase {

	private Encoder encoder;
	private Message message1;
	private Message message2;

	public EncoderTest() {
		super();
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		encoder = new Encoder();
		message1 = new Message("SOS");
		message2 = new Message("s oS");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEncodeMessage() {
		encoder.encode(message1);
		assertEquals(encoder.getCode(), "101010001110111011100010101000");

		encoder.encode(message2);
		assertEquals(encoder.getCode(), "1010100000001110111011100010101000");
	}

}
