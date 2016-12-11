package io.hgraphdb.giraph;

import org.apache.giraph.graph.BasicComputation;
import org.apache.giraph.graph.Vertex;
import org.apache.hadoop.io.Writable;

import java.io.IOException;

public abstract class HBaseComputation<M extends Writable> extends BasicComputation<ObjectWritable, VertexWritable, EdgeWritable, M> {

    @Override
    public abstract void compute(final Vertex<ObjectWritable, VertexWritable, EdgeWritable> vertex, final Iterable<M> messages) throws IOException;
}