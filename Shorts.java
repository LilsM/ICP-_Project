/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "shorts", catalog = "Project2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Shorts.findAll", query = "SELECT s FROM Shorts s")
    , @NamedQuery(name = "Shorts.findById", query = "SELECT s FROM Shorts s WHERE s.id = :id")
    , @NamedQuery(name = "Shorts.findByName", query = "SELECT s FROM Shorts s WHERE s.name = :name")
    , @NamedQuery(name = "Shorts.findByPrice", query = "SELECT s FROM Shorts s WHERE s.price = :price")
    , @NamedQuery(name = "Shorts.findByAvailability", query = "SELECT s FROM Shorts s WHERE s.availability = :availability")})
public class Shorts implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "availability")
    private Boolean availability;

    public Shorts() {
    }

    public Shorts(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        Boolean oldAvailability = this.availability;
        this.availability = availability;
        changeSupport.firePropertyChange("availability", oldAvailability, availability);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shorts)) {
            return false;
        }
        Shorts other = (Shorts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project2.Shorts[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
