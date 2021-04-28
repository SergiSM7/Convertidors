/**
 * @author sergi
 *
 */
public class Longitud {
    private double metre;

    public Longitud(double metre) {
	this.metre = metre;
    }

    public void setM(double metre) {
	this.metre = metre;
    }

    public double getM() {
	return this.metre;
    }

    public void setKm(double km) {
	this.metre = km * 1000;
    }

    public double getKm() {
	return this.metre / 1000;
    }

    public void setMM(double cm) {
	this.metre = cm / 1000;
    }

    public double getMM() {
	return this.metre * 1000;
    }

    public void setPolzada(double polzadesRebudes) {
	this.metre = polzadesRebudes * 0.0254;
    }

    public double getPolzada() {
	return this.metre * 39.3701;
    }

    public void setPeu(double peuRebut) {
	this.metre = peuRebut * 0.3048;
    }

    public double getPeu() {
	return this.metre * 3.28084;
    }

    public void setIarda(double iardaRebuda) {
	this.metre = iardaRebuda * 0.9144;
    }

    public double getIarda() {
	return this.metre * 1.09361;
    }

    public void setMilla(double millaRebuda) {
	this.metre = millaRebuda * 0.000621371;
    }

    public double getMilla() {
	return this.metre * 1609.34;
    }

    public void setLlegua(double lleguaRebuda) {
	this.metre = lleguaRebuda * 0.000207124;
    }

    public double getLlegua() {
	return this.metre * 4828.03;
    }
}