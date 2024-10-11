package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Eye2Fill: ImageVector
    get() {
        if (_eye2Fill != null) {
            return _eye2Fill!!
        }
        _eye2Fill = Builder(name = "Eye2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.487f, 7.0f, 10.993f, 7.077f, 10.527f, 7.22f)
                curveTo(11.395f, 7.612f, 12.0f, 8.485f, 12.0f, 9.5f)
                curveTo(12.0f, 10.881f, 10.881f, 12.0f, 9.5f, 12.0f)
                curveTo(8.485f, 12.0f, 7.612f, 11.395f, 7.221f, 10.527f)
                curveTo(7.077f, 10.993f, 7.0f, 11.487f, 7.0f, 12.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(14.761f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                curveTo(17.0f, 9.239f, 14.761f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _eye2Fill!!
    }

private var _eye2Fill: ImageVector? = null
