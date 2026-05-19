package util;

public class TestConnection {
	public static void main(String[] args) {
		try {
			ConnectionDB conn = new ConnectionDB();

			conn.connect();
			System.out.println("Sucesso!");
		} catch (Exception e) {
			System.err.println("Erro:" + e.getMessage());
			// TODO: handle exception
		}
	}
}
