import React, { Component } from 'react';

class Counter extends Component {
    state = {  
        count: 0,
        tags: ['tag1', 'tag2', 'tag3']
        
    };
    styles = {
        fontSize: 20,
        fontWeight: 'bold'
    };
     
    render() { 
        return (
        <div>
        <span style = {this.styles} className={ this.getBadgeClasses() }>{this.formatCount()}</span>
        <button style = {{ fontSize: 20}} type="button" class="btn btn-secondary btn-lg m-2" >Increment</button>
        <ul>{this.state.tags.map(tag => <li key={tag}> {tag} </li>)}</ul>
        </div>);
    }
    getBadgeClasses() {
        let classes = "badge m-2 badge-";
        classes += this.state.count === 0 ? "warning" : "primary";
        return classes;
    }

    formatCount() {
        const { count } = this.state;
         return  count === 0 ? 'Zero' :  count; 
    }
}
 
export default Counter;