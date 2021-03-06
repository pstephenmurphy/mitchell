package com.cieca.estimate.resource.entity.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMSVersionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BMSVersionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="1.0"/>
 *     &lt;enumeration value="1.1.4"/>
 *     &lt;enumeration value="1.1.5"/>
 *     &lt;enumeration value="1.1.6"/>
 *     &lt;enumeration value="1.1.8"/>
 *     &lt;enumeration value="1.1.9"/>
 *     &lt;enumeration value="1.2.0"/>
 *     &lt;enumeration value="1.3.4"/>
 *     &lt;enumeration value="1.3.5"/>
 *     &lt;enumeration value="1.3.6"/>
 *     &lt;enumeration value="1.3.7"/>
 *     &lt;enumeration value="2.0.0"/>
 *     &lt;enumeration value="2.1.0"/>
 *     &lt;enumeration value="2.2.0"/>
 *     &lt;enumeration value="2.5.0"/>
 *     &lt;enumeration value="2.6.0"/>
 *     &lt;enumeration value="2.7.0"/>
 *     &lt;enumeration value="2.8.0"/>
 *     &lt;enumeration value="2.9.0"/>
 *     &lt;enumeration value="2.9.1"/>
 *     &lt;enumeration value="2.10.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BMSVersionEnum")
@XmlEnum
public enum BMSVersionEnum {

    @XmlEnumValue("1.0")
    VALUE_1("1.0"),
    @XmlEnumValue("1.1.4")
    VALUE_2("1.1.4"),
    @XmlEnumValue("1.1.5")
    VALUE_3("1.1.5"),
    @XmlEnumValue("1.1.6")
    VALUE_4("1.1.6"),
    @XmlEnumValue("1.1.8")
    VALUE_5("1.1.8"),
    @XmlEnumValue("1.1.9")
    VALUE_6("1.1.9"),
    @XmlEnumValue("1.2.0")
    VALUE_7("1.2.0"),
    @XmlEnumValue("1.3.4")
    VALUE_8("1.3.4"),
    @XmlEnumValue("1.3.5")
    VALUE_9("1.3.5"),
    @XmlEnumValue("1.3.6")
    VALUE_10("1.3.6"),
    @XmlEnumValue("1.3.7")
    VALUE_11("1.3.7"),
    @XmlEnumValue("2.0.0")
    VALUE_12("2.0.0"),
    @XmlEnumValue("2.1.0")
    VALUE_13("2.1.0"),
    @XmlEnumValue("2.2.0")
    VALUE_14("2.2.0"),
    @XmlEnumValue("2.5.0")
    VALUE_15("2.5.0"),
    @XmlEnumValue("2.6.0")
    VALUE_16("2.6.0"),
    @XmlEnumValue("2.7.0")
    VALUE_17("2.7.0"),
    @XmlEnumValue("2.8.0")
    VALUE_18("2.8.0"),
    @XmlEnumValue("2.9.0")
    VALUE_19("2.9.0"),
    @XmlEnumValue("2.9.1")
    VALUE_20("2.9.1"),
    @XmlEnumValue("2.10.0")
    VALUE_21("2.10.0");
    private final String value;

    BMSVersionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BMSVersionEnum fromValue(String v) {
        for (BMSVersionEnum c: BMSVersionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
