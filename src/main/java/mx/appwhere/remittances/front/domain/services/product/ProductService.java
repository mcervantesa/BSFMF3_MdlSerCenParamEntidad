package mx.appwhere.remittances.front.domain.services.product;

import mx.appwhere.remittances.front.domain.entities.product.Product;

import java.util.List;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/04
 */
public interface ProductService {
    /**
     * Returns all instances of the entity.
     *
     * @return all entities
     */
    List<Product> getAll();

    /**
     * Gets the entity with the indicated identifier.
     *
     * @param id entity identifier
     * @return the entity with the indicated id
     */
    Product getById(Long id);

    /**
     * Save the given entity.
     *
     * @param domainEntity entity
     * @return the saved entity
     */
    Product save(Product domainEntity);

    /**
     * Update the given entity.
     *
     * @param domainEntity entity
     * @return the saved entity
     */
    Product update(Product domainEntity);

    /**
     * Deletes the entity with the indicated identifier.
     *
     * @param id entity identifier
     */
    void deleteById(Long id);
}
