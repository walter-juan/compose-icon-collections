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

public val SystemGroup.Prohibited2Fill: ImageVector
    get() {
        if (_prohibited2Fill != null) {
            return _prohibited2Fill!!
        }
        _prohibited2Fill = Builder(name = "Prohibited2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.257f, 18.329f)
                curveTo(2.846f, 16.605f, 2.0f, 14.401f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(14.401f, 2.0f, 16.605f, 2.846f, 18.329f, 4.257f)
                lineTo(4.257f, 18.329f)
                close()
                moveTo(19.743f, 5.671f)
                curveTo(21.154f, 7.395f, 22.0f, 9.599f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(9.599f, 22.0f, 7.395f, 21.154f, 5.671f, 19.743f)
                lineTo(19.743f, 5.671f)
                close()
            }
        }
        .build()
        return _prohibited2Fill!!
    }

private var _prohibited2Fill: ImageVector? = null
