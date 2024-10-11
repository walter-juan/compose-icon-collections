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

public val MediaGroup.CameraLensLine: ImageVector
    get() {
        if (_cameraLensLine != null) {
            return _cameraLensLine!!
        }
        _cameraLensLine = Builder(name = "CameraLensLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.858f, 19.71f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(5.07f)
                curveTo(6.107f, 17.792f, 7.819f, 19.145f, 9.858f, 19.71f)
                close()
                moveTo(4.252f, 14.0f)
                horizontalLineTo(8.536f)
                lineTo(5.071f, 7.999f)
                curveTo(4.39f, 9.176f, 4.0f, 10.542f, 4.0f, 12.0f)
                curveTo(4.0f, 12.691f, 4.088f, 13.361f, 4.252f, 14.0f)
                close()
                moveTo(6.395f, 6.292f)
                lineTo(8.536f, 10.0f)
                lineTo(12.0f, 4.0f)
                curveTo(9.817f, 4.0f, 7.838f, 4.874f, 6.395f, 6.292f)
                close()
                moveTo(14.142f, 4.29f)
                lineTo(12.0f, 8.0f)
                horizontalLineTo(18.93f)
                curveTo(17.893f, 6.208f, 16.181f, 4.855f, 14.142f, 4.29f)
                close()
                moveTo(19.748f, 10.0f)
                horizontalLineTo(15.464f)
                lineTo(18.929f, 16.001f)
                curveTo(19.61f, 14.824f, 20.0f, 13.458f, 20.0f, 12.0f)
                curveTo(20.0f, 11.309f, 19.913f, 10.639f, 19.748f, 10.0f)
                close()
                moveTo(17.605f, 17.708f)
                lineTo(15.464f, 14.0f)
                lineTo(12.0f, 20.0f)
                curveTo(14.183f, 20.0f, 16.162f, 19.126f, 17.605f, 17.708f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.155f, 10.0f)
                horizontalLineTo(10.845f)
                lineTo(9.691f, 12.0f)
                lineTo(10.845f, 14.0f)
                horizontalLineTo(13.155f)
                lineTo(14.309f, 12.0f)
                lineTo(13.155f, 10.0f)
                close()
            }
        }
        .build()
        return _cameraLensLine!!
    }

private var _cameraLensLine: ImageVector? = null
