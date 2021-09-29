package aeroporto;

import aviao.Aviao;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2025;
		boeing777.cor = "Preto";
		boeing777.envergadura = 64.8;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();

		System.out.println("-------------------------------------------");
		Aviao cessna172 = new Aviao();
		cessna172.ano = 2023;
		cessna172.cor = "Vermelho";
		cessna172.envergadura = 47.8;
		cessna172.tremPouso = false;
		System.out.println("Avião: Cessna172");
		System.out.println("Ano: " + cessna172.ano);
		System.out.println("Cor: " + cessna172.cor);
		System.out.println("Envergadura: " + cessna172.envergadura);
		cessna172.ligar();
		cessna172.acelerar();
	
		if (cessna172.tremPouso == true) {
			cessna172.aterrizar();
		} else {
			System.out.println("Arremeter!!! Aterrizagem não autorizada !!!!!!!!!!");
		}
	}

}
