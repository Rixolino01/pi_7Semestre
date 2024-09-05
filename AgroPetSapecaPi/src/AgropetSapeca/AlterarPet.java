package AgropetSapeca;

public class AlterarPet {

	public static void main(String[] args) {
		PetDAo dao = new PetDAo();
		
		Pet p = new Pet();
		p.setId_pet("001");
		p.setNomePet("Caramelo");
		p.setDataNascimentoPet("15/05/2022");
		p.setPorte("Grande");
		p.setSexo("Macho");
		p.setTipo("Cachorro");		
		
		System.out.println(dao.alterar(p));

	}

}
