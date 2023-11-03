package kz.zhelezyaka.shoppinglistmodule.repositories;

import kz.zhelezyaka.shoppinglistmodule.entityes.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
    List<ShoppingItem> findByUserUsername(String username);
}
