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

public val MediaGroup.PhoneCameraFill: ImageVector
    get() {
        if (_phoneCameraFill != null) {
            return _phoneCameraFill!!
        }
        _phoneCameraFill = Builder(name = "PhoneCameraFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.803f, 4.0f)
                curveTo(14.292f, 4.883f, 14.0f, 5.907f, 14.0f, 7.0f)
                curveTo(14.0f, 10.314f, 16.686f, 13.0f, 20.0f, 13.0f)
                curveTo(21.093f, 13.0f, 22.118f, 12.708f, 23.0f, 12.197f)
                verticalLineTo(18.999f)
                curveTo(23.0f, 19.552f, 22.56f, 20.0f, 21.997f, 20.0f)
                horizontalLineTo(2.002f)
                curveTo(1.449f, 20.0f, 1.0f, 19.555f, 1.0f, 18.999f)
                verticalLineTo(5.001f)
                curveTo(1.0f, 4.448f, 1.439f, 4.0f, 2.002f, 4.0f)
                horizontalLineTo(14.803f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(17.791f, 11.0f, 16.0f, 9.209f, 16.0f, 7.0f)
                curveTo(16.0f, 4.791f, 17.791f, 3.0f, 20.0f, 3.0f)
                curveTo(22.209f, 3.0f, 24.0f, 4.791f, 24.0f, 7.0f)
                curveTo(24.0f, 9.209f, 22.209f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(20.0f, 9.0f)
                curveTo(21.105f, 9.0f, 22.0f, 8.105f, 22.0f, 7.0f)
                curveTo(22.0f, 5.895f, 21.105f, 5.0f, 20.0f, 5.0f)
                curveTo(18.895f, 5.0f, 18.0f, 5.895f, 18.0f, 7.0f)
                curveTo(18.0f, 8.105f, 18.895f, 9.0f, 20.0f, 9.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _phoneCameraFill!!
    }

private var _phoneCameraFill: ImageVector? = null
