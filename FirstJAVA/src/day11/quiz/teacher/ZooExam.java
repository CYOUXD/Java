package day11.quiz.teacher;

public class ZooExam {
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);
		zk.feed(lion);
	}
}
