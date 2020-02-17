import axios from 'axios';


const ROOT_URL = `https://poloniex.com/public?command=returnChartData&start=1580955509&end=1581560309&period=86400`;

export const FETCH_BITCOIN = 'FETCH_BITCOIN';

//redux action
// tyoe(mandatory)
// payload(optional, data?)
export function fetchbitcoin(currencyPair) {
    const url = `${ROOT_URL}&currencyPair=${currencyPair}`;
    const request = axios.get(url)

    return{
        type: FETCH_BITCOIN,
        payload: request
    }
}

