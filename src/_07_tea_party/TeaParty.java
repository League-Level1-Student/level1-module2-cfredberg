package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman) {
			return "Hello Ms. " + name;
		}else if (isKnighted) {
			return "Hello Sir " + name;
		}else {
			return "Hello Mr. " + name;
		}
    }
}
