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

public val LogosGroup.MediumLine: ImageVector
    get() {
        if (_mediumLine != null) {
            return _mediumLine!!
        }
        _mediumLine = Builder(name = "MediumLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.158f, 4.0f)
                horizontalLineTo(17.842f)
                curveTo(19.034f, 4.0f, 20.0f, 4.966f, 20.0f, 6.158f)
                verticalLineTo(9.613f)
                curveTo(19.823f, 9.658f, 19.653f, 9.717f, 19.508f, 9.791f)
                curveTo(19.108f, 9.976f, 18.755f, 10.253f, 18.461f, 10.616f)
                curveTo(17.989f, 11.202f, 17.703f, 11.993f, 17.633f, 12.882f)
                curveTo(17.618f, 13.059f, 17.613f, 13.237f, 17.616f, 13.414f)
                curveTo(17.657f, 15.177f, 18.496f, 16.629f, 20.0f, 16.965f)
                verticalLineTo(17.842f)
                curveTo(20.0f, 19.034f, 19.034f, 20.0f, 17.842f, 20.0f)
                horizontalLineTo(6.158f)
                curveTo(4.966f, 20.0f, 4.0f, 19.034f, 4.0f, 17.842f)
                verticalLineTo(6.158f)
                curveTo(4.0f, 4.966f, 4.966f, 4.0f, 6.158f, 4.0f)
                close()
                moveTo(21.0f, 6.158f)
                curveTo(21.0f, 4.414f, 19.586f, 3.0f, 17.842f, 3.0f)
                horizontalLineTo(6.158f)
                curveTo(4.414f, 3.0f, 3.0f, 4.414f, 3.0f, 6.158f)
                verticalLineTo(17.842f)
                curveTo(3.0f, 19.586f, 4.414f, 21.0f, 6.158f, 21.0f)
                horizontalLineTo(17.842f)
                curveTo(19.586f, 21.0f, 21.0f, 19.586f, 21.0f, 17.842f)
                verticalLineTo(6.158f)
                close()
                moveTo(20.0f, 10.298f)
                verticalLineTo(12.281f)
                horizontalLineTo(19.384f)
                curveTo(19.423f, 11.414f, 19.636f, 10.701f, 20.0f, 10.298f)
                close()
                moveTo(20.0f, 12.662f)
                verticalLineTo(14.725f)
                curveTo(19.559f, 14.212f, 19.301f, 13.476f, 19.347f, 12.662f)
                horizontalLineTo(20.0f)
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
                curveTo(6.849f, 7.419f, 7.118f, 7.598f, 7.118f, 8.24f)
                verticalLineTo(15.759f)
                curveTo(7.118f, 16.402f, 6.848f, 16.58f, 6.319f, 16.699f)
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
                curveTo(16.9f, 7.598f, 17.169f, 7.419f, 17.697f, 7.3f)
                close()
            }
        }
        .build()
        return _mediumLine!!
    }

private var _mediumLine: ImageVector? = null
