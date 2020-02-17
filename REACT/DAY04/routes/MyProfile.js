import React from 'react';
import {Redirect } from 'react-router-dom'

const isLogged = false;

const MyProfile = () => {
    return (
        <div>
        {
            !isLogged && <Redirect to ="/login" />
            }
        </div>
    );
};

export default MyProfile;