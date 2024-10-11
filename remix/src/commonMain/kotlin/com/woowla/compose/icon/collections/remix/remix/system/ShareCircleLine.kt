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

public val SystemGroup.ShareCircleLine: ImageVector
    get() {
        if (_shareCircleLine != null) {
            return _shareCircleLine!!
        }
        _shareCircleLine = Builder(name = "ShareCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.049f)
                verticalLineTo(4.062f)
                curveTo(7.054f, 4.554f, 4.0f, 7.92f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.08f, 20.0f, 19.446f, 16.946f, 19.938f, 13.0f)
                horizontalLineTo(21.951f)
                curveTo(21.449f, 18.053f, 17.185f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.815f, 5.947f, 2.551f, 11.0f, 2.049f)
                close()
                moveTo(20.0f, 5.414f)
                lineTo(12.0f, 13.414f)
                lineTo(10.586f, 12.0f)
                lineTo(18.586f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.414f)
                close()
            }
        }
        .build()
        return _shareCircleLine!!
    }

private var _shareCircleLine: ImageVector? = null
