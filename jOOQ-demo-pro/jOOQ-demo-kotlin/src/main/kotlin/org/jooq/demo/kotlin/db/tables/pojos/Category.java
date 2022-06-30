/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long categoryId;
    private String name;
    private LocalDateTime lastUpdate;

    public Category() {}

    public Category(Category value) {
        this.categoryId = value.categoryId;
        this.name = value.name;
        this.lastUpdate = value.lastUpdate;
    }

    public Category(
        Long categoryId,
        String name,
        LocalDateTime lastUpdate
    ) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>public.category.category_id</code>.
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>public.category.category_id</code>.
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Getter for <code>public.category.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.category.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>public.category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>public.category.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}