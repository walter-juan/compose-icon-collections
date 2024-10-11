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

public val LogosGroup.NextjsFill: ImageVector
    get() {
        if (_nextjsFill != null) {
            return _nextjsFill!!
        }
        _nextjsFill = Builder(name = "NextjsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(14.65f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.346f, 9.709f)
                lineTo(15.405f, 17.538f)
                lineTo(16.459f, 16.729f)
                lineTo(9.683f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.997f)
                horizontalLineTo(9.346f)
                verticalLineTo(9.709f)
                close()
            }
        }
        .build()
        return _nextjsFill!!
    }

private var _nextjsFill: ImageVector? = null
