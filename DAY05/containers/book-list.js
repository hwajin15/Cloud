import React, {Component } from 'react';
import { connect } from 'react-redux';
import { bindActionCreators } from 'redux';
import { selectBook } from '../actions/index'
class BookList extends Component {
    renderList(){
        return this.props.books.map(book =>{
            return(
                <li 
                key={book.title}
                onClick={() => this.props.selectBook(book)}>
                {book.title}
                </li> //book list 배열 -> 반복 처리 
            )
        });
    }

    render(){
        return (
            <ul>
                {this.renderList()}
            </ul>
        );
    }
}
function mapStateToProps(state){
    return {
        books: state.books
    }
}

function mapDispatchToProps(dispatch){
    return bindActionCreators({
        selectBook: selectBook},
        dispatch);
}
export default connect(mapStateToProps,mapDispatchToProps)(BookList);