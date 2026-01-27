package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Dyalog: ImageVector
    get() {
        if (_dyalog != null) {
            return _dyalog!!
        }
        _dyalog = Builder(name = "Dyalog", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 32.0f)
                lineToRelative(0.0f, 119.2f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -55.2f)
                lineToRelative(107.2f, 0.0f)
                curveTo(300.6f, 96.0f, 368.0f, 176.2f, 368.0f, 255.9f)
                curveTo(368.0f, 332.0f, 309.4f, 416.0f, 187.2f, 416.0f)
                lineToRelative(-171.2f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(171.2f, 0.0f)
                curveTo(347.9f, 480.0f, 432.0f, 367.3f, 432.0f, 255.9f)
                curveTo(432.0f, 197.2f, 409.9f, 142.5f, 369.7f, 101.6f)
                curveTo(324.9f, 56.0f, 261.7f, 32.0f, 187.2f, 32.0f)
                lineTo(16.0f, 32.0f)
                close()
            }
        }
        .build()
        return _dyalog!!
    }

private var _dyalog: ImageVector? = null
