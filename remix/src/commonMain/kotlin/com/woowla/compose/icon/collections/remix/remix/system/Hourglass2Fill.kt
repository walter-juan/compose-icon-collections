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

public val SystemGroup.Hourglass2Fill: ImageVector
    get() {
        if (_hourglass2Fill != null) {
            return _hourglass2Fill!!
        }
        _hourglass2Fill = Builder(name = "Hourglass2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.46f)
                lineTo(13.537f, 12.0f)
                lineTo(20.0f, 17.54f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.54f)
                lineTo(10.463f, 12.0f)
                lineTo(4.0f, 6.46f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.297f, 7.0f)
                lineTo(18.0f, 5.54f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.54f)
                lineTo(7.703f, 7.0f)
                horizontalLineTo(16.297f)
                close()
                moveTo(12.0f, 13.317f)
                lineTo(6.0f, 18.46f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.46f)
                lineTo(12.0f, 13.317f)
                close()
            }
        }
        .build()
        return _hourglass2Fill!!
    }

private var _hourglass2Fill: ImageVector? = null
