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

public val BrandsGroup.Korvue: ImageVector
    get() {
        if (_korvue != null) {
            return _korvue!!
        }
        _korvue = Builder(name = "Korvue", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(387.6f, 34.0f)
                lineToRelative(-327.0f, 0.0f)
                curveTo(27.9f, 34.0f, 1.1f, 60.8f, 1.1f, 93.5f)
                lineToRelative(0.0f, 327.1f)
                curveToRelative(0.0f, 32.6f, 26.8f, 59.4f, 59.5f, 59.4f)
                lineToRelative(327.1f, 0.0f)
                curveToRelative(33.0f, 0.0f, 59.5f, -26.8f, 59.5f, -59.5f)
                lineToRelative(0.0f, -327.0f)
                curveTo(447.1f, 60.8f, 420.3f, 34.0f, 387.6f, 34.0f)
                close()
                moveTo(88.2f, 120.8f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 116.0f)
                lineToRelative(61.8f, -116.0f)
                lineToRelative(110.9f, 0.0f)
                lineToRelative(-81.2f, 132.0f)
                lineToRelative(-187.5f, 0.0f)
                lineToRelative(0.0f, -132.0f)
                close()
                moveTo(250.0f, 392.9f)
                lineToRelative(-65.7f, -113.6f)
                lineToRelative(0.0f, 113.6f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -130.8f)
                lineToRelative(191.5f, 0.0f)
                lineToRelative(88.6f, 130.8f)
                lineToRelative(-118.4f, 0.0f)
                close()
            }
        }
        .build()
        return _korvue!!
    }

private var _korvue: ImageVector? = null
