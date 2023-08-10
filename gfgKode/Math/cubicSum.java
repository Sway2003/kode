long sumOfSeries(long N) {

       
        if(N == 1)
            return N;
        
        return (long)Math.pow(N, 3) + sumOfSeries(N-1);
    }

