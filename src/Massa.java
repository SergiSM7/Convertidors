public class Massa {
    private double kg;

    public Massa(double kg) {
	this.kg = kg;
    }

    public void setKg(double kg) {
	this.kg = kg;
    }

    public double getKg() {
	return this.kg;
    }

    public void setMGrams(double mg) {
	this.kg = mg / 1000000;
    }

    public double getMGrams() {
	return this.kg * 1000000;
    }

    public void setGrams(double gm) {
	this.kg = gm / 1000;
    }

    public double getGrams() {
	return this.kg * 0.001;
    }

    public void setPolzada(double ozRebudes) {
	this.kg = ozRebudes * 0.0283495;
    }

    public double getPolzada() {
	return this.kg * 35.274;
    }

    public void setLb(double lliuraRebuda) {
	this.kg = lliuraRebuda * 0.453592;
    }

    public double getLb() {
	return this.kg * 2.20462;
    }

    public void setTona(double tonaRebuda) {
	this.kg = tonaRebuda * 0.001;
    }

    public double getTona() {
	return this.kg * 1000;
    }
}