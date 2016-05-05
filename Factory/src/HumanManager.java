public class HumanManager implements Manager, Eater {

    @Override
    public void manage(HumanWorker human) {
        human.work();
        human.stopWorking();
        human.eat();
        human.work();
        human.stopWorking();
    }

	@Override
	public void eat() {
		System.out.println("HumanWorker.eating");
		
	}
}