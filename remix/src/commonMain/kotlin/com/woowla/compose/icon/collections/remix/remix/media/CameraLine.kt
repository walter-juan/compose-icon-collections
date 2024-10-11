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

public val MediaGroup.CameraLine: ImageVector
    get() {
        if (_cameraLine != null) {
            return _cameraLine!!
        }
        _cameraLine = Builder(name = "CameraLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 5.0f)
                lineTo(7.828f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.172f)
                lineTo(14.172f, 5.0f)
                horizontalLineTo(9.828f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(8.962f, 18.0f, 6.5f, 15.538f, 6.5f, 12.5f)
                curveTo(6.5f, 9.462f, 8.962f, 7.0f, 12.0f, 7.0f)
                curveTo(15.038f, 7.0f, 17.5f, 9.462f, 17.5f, 12.5f)
                curveTo(17.5f, 15.538f, 15.038f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(13.933f, 16.0f, 15.5f, 14.433f, 15.5f, 12.5f)
                curveTo(15.5f, 10.567f, 13.933f, 9.0f, 12.0f, 9.0f)
                curveTo(10.067f, 9.0f, 8.5f, 10.567f, 8.5f, 12.5f)
                curveTo(8.5f, 14.433f, 10.067f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cameraLine!!
    }

private var _cameraLine: ImageVector? = null
