package AgropetSapeca;

public class ExcluirPet {

	public static void main(String[] args) {
		PetDAo dao = new PetDAo();
		
		Pet p = new Pet();
		System.out.println(dao.excluir("001"));		

	}

}
