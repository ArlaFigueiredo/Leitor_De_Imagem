import java.sql.SQLException;
import java.util.Collection;

import sistema.model.CaptadorDeImagens;
import sistema.model.MapaRGB;
import sistema.model.entity.Cor;
import sistema.model.entity.CorRGB;
import sistema.model.entity.Simbolo;
import sistema.persistencia.CorDAOSQL;

public class teste {

	public static void main(String[] args) {
		
		CaptadorDeImagens captador = new CaptadorDeImagens();
		try {
			CorDAOSQL gerenciadorDeCores = new CorDAOSQL();
			Collection<Cor> coresFloresta = gerenciadorDeCores.findBySimbolo(new Simbolo(1, "FLORESTA"));
			MapaRGB mapa1 = new MapaRGB("SSA","Salvador",captador.captaSalvador());
			Collection<String> resultado = mapa1.getPercentualPixelsEquivalentes(coresFloresta);
			for(String s : resultado)
				System.out.println(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
