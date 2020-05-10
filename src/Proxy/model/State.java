package Proxy.model;

import java.io.Serializable;

public enum State implements Serializable {
    HasQuarter,
    NoQuarter,
    SoldOut,
    Sold
}
