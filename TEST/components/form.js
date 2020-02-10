import React, { Component } from 'react';

class Form extends Component {
    state = {
        todo: ''
    }

    handleChange =(e) => {
        this.setState({
            [e.target.name] : e.target.value
        })
    }
    handleSubmit = (e) => {
        e.preventDefault();
        this.props.onCreate(this.state);
        this.setState({
          todo: '',
        })
      }
    render() {
        return (
           
            <form onSubmit={this.handleSubmit}>
                 
                <input 
                placeholder='할일을 입력하세요'
                value={this.state.todo}
                name='todo'
                onChange = {this.handleChange}
                />
                <button type='submit'>추가</button>
            </form>
        );
    }
}

export default Form;
