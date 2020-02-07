import React from 'react';
import { Link, Route } from 'react-router-dom';

const Postli = ({match}) =>{
    return(
        <h3>{match.params.title}</h3>
    )
}
const Post = () => {
    return (
        <div>
     <h2>Posts</h2>
     <ul>
         
    <li> <Link to="post/java">Java </Link></li>
    <li>  <Link to="post/react">react </Link></li>
    <li>  <Link to="post/js">Java script </Link></li>
        
     </ul>
        <Route path ="/post/:title" component={Postli}/>
        </div>
    );
};

export default Post;