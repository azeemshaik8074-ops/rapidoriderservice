package com.rapido.rider.exception;

public class RiderAlreadyAcceptedException extends RuntimeException {

    public RiderAlreadyAcceptedException() {
        super("Rider has already accepted another ride");
    }
}