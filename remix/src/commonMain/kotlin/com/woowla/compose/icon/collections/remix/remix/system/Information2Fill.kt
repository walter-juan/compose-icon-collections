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

public val SystemGroup.Information2Fill: ImageVector
    get() {
        if (_information2Fill != null) {
            return _information2Fill!!
        }
        _information2Fill = Builder(name = "Information2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 9.5f)
                curveTo(12.828f, 9.5f, 13.5f, 8.828f, 13.5f, 8.0f)
                curveTo(13.5f, 7.172f, 12.828f, 6.5f, 12.0f, 6.5f)
                curveTo(11.172f, 6.5f, 10.5f, 7.172f, 10.5f, 8.0f)
                curveTo(10.5f, 8.828f, 11.172f, 9.5f, 12.0f, 9.5f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _information2Fill!!
    }

private var _information2Fill: ImageVector? = null
