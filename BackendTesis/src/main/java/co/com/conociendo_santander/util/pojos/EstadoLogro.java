/**
 * 
 */
package co.com.conociendo_santander.util.pojos;

/**
 * @author gian
 *
 */
public enum EstadoLogro {

	Completado {

		@Override
		public String getNombre() {
			// TODO Auto-generated method stub
			return "COMPLETO";
		}

		@Override
		public int getId() {
			// TODO Auto-generated method stub
			return 2;
		}

	},
	Incompleto {

		@Override
		public String getNombre() {
			// TODO Auto-generated method stub
			return "INCOMPLETO";
		}

		@Override
		public int getId() {
			// TODO Auto-generated method stub
			return 1;
		}

	};

	public abstract String getNombre();

	public abstract int getId();

}
