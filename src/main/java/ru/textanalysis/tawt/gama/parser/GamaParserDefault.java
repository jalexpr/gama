package ru.textanalysis.tawt.gama.parser;

import ru.textanalysis.tawt.graphematic.parser.text.GParserImpl;
import ru.textanalysis.tawt.graphematic.parser.text.GraphematicParser;

import java.util.List;

public class GamaParserDefault implements GamaParser {

	private GraphematicParser parser;

	@Override
	public void init() {
		parser = new GParserImpl();
	}

	@Override
	public List<String> getParserBearingPhrase(String bearingPhrase) {
		return parser.parserBasicsPhase(bearingPhrase.toLowerCase());
	}

	@Override
	public List<List<String>> getParserSentence(String sentence) {
		return parser.parserSentence(sentence.toLowerCase());
	}

	@Override
	public List<List<List<String>>> getParserParagraph(String sentence) {
		return parser.parserParagraph(sentence.toLowerCase());
	}

	@Override
	public List<List<List<List<String>>>> getParserText(String text) {
		return parser.parserText(text.toLowerCase());
	}
}
