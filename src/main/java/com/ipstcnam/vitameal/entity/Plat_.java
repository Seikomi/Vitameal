package com.ipstcnam.vitameal.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.ipstcnam.vitameal.beans.enums.MinMax;

@Generated(value="Dali", date="2017-07-16T17:27:34.446+0200")
@StaticMetamodel(Plat.class)
public class Plat_ {
	public static volatile SingularAttribute<Plat, Integer> platID;
	public static volatile SingularAttribute<Plat, String> nom;
	public static volatile CollectionAttribute<Plat, ComposantPlat> composantPlats;
	public static volatile SingularAttribute<Plat, MinMax> minMax;
	public static volatile SingularAttribute<Plat, Integer> nombreService;
	public static volatile SingularAttribute<Plat, Integer> periode;
	public static volatile SingularAttribute<Plat, String> categorie;
}
