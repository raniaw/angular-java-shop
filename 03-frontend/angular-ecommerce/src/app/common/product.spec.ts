import { ProductService } from '../services/product.service';
import { Product } from './product';
import { TestBed } from '@angular/core/testing';

describe('ProductService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductService = TestBed.get(ProductService);
    expect(service).toBeTruthy();
  });
});
