package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlBing: ImageVector
    get() {
        if (_bxlBing != null) {
            return _bxlBing!!
        }
        _bxlBing = Builder(name = "BxlBing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.71f, 3.0f)
                lineToRelative(3.593f, 1.264f)
                verticalLineToRelative(12.645f)
                lineToRelative(5.061f, -2.919f)
                lineToRelative(-2.48f, -1.165f)
                lineToRelative(-1.566f, -3.897f)
                lineToRelative(7.974f, 2.802f)
                verticalLineToRelative(4.073f)
                lineToRelative(-8.984f, 5.183f)
                lineToRelative(-3.595f, -2.0f)
                lineTo(5.71f, 3.0f)
                close()
            }
        }
        .build()
        return _bxlBing!!
    }

private var _bxlBing: ImageVector? = null
