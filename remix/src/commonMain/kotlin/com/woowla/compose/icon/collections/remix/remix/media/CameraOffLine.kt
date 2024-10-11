package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.CameraOffLine: ImageVector
    get() {
        if (_cameraOffLine != null) {
            return _cameraOffLine!!
        }
        _cameraOffLine = Builder(name = "CameraOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.586f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(3.586f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(19.586f, 21.0f)
                close()
                moveTo(5.586f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.586f)
                lineTo(15.405f, 16.819f)
                curveTo(14.469f, 17.559f, 13.286f, 18.0f, 12.0f, 18.0f)
                curveTo(8.963f, 18.0f, 6.5f, 15.538f, 6.5f, 12.5f)
                curveTo(6.5f, 11.214f, 6.941f, 10.031f, 7.681f, 9.095f)
                lineTo(5.586f, 7.0f)
                close()
                moveTo(9.111f, 10.525f)
                curveTo(8.725f, 11.087f, 8.5f, 11.767f, 8.5f, 12.5f)
                curveTo(8.5f, 14.433f, 10.067f, 16.0f, 12.0f, 16.0f)
                curveTo(12.733f, 16.0f, 13.413f, 15.775f, 13.976f, 15.39f)
                lineTo(9.111f, 10.525f)
                close()
                moveTo(22.0f, 17.786f)
                lineTo(20.0f, 15.786f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.172f)
                lineTo(14.172f, 5.0f)
                horizontalLineTo(9.829f)
                lineTo(9.521f, 5.307f)
                lineTo(8.107f, 3.893f)
                lineTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(17.786f)
                close()
                moveTo(11.263f, 7.049f)
                curveTo(11.504f, 7.017f, 11.75f, 7.0f, 12.0f, 7.0f)
                curveTo(15.038f, 7.0f, 17.5f, 9.462f, 17.5f, 12.5f)
                curveTo(17.5f, 12.75f, 17.483f, 12.996f, 17.451f, 13.237f)
                lineTo(15.113f, 10.899f)
                curveTo(14.779f, 10.251f, 14.249f, 9.721f, 13.601f, 9.387f)
                lineTo(11.263f, 7.049f)
                close()
            }
        }
        .build()
        return _cameraOffLine!!
    }

private var _cameraOffLine: ImageVector? = null
