package jpamin;

import java.util.Calendar;
import java.util.List;

import javax.persistence.*;
import javax.persistence.criteria.*;

import model.*;

/**
 * Hello world!
 *
 */
public class JpaMin 
{
    EntityManager em; 
    EntityTransaction tx;
    public static void main( String[] args )
    {
        new JpaMin().run();
    }
    private void run() {
        runWrite();
    }
    
    private void runWrite() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        try {
System.out.println("Create");
	tx.begin();
	ExistingEntity ee = new ExistingEntity();
	em.persist(ee);
	tx.commit();
	
//	em.clear();

//	em.clear();
	em.clear();
	

//	d2.
	
/*	
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Child> cq = cb.createQuery(Child.class);
	Root<Child> cr = cq.from(Child.class);
	Join<Child, Parent> pj = cr.join(Child_.parent);
	Join<Child, ChildId> crIdOrderBy = cr.join(Child_.id);
	cq.where(cb.equal(pj.get(Parent_.id), 1));
	cq.orderBy(cb.asc(crIdOrderBy.get(ChildId_.orderBy)));
	List<Child> rl = em.createQuery(cq).getResultList();
	System.out.println(rl);

	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Parent2> cq = cb.createQuery(Parent2.class).distinct(true);
	Root<Parent2> pr = cq.from(Parent2.class);
	pr.fetch("children");
	List<Parent2> rl = em.createQuery(cq).getResultList();
	System.out.println(rl);
*/
/*
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Parent> cq = cb.createQuery(Parent.class).distinct(true);
	Root<Parent> pr = cq.from(Parent.class);
	pr.fetch("children");
	List<Parent> rl = em.createQuery(cq).getResultList();
	System.out.println(rl);
*/
	//	Child cFound2 = em.createQuery("select c from Child c where c.id = 1", Child.class).getSingleResult();
//	System.out.println(cFound2);
//	System.out.println(cFound2 + " " + cFound2.getParent());
//	System.out.println(ps + " " + ps.get(0).getChildren());
	//	projection with join fetch doesn't work.  
//	em.createQuery("select new dto.WrapperDto( a, a.bs ) from EntityA a where a.id = 1", WrapperDto.class).getResultList();
		
//	EntityA aFound = em.find(EntityA.class, 1L);
//	List<EntityB> bs = em.createQuery("select b from EntityB b where b.a = :a", EntityB.class).setParameter("a", aFound).getResultList();
	//  a possible solution
//		EntityA aFound = em.find(EntityA.class, 1L);
//		List<EntityB> bs = em.createQuery("select b from EntityB b where b.a = :a", EntityB.class)).setParameter("a", aFound).getResultList();
//	List<AccessLink> al2 = em.createQuery("select al from AccessLink al where al.recipient = NULL and (al.node = :node or al.node.parentnode = :node)", AccessLink.class).setParameter("node", node).getResultList();
//	List nodes = em.createQuery("SELECT distinct new jpamin.Dto(n.id, n.name, n.inbound, link.id) FROM Node n, AccessLink link WHERE ((link.node=n OR link.node.parentnode = n) AND n.name = 'something' AND link.recipient IS NULL)").getResultList();	

	//	Node node = em.createQuery("select n from Node n where n.name = 'something'", Node.class).getSingleResult();
//	List<AccessLink> al2 = em.createQuery("select al from AccessLink al where al.recipient = NULL and (al.node = :node or al.node.parentnode = :node)", AccessLink.class).setParameter("node", node).getResultList();
//	List nodes = em.createQuery("SELECT distinct new jpamin.Dto(n.id, n.name, n.inbound, link.id) FROM Node n, AccessLink link WHERE ((link.node=n OR link.node.parentnode = n) AND n.name = 'something' AND link.recipient IS NULL)").getResultList();	
	
//	al1.addAll(al2);
//	System.out.println(nodes);
	
	
	
/*	
	tx.begin();

	b = em.find(B.class, 1);
	em.remove(b);
	
	
	tx.commit();

*/
		    em.close();
        } finally {
            emf.close();
        }
    }
}

