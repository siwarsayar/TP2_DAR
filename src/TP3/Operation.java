package TP3;

import java.io.Serializable;

public class Operation implements Serializable{
	

	
	// Première valeur pour l&#39;opération
	int nb1;
	// Deuxième valeur pour l&#39;opération
	int nb2;
	// Opérateur pour l&#39;opération (par exemple, +, -, *, /)
	String op;
	public double getRes() {
	return res;
	}
	public void setRes(double res) {
	this.res = res;
	}
	// Résultat de l&#39;opération, initialisé à 0
	double res = 0;
	// Constructeur de la classe Operation pour initialiser les valeurs
	public Operation(int nb1, int nb2, String op) {
	// Affecte la première valeur

	this.nb1 = nb1;
	// Affecte la deuxième valeur
	this.nb2 = nb2;
	// Affecte l&#39;opérateur
	this.op = op;
	}
	public int getNb1() {
	return nb1;
	}
	public void setNb1(int nb1) {
	this.nb1 = nb1;
	}
	public int getNb2() {
	return nb2;
	}
	public void setNb2(int nb2) {
	this.nb2 = nb2;
	}
	public String getOp() {
	return op;
	}
	public void setOp(String op) {
	this.op = op; }
	}


