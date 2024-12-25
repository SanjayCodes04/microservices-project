package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
    *
    * @param customerDto - Customer Object
    */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Accounts details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - customerDto object
     * @return boolean indicating if the update of account details is successful
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Accounts details based on a given mobileNumber
     */
    boolean deleteAccount(String mobileNumber);
}
