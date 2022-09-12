package study.team2.inheritExample;

public class Won2Dollar extends Converter{
	
	//Constructor
	public Won2Dollar(double ratio) {
		this.ratio = ratio;		
	}
	

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원화";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}

}
