import React from 'react';
import {NavLink } from 'react-router-dom';
import './Header.css'
const Header = () => {
    return (
        <div className="header">
            
                <NavLink exact to="/"
                className="item">home</NavLink>
                <NavLink to="/about/hwa"
                className="item"
                >about</NavLink>
                <NavLink to="/post"
                className="item"
                >Posts</NavLink>
                 <NavLink to="/login"
                className="item"
                >Login</NavLink>
               <NavLink to="/myprofile"
                className="item"
                >MyProfile</NavLink>
                 <NavLink to="/search"
                className="item"
                >Serach </NavLink>

            
        </div>
    );
};

export default Header;