
public class main {
	public static void main(String[] args) {
		
		// 아래 구문은 PlayerLevel pLevel; pLevel = new BeginnerLevel(); 와 같다. 왜 같은지 생각 해볼 것
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
