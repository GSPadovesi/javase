package mundo;

public class Bloco {

	public Bloco() {
		String boavinda = new String("Bem vindo ao nosso mundo de minecraft "
				+ "        .__                                   _____  __   \r\n"
				+ "  _____ |__| ____   ____   ________________ _/ ____\\/  |_ \r\n"
				+ " /     \\|  |/    \\_/ __ \\_/ ___\\_  __ \\__  \\\\   __\\\\   __\\\r\n"
				+ "|  Y Y  \\  |   |  \\  ___/\\  \\___|  | \\// __ \\|  |   |  |  \r\n"
				+ "|__|_|  /__|___|  /\\___  >\\___  >__|  (____  /__|   |__|  \r\n"
				+ "      \\/        \\/     \\/     \\/           \\/             ");
		System.out.println(boavinda);
	}

	int resistencia;
	public String textura;

	public void construir() {
		System.out.println("Colocando os blocos");
	}

	public void mineirar() {
		System.out.println("Coletando a materia prima");
	}

	public void craftar() {
		System.out.println("Construindo um equipamento");
	}

	public static void main(String[] args) {

	}
}
