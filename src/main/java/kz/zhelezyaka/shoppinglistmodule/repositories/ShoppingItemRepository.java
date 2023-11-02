package kz.zhelezyaka.shoppinglistmodule.repositories;

import kz.zhelezyaka.shoppinglistmodule.entityes.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
}
