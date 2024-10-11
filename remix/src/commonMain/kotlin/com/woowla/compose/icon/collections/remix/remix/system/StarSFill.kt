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

public val SystemGroup.StarSFill: ImageVector
    get() {
        if (_starSFill != null) {
            return _starSFill!!
        }
        _starSFill = Builder(name = "StarSFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineTo(6.122f, 20.59f)
                lineTo(7.72f, 13.891f)
                lineTo(2.489f, 9.41f)
                lineTo(9.355f, 8.859f)
                lineTo(12.0f, 2.5f)
                lineTo(14.645f, 8.859f)
                lineTo(21.51f, 9.41f)
                lineTo(16.28f, 13.891f)
                lineTo(17.878f, 20.59f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _starSFill!!
    }

private var _starSFill: ImageVector? = null
