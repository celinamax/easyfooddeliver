import ProductCard from "./ProductCard"

export type Product = {
    id: number;
    name: String;
    price: number;
    description: String;
    imageUri: String;
}

export type OrderLocationData = {
    latitude: number;
    longitude: number;
    address: string;
}

type ProductId ={
    id: number;
}

export type OrderPayload ={
    products: ProductId[];
} & OrderLocationData;