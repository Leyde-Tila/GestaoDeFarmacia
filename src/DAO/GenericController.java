package DAO;

import java.util.List;
import javax.persistence.*;
import javax.swing.JOptionPane;

public class GenericController {

    private final EntityManagerFactory fabrica;
    private boolean editou;

    public GenericController() {
        this.fabrica = Persistence.createEntityManagerFactory("aula");
    }

    // Método para executar operações com gerenciamento de transações
    private void executeInTransaction(EntityOperation operation) {
        System.out.println("Foi chamado sem boolean");
        EntityManager em = fabrica.createEntityManager();
        try {
            em.getTransaction().begin();
            operation.perform(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            // Adicionar logging apropriado aqui
            System.err.println("Erro ao executar operação: " + e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    private boolean executeInTransactionBoolean(EntityOperation operation) {
         System.out.println("Foi chamado com boolean");
        EntityManager em = fabrica.createEntityManager();
        try {
            em.getTransaction().begin();
            operation.perform(em);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            // Adicionar logging apropriado aqui
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    public void add(Object obj) {
        System.out.println("add");
        executeInTransaction(em -> em.persist(obj));
    }

    public boolean addBoolean(Object obj) { 
        System.out.println("addBoolean");
        return executeInTransactionBoolean(em -> em.persist(obj));
    }

    public List<?> listar(Class<?> classe) {
        EntityManager em = fabrica.createEntityManager();
        try {
            String consulta = "SELECT obj FROM " + classe.getSimpleName() + " obj";
            TypedQuery<?> query = em.createQuery(consulta, classe);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public <T> T buscaId(Class<T> classe, Object id) {
        EntityManager em = fabrica.createEntityManager();
        try {
            return em.find(classe, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public void removerLogico(Class<?> classe, Long id) {
        executeInTransaction(em -> {
            Object obj = em.find(classe, id);
            if (obj != null) {
                // Aqui você deve atualizar o atributo 'ativo' ou similar
                // Exemplo: ((SeuObjeto)obj).setAtivo(false);
                em.merge(obj); // Atualiza o objeto
            } else {
                System.out.println("ID inserido não existe.");
            }
        });
    }

    public void atualizarPorCodigo(Class<?> classe, String codigo, Object novosDados) {
        executeInTransaction(em -> {
            // Faz um select para buscar o objeto pelo código
            Object obj = em.createQuery("SELECT f FROM " + classe.getSimpleName() + " f WHERE f.codigo = :codigo")
                    .setParameter("codigo", codigo)
                    .getSingleResult();

            // Se o objeto foi encontrado, atualiza os dados
            if (obj != null) {
                em.merge(novosDados);  // Atualiza com os novos dados
            } else {
                System.out.println("Código inserido não existe.");
            }
        });

    }

    public void atualizarPorId(Class<?> classe, long id, Object novosDados) {
        executeInTransaction(em -> {
            // Faz um select para buscar o objeto pelo código
            Object obj = em.createQuery("SELECT f FROM " + classe.getSimpleName() + " f WHERE f.id = :id")
                    .setParameter("id", id)
                    .getSingleResult();

            // Se o objeto foi encontrado, atualiza os dados
            if (obj != null) {
                em.merge(novosDados);  // Atualiza com os novos dados
            } else {
                System.out.println("Id inserido não existe.");
            }
        });

    }

    public boolean atualizarPorIdBoolean(Class<?> classe, long id, Object novosDados) {
        editou = false;
        executeInTransactionBoolean(em -> {
            // Faz um select para buscar o objeto pelo código
            Object obj = em.createQuery("SELECT f FROM " + classe.getSimpleName() + " f WHERE f.id = :id")
                    .setParameter("id", id)
                    .getSingleResult();

            // Se o objeto foi encontrado, atualiza os dados
            if (obj != null) {
                em.merge(novosDados);  // Atualiza com os novos dados
                editou = true;
            } else {
                System.out.println("Id inserido não existe.");
            }
        });
        return editou;
    }

    public void removeFisico(Class<?> classe, Long id) {
        executeInTransaction(em -> {
            Object obj = em.find(classe, id);
            if (obj != null) {
                em.remove(obj);
            } else {
                System.out.println("ID inserido não existe.");
            }
        });
    }

    public <T> T buscarPorAtributoGenerico(Class<T> entityClass, String atributo, Object valor) {
        EntityManager em = fabrica.createEntityManager();
        try {
            String queryString = "SELECT e FROM " + entityClass.getSimpleName() + " e WHERE e." + atributo + " = :valor";
            TypedQuery<T> query = em.createQuery(queryString, entityClass);
            query.setParameter("valor", valor);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (NonUniqueResultException e) {
            System.err.println("Mais de um resultado encontrado: " + e.getMessage());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public void close() {
        if (fabrica != null && fabrica.isOpen()) {
            fabrica.close();
        }
    }

    // Interface funcional para operações com EntityManager
    @FunctionalInterface
    private interface EntityOperation {

        void perform(EntityManager em);
    }
}
