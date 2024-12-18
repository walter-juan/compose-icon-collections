package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.MediumFill: ImageVector
    get() {
        if (_mediumFill != null) {
            return _mediumFill!!
        }
        _mediumFill = Builder(name = "MediumFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.158f, 3.0f)
                horizontalLineTo(17.842f)
                curveTo(19.586f, 3.0f, 21.0f, 4.414f, 21.0f, 6.158f)
                verticalLineTo(9.524f)
                curveTo(20.919f, 9.518f, 20.837f, 9.516f, 20.755f, 9.516f)
                curveTo(20.353f, 9.516f, 19.859f, 9.614f, 19.508f, 9.791f)
                curveTo(19.108f, 9.976f, 18.755f, 10.253f, 18.461f, 10.616f)
                curveTo(17.989f, 11.202f, 17.702f, 11.993f, 17.633f, 12.882f)
                curveTo(17.618f, 13.059f, 17.613f, 13.237f, 17.616f, 13.414f)
                curveTo(17.663f, 15.428f, 18.751f, 17.038f, 20.684f, 17.038f)
                curveTo(20.792f, 17.038f, 20.897f, 17.032f, 21.0f, 17.023f)
                verticalLineTo(17.842f)
                curveTo(21.0f, 19.586f, 19.586f, 21.0f, 17.842f, 21.0f)
                horizontalLineTo(6.158f)
                curveTo(4.414f, 21.0f, 3.0f, 19.586f, 3.0f, 17.842f)
                verticalLineTo(6.158f)
                curveTo(3.0f, 4.414f, 4.414f, 3.0f, 6.158f, 3.0f)
                close()
                moveTo(21.0f, 15.388f)
                verticalLineTo(12.662f)
                horizontalLineTo(19.347f)
                curveTo(19.273f, 13.978f, 19.993f, 15.091f, 21.0f, 15.388f)
                close()
                moveTo(21.0f, 12.281f)
                verticalLineTo(9.973f)
                curveTo(20.92f, 9.952f, 20.834f, 9.94f, 20.743f, 9.938f)
                curveTo(19.929f, 9.955f, 19.444f, 10.93f, 19.384f, 12.281f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.697f, 7.3f)
                lineTo(17.712f, 7.297f)
                verticalLineTo(7.187f)
                horizontalLineTo(14.813f)
                lineTo(12.121f, 13.513f)
                lineTo(9.43f, 7.187f)
                horizontalLineTo(6.306f)
                verticalLineTo(7.297f)
                lineTo(6.32f, 7.3f)
                curveTo(6.849f, 7.419f, 7.117f, 7.598f, 7.117f, 8.24f)
                verticalLineTo(15.759f)
                curveTo(7.117f, 16.402f, 6.848f, 16.58f, 6.319f, 16.699f)
                lineTo(6.305f, 16.702f)
                verticalLineTo(16.813f)
                horizontalLineTo(8.424f)
                verticalLineTo(16.703f)
                lineTo(8.41f, 16.7f)
                curveTo(7.881f, 16.58f, 7.612f, 16.402f, 7.612f, 15.76f)
                verticalLineTo(8.676f)
                lineTo(11.07f, 16.813f)
                horizontalLineTo(11.266f)
                lineTo(14.825f, 8.449f)
                verticalLineTo(15.946f)
                curveTo(14.779f, 16.453f, 14.513f, 16.61f, 14.034f, 16.718f)
                lineTo(14.02f, 16.721f)
                verticalLineTo(16.83f)
                horizontalLineTo(17.712f)
                verticalLineTo(16.721f)
                lineTo(17.697f, 16.718f)
                curveTo(17.218f, 16.61f, 16.945f, 16.453f, 16.9f, 15.946f)
                lineTo(16.897f, 8.24f)
                horizontalLineTo(16.9f)
                curveTo(16.9f, 7.598f, 17.168f, 7.419f, 17.697f, 7.3f)
                close()
            }
        }
        .build()
        return _mediumFill!!
    }

private var _mediumFill: ImageVector? = null
