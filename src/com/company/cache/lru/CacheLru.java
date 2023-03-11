package com.company.cache.lru;

import java.util.HashMap;
import java.util.Map;

public class CacheLru {

    int capacity;
    int size;
    HashMap<Object, DoublyLinkedListNode> cache;
    DoublyLinkedList cache_vals;

    /**
     * Конструктор
     * @param capacity
     */
    public CacheLru(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Object, DoublyLinkedListNode>(3);
        this.cache_vals = new DoublyLinkedList();
        size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public HashMap<Object, DoublyLinkedListNode> getCache() {
        return cache;
    }

    public DoublyLinkedList getCache_vals() {
        return cache_vals;
    }

    /**
     * Ищем элемент
     * @param key
     * @return
     */
    DoublyLinkedListNode get(Object key) {
        //Если не существует в HashMap
        if(!cache.containsKey(key)) {
            return null;
        } else {
            // создаём элемент для обхода списка(текущий)
            DoublyLinkedListNode current = cache_vals.getHead();
            while(current != null) {
                // если текущий равен ключу
                if(current.key.equals(key)) {
                    break;
                }
                // передвигаем элемент к следующему
                current = current.next;
            }

            // создаём элемент для поиска
            DoublyLinkedListNode find = current;
            // если find.next != null
            if(find.next != null) {
                DoublyLinkedListNode prev = null;
                DoublyLinkedListNode next = null;
                // если предыдущий искомого == null
                if(find.prev == null) {
                    next = find.next;
                    // предыдущему следующего приравниваем null
                    next.prev = null;
                    // устанавливаем следующий головой списка
                    this.cache_vals.setHead(next);
                } else {

                    prev = find.prev;
                    next = find.next;
                    // если prev != null и next != null
                    if(prev != null && next != null) {
                        // то привязываем предыдущий и следующий искомого друг у другу
                        prev.next = next;
                        next.prev = prev;
                    }
                }
                // создаём временный элемент для последнего
                DoublyLinkedListNode last = cache_vals.getLast();
                // привязываем следующий последнего к искомому
                last.next = find;
                // привязываем предыдущий искомого к последнему
                find.prev = last;
                // привязываем следующий искомого к null
                find.next = null;
                // устанавливаем искомый концом списка
                this.cache_vals.setLast(find);
            }

            return find;
        }

    }

    /**
     * устанавливаем элемент
     * @param key
     * @param value
     */
    void set(Object key, Object value) {
        // создаём временный элемент для искомого
        DoublyLinkedListNode node = cache.get(key);
        // если node == null
        if(node == null) {
            // Удаляем первый элемент с головы если размер списка >= вместимости
            removeIfNeeded();
            // создаём новый узел
            DoublyLinkedListNode newNode = new DoublyLinkedListNode(key, value);
            // добавляем в конец списка
            cache_vals.insertLast(value);
            // добавляем в HashMap
            cache.put(key, newNode);
        } else {
            // запоминаем элемент головы списка
            DoublyLinkedListNode remove = cache_vals.removeHead();
            // удаляем его из HashMap
            cache.remove(remove.key);
        }
    }

    /**
     * Удаляем первый элемент с головы если размер списка >= вместимости
     */
    void removeIfNeeded() {
        // если размер списка >= вместимости
        if(cache_vals.getSize() >= capacity) {
            DoublyLinkedListNode node = cache_vals.removeHead();
            cache.remove(node.key);
        }
    }

    void printCache() {
        for( Map.Entry<Object, DoublyLinkedListNode> entry : this.cache.entrySet() ){
            System.out.println( entry.getKey() + " = " + entry.getValue().toString() );
        }
    }
}
