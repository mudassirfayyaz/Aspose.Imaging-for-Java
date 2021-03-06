package com.aspose.imaging.examples.metafile;

import com.aspose.imaging.examples.Utils;

public class SpecifySubstituteFonts {
	public static void main(String... args) throws Exception {
		String dataDir = Utils.getSharedDataDir(SpecifySubstituteFonts.class) + "metafile/";

		String[] substituteFontName = { "font1", "font2" };
		com.aspose.imaging.FontSettings.addFontSubstitutes("originalFontName", substituteFontName);
	}

}
