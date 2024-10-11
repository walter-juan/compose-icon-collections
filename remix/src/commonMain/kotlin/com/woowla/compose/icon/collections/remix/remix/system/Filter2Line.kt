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

public val SystemGroup.Filter2Line: ImageVector
    get() {
        if (_filter2Line != null) {
            return _filter2Line!!
        }
        _filter2Line = Builder(name = "Filter2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(20.0f)
                lineTo(10.0f, 22.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                lineTo(14.0f, 14.0f)
                close()
                moveTo(6.404f, 5.0f)
                lineTo(12.0f, 13.394f)
                lineTo(17.596f, 5.0f)
                horizontalLineTo(6.404f)
                close()
            }
        }
        .build()
        return _filter2Line!!
    }

private var _filter2Line: ImageVector? = null
