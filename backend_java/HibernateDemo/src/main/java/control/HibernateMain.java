package control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Player;

public class HibernateMain {
	public static void main(String[] args) {
		try {

			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.Player.class);
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(builder.build());
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
//			Player p1= new Player(10,"Amit");
//			Player p2=new Player(30,"Ravi");
//			session.save(p1);
//			session.save(p2);
//			Player p = session.get(Player.class, 30);
//			System.out.println(p);
//			p.setPlayerName("Raaj");
//			session.delete(p);
			Player p1 = new Player("Uday");
			Player p2 = new Player("Rajesh");
			session.save(p1);
			session.save(p2);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
