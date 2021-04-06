package empresa.jpa;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-06T12:23:00")
@StaticMetamodel(Nombre.class)
public class Nombre_ { 

    public static volatile SingularAttribute<Nombre, String> ruc;
    public static volatile SingularAttribute<Nombre, Integer> codRef;
    public static volatile SingularAttribute<Nombre, String> lastUser;
    public static volatile SingularAttribute<Nombre, String> contacto;
    public static volatile SingularAttribute<Nombre, BigInteger> firstOid;
    public static volatile SingularAttribute<Nombre, String> abreviatura;
    public static volatile SingularAttribute<Nombre, BigInteger> lastOid;
    public static volatile SingularAttribute<Nombre, Short> lockReg;
    public static volatile SingularAttribute<Nombre, String> direccion;
    public static volatile SingularAttribute<Nombre, Date> fecIni;
    public static volatile SingularAttribute<Nombre, Date> fecUpd;
    public static volatile SingularAttribute<Nombre, String> razonSocial;
    public static volatile SingularAttribute<Nombre, String> firstUser;
    public static volatile SingularAttribute<Nombre, Long> id;
    public static volatile SingularAttribute<Nombre, String> telefono;

}