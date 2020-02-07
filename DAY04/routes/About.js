import React from 'react';

//this.propss.match
const About = ({match}) => {
    return (
        <div>
         {match.params.userid} 's Profile
        </div>
    );
};

export default About;