package jhalmuri.imranrana.banglarenderer;
/**
* BanglaRenderer class contains a static function named convert 
* which pre-process a text for rendering
* @author  Sk. Imran Hossain
* @version 1.0
*/
public class BanglaRenderer {
	static String jukto[] = { "া", "ু", "ূ", "ৃ", "ী", "ৗ", "ে", "ৈ", "ো", "ৌ",
			"ি", "স্প্র", "দ্ভ্র", "ক্ট্র", "ণ্ড্র", "ন্ড্র", "ক্ষ্ণ", "ম্প্র",
			"চ্ছ্র", "খ্রু", "ন্ট্র", "স্ট্র", "ল্ট্র", "ম্ভ্র", "দ্দ্ব",
			"ষ্প্র", "ষ্ট্র", "ক্ষ্ম", "চ্র", "ছ্র", "জ্র", "ট্র", "ঠ্র",
			"ড্র", "ঢ্র", "ন্র", "ফ্র", "প্র", "ব্র", "ভ্র", "য্র", "ষ্র",
			"হ্র", "চ্ছ্ব", "ণ্ড", "ন্ত্র", "ছ্ব", "ট্ব", "ম্ব্র", "হৃ",
			"শ্রূ", "শ্রু", "শু", "ল্গু", "রূ", "রু", "ভ্রূ", "ভ্রু", "দ্রু",
			"ত্রু", "ত্রূ", "গ্রূ", "গ্রু", "গু", "স্ক্র", "ষ্ক্র", "ক্র",
			"ত্র", "ক্ট", "ক্স", "শ্ব", "শ্ন", "শ্ত", "ষ্ক", "ষ্প", "ষ্ঠ",
			"ষ্ট", "স্খ", "স্ট", "ত্ম", "ত্ন", "ত্ত্ব", "ট্ট", "স্ত্ব",
			"ন্দ্ব", "ন্ড", "ন্স", "ণ্ট", "ণ্ঠ", "ণ্ন", "ল্ড", "ল্গ", "প্ট",
			"প্প", "প্স", "স্ফ", "স্ম", "স্ন", "স্ক", "স্প", "স্ত", "দ্ব",
			"দ্ধ", "ফ্ল", "জ্ঞ", "গ্ধ", "গ্ব", "হ্ন", "হ্ণ", "জ্জ্ব", "জ্জ",
			"ঙ্ক্ষ", "ক্ষ্ম", "ক্ত", "ল্ক", "ল্প", "ধ্ব", "ড্ড", "ঙ্গ", "ক্ষ",
			"চ্চ", "ভ্ল", "ব্ব", "ব্দ", "ন্ন", "ন্থ", "ন্ত্ব", "ম্ম", "ম্প",
			"ম্ভ", "ম্ব", "ক্ল", "শ্চ", "শ্ছ", "শ্ম", "ষ্ণ", "ষ্ম", "ত্ত",
			"ত্থ", "থ্ব", "ন্ত", "ণ্ব", "ন্ব", "ঞ্চ", "ঞ্ছ", "ঞ্জ", "ল্ম",
			"ল্ব", "প্ন", "প্ট", "স্ল", "ম্ল", "স্থ", "স্ব", "দ্দ", "দ্ম",
			"ঘ্ন", "গ্ম", "গ্ন", "হ্ব", "হ্ম", "জ্ব", "ক্ক", "ক্ম", "ক্ব",
			"ল্ল", "ল্ট", "দ্ভ", "ঙ্ক", "ঙ্ঘ", "চ্ছ", "ব্ধ", "ব্জ", "ন্দ",
			"ন্ধ", "ন্ট", "ম্ন", "ম্ফ", "ত্ব", "্য", "র্", "্র", "ন্ম", "স্ত্র" };

	static String juktor[] = { "\uad14", "\uad15", "\uad16", "\uad17",
			"\uad19", "\uad1a", "\uad0a", "\uad0b", "\uad0e", "\uad10",
			"\uad12", "\uad09", "\uace9", "\uad08", "\uace6", "\uaceb",
			"\uacf7", "\uacf8", "\uacf9", "\uacfa", "\uacfb", "\uacfe",
			"\uacff", "\uad01", "\uad02", "\uad03", "\uad05", "\uad07",
			"\uaccf", "\uacd0", "\uacd1", "\uacd2", "\uacd3", "\uacd4",
			"\uacd6", "\uacd8", "\uacd9", "\uacda", "\uacdb", "\uacdc",
			"\uacdd", "\uacde", "\uacdf", "\uace3", "\uace5", "\uaced",
			"\uacee", "\uacf2", "\uacf4", "\uacb4", "\uacb5", "\uacb6",
			"\uacb7", "\uacba", "\uacbe", "\uacbf", "\uacc0", "\uacc2",
			"\uacc3", "\uacc5", "\uacc6", "\uacc7", "\uacc9", "\uacca",
			"\uaccb", "\uaccd", "\uacce", "\uacB3", "\uac02", "\uac03",
			"\uac05", "\uac06", "\uac0B", "\uac0C", "\uac0D", "\uac0E",
			"\uac0F", "\uac18", "\uac1E", "\uac1F", "\uac21", "\uac22",
			"\uac23", "\uac25", "\uac26", "\uac27", "\uac28", "\uac29",
			"\uac2A", "\uac2B", "\uac2E", "\uac32", "\uac33", "\uac34",
			"\uac35", "\uac36", "\uac37", "\uac3A", "\uac3B", "\uac3D",
			"\uac3E", "\uac3F", "\uac41", "\uac42", "\uac43", "\uac44",
			"\uac45", "\uac46", "\uac47", "\uac48", "\uac49", "\uac4A",
			"\uac4C", "\uac4E", "\uac4F", "\uac50", "\uac51", "\uac52",
			"\uac53", "\uac55", "\uac56", "\uac57", "\uac59", "\uac5A",
			"\uac5B", "\uac5D", "\uac5E", "\uac5F", "\uac60", "\uac61",
			"\uac62", "\uac63", "\uac64", "\uac65", "\uac66", "\uac67",
			"\uac68", "\uac69", "\uac6A", "\uac6B", "\uac6C", "\uac6D",
			"\uac6E", "\uac6F", "\uac72", "\uac73", "\uac75", "\uac76",
			"\uac79", "\uac7B", "\uac7C", "\uac7D", "\uac7E", "\uac7F",
			"\uac82", "\uac87", "\uac88", "\uac8D", "\uac8E", "\uac8F",
			"\uac91", "\uac92", "\uac93", "\uac95", "\uac96", "\uac97",
			"\uac98", "\uac99", "\uac9A", "\uac9B", "\uac9E", "\uacA2",
			"\uacA3", "\uacA4", "\uacA5", "\uacA6", "\uacA7", "\uacAB",
			"\uacAD", "\uacAE", "\uacB1", "\uacB2", "\uad1b", "\uad1D" };

	/**
	   * Converts a text (Mixture of English an Bangla) for Bangla Rendering.
	   * @param txt -> text to convert.
	   * @return converted String.
	   */
	public static String convert(String txt) {
		StringBuilder sb = new StringBuilder(txt);
		// jukto -> single char replacement
		for (int j = 0; j < jukto.length; j++) {
			sb = chng(txt, jukto[j], juktor[j]);
			txt = sb.toString();
		}

		// bringing all ে , ৈ to front
		sb = shifting(txt, "\uacB1"); // ref
		txt = sb.toString();
		sb = shifting(txt, "\uad0a");
		txt = sb.toString();
		sb = shifting(txt, "\uad12");
		txt = sb.toString();
		sb = shifting(txt, "\uad0b");
		txt = sb.toString();

		// ("se","am here aft txt2="+txt);

		// bringing all ে , ৈ to front

		// balancing ো , ৌ
		sb = shiftingn(txt, "\uad0e");
		txt = sb.toString();
		sb = shiftingn(txt, "\uad10");
		txt = sb.toString();
		return txt;
	}

	// jukto -> single char replacement

	public static StringBuilder chng(String txt, String ch, String nch) {
		// ("se","chng here aft txt="+txt+" ch="+ch+" nch="+nch);
		StringBuilder sx = new StringBuilder();
		sx.append(txt);
		int ofe = sx.indexOf(ch, 0);

		// ("pe","am here of ofe1 ="+ofe+"sx ="+sx);
		for (int ofs = 0; ofs < txt.length() && ofe != -1; ofs = ofe + 1) {

			ofe = sx.indexOf(ch, ofs);
			if (ofe == -1)
				break;
			// ("pe","am here of ofe2 ="+ofe+"sx ="+sx);
			sx.replace(ofe, ofe + ch.length(), nch);

		}
		return sx;
	}

	// jukto -> single char replacement

	// e_kar replacing
	public static StringBuilder shifting(String txt, String ch) {
		StringBuilder sx = new StringBuilder();

		sx.append(txt);

		int ofe = sx.indexOf(ch, 0);
		for (int ofs = 0; ofs < txt.length() && ofe != -1; ofs = ofe + 1) {

			ofe = sx.indexOf(ch, ofs);

			if (ofe != -1) {
				if (ch == "\uacB1") {
					if (ofe != txt.length() - 1) {
						if (("" + txt.charAt(ofe + 1)).compareTo(" ") != 0) {
							sx.replace(ofe, ofe + 2, sx.charAt(ofe + 1) + ch);
						}
					}
					ofe = ofe + 1;
				}

				else {
					if (ofe == 0) {
						;
						// } else if (sptype.contains("" + sx.charAt(ofe - 1)))
						// {
						// ;
					} else if (sx.charAt(ofe - 1) == '\uacAE'
							|| sx.charAt(ofe - 1) == '\uacB1'
							|| sx.charAt(ofe - 1) == '\uacB2') {
						sx.replace(
								ofe - 2,
								ofe + 1,
								"" + ch + sx.charAt(ofe - 2)
										+ sx.charAt(ofe - 1));
						txt = sx.toString();
					}

					else
						sx.replace(ofe - 1, ofe + 1, ch + sx.charAt(ofe - 1));
				}
			} else
				break;

		}
		// ("re","replaced return sx = "+sx);
		return sx;
	}

	// e_replacing

	// o_kar replacing
	public static StringBuilder shiftingn(String txt, String ch) {
		String chn = "";
		if (ch == "\uad0e") {
			chn = "\uad0a" + "\uad14";
		} else if (ch == "\uad10") {
			chn = "\uad0a" + "\uad1a";
		}
		StringBuilder sx = new StringBuilder();
		sx.append(txt);
		int ofe = sx.indexOf(ch, 0);
		for (int ofs = 0; ofs < txt.length() && ofe != -1; ofs = ofe + 1) {

			ofe = sx.indexOf(ch, ofs);

			if (ofe != -1) {
				if (ofe == 0) {
					sx.replace(ofe, ofe + 1,
							"" + chn.charAt(0) + "" + chn.charAt(1));
					;
				} // else if (sptype.contains("" + sx.charAt(ofe - 1))) {
					// sx.replace(ofe, ofe + 1,
					// "" + chn.charAt(0) + "" + chn.charAt(1));
					// }
				else if (sx.charAt(ofe - 1) == '\uacAE'
						|| sx.charAt(ofe - 1) == '\uacB1'
						|| sx.charAt(ofe - 1) == '\uacB2') {
					sx.replace(
							ofe - 2,
							ofe + 1,
							"" + chn.charAt(0) + sx.charAt(ofe - 2)
									+ sx.charAt(ofe - 1) + chn.charAt(1));
					txt = sx.toString();
				}

				else {
					sx.replace(
							ofe - 1,
							ofe + 1,
							"" + chn.charAt(0) + sx.charAt(ofe - 1)
									+ chn.charAt(1));
					txt = sx.toString();
				}

			} else
				break;

		}
		return sx;
	}

}