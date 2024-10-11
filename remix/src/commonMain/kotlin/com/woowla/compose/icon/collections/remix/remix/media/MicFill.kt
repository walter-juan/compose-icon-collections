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

public val MediaGroup.MicFill: ImageVector
    get() {
        if (_micFill != null) {
            return _micFill!!
        }
        _micFill = Builder(name = "MicFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(14.761f, 1.0f, 17.0f, 3.239f, 17.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 12.761f, 14.761f, 15.0f, 12.0f, 15.0f)
                curveTo(9.238f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 3.239f, 9.238f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(3.055f, 11.0f)
                horizontalLineTo(5.071f)
                curveTo(5.556f, 14.392f, 8.473f, 17.0f, 12.0f, 17.0f)
                curveTo(15.526f, 17.0f, 18.444f, 14.392f, 18.929f, 11.0f)
                horizontalLineTo(20.945f)
                curveTo(20.484f, 15.172f, 17.171f, 18.484f, 13.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.945f)
                curveTo(6.828f, 18.484f, 3.516f, 15.172f, 3.055f, 11.0f)
                close()
            }
        }
        .build()
        return _micFill!!
    }

private var _micFill: ImageVector? = null
