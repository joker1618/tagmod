package xxx.joker.apps.tagmod.console.args;

import xxx.joker.libs.argsparser.design.annotation.OptName;
import xxx.joker.libs.argsparser.design.classType.OptionName;

public enum TmcArgType implements OptionName {

	@OptName
	SHOW("show"),
	@OptName
	DESCRIBE("describe"),
	@OptName
	DIFF("diff"),
	@OptName
	INFO("info"),
	@OptName
	CONFIG("config"),
	@OptName
	EXPORT("export"),
	@OptName
	EDIT("edit"),
	@OptName
	TEST("test"),

	@OptName
	PIC_TYPE("picType"),
	@OptName
	GENRE("genre"),
	@OptName
	LYRICS("lyrics"),
	@OptName
	COVER("cover"),
	@OptName
	PICTURES("pics"),

	@OptName
	TITLE("title"),
	@OptName
	ARTIST("artist"),
	@OptName
	ALBUM("album"),
	@OptName
	YEAR("year"),
	@OptName
	TRACK("track"),
	@OptName
	CD_POS("cdPos"),

//	@OptName
//	ALL("-all"),
//
	@OptName
	CLEAR("clear"),

	@OptName
	OUTPUT_FORMATS("outputFormats"),

	@OptName
	ENCODING("enc"),
	@OptName
	VERSION("ver"),
	@OptName
	UNSYNCHRONIZED("unsync"),
	@OptName
	PADDING("padding"),
	@OptName
	SIGN("sign"),
	@OptName
	NO_SIGN("noSign"),

	@OptName
	FILES("files"),
	@OptName
	HELP("help")

	;

	private String optionName;

	TmcArgType(String optionName) {
		this.optionName = optionName;
	}

	@Override
	public String optName() {
		return optionName;
	}
}
