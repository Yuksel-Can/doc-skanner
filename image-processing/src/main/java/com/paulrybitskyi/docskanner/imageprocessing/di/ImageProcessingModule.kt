/*
 * Copyright 2020 Paul Rybitskyi, paul.rybitskyi.work@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paulrybitskyi.docskanner.imageprocessing.di

import com.paulrybitskyi.docskanner.imageprocessing.ImageProcessorInitializer
import com.paulrybitskyi.docskanner.imageprocessing.ImageProcessorInitializerImpl
import com.paulrybitskyi.docskanner.imageprocessing.crop.ImagePerspectiveTransformer
import com.paulrybitskyi.docskanner.imageprocessing.crop.OpenCvImagePerspectiveTransformer
import com.paulrybitskyi.docskanner.imageprocessing.crop.transform.CropTransformationFactory
import com.paulrybitskyi.docskanner.imageprocessing.crop.transform.CropTransformationFactoryImpl
import com.paulrybitskyi.docskanner.imageprocessing.detector.DocCoordsOrderer
import com.paulrybitskyi.docskanner.imageprocessing.detector.DocCoordsOrdererImpl
import com.paulrybitskyi.docskanner.imageprocessing.detector.DocShapeDetector
import com.paulrybitskyi.docskanner.imageprocessing.detector.OpenCvDocShapeDetector
import com.paulrybitskyi.docskanner.imageprocessing.effects.ImageEffectTransformationFactory
import com.paulrybitskyi.docskanner.imageprocessing.effects.ImageEffectTransformationFactoryImpl
import com.paulrybitskyi.docskanner.imageprocessing.resize.ResizeTransformationFactory
import com.paulrybitskyi.docskanner.imageprocessing.resize.ResizeTransformationFactoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface ImageProcessingModule {


    @Binds
    fun bindImageProcessorInitializer(
        initializer: ImageProcessorInitializerImpl
    ): ImageProcessorInitializer


    @Binds
    fun bindDocCoordsOrderer(
        sorter: DocCoordsOrdererImpl
    ): DocCoordsOrderer


    @Binds
    fun bindDocShapeDetector(
        detector: OpenCvDocShapeDetector
    ): DocShapeDetector


    @Binds
    fun bindImageEffectTransformationFactory(
        transformationFactory: ImageEffectTransformationFactoryImpl
    ): ImageEffectTransformationFactory


    @Binds
    fun bindResizeTransformationFactory(
        transformationFactory: ResizeTransformationFactoryImpl
    ): ResizeTransformationFactory


    @Binds
    fun bindImagePerspectiveTransformer(
        perspectiveTransformer: OpenCvImagePerspectiveTransformer
    ): ImagePerspectiveTransformer


    @Binds
    fun bindCropTransformationFactory(
        factory: CropTransformationFactoryImpl
    ): CropTransformationFactory


}