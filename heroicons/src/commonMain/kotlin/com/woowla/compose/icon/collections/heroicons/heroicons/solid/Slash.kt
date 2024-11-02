package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Slash: ImageVector
    get() {
        if (_slash != null) {
            return _slash!!
        }
        _slash = Builder(name = "Slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.256f, 3.042f)
                curveTo(15.645f, 3.184f, 15.846f, 3.614f, 15.705f, 4.004f)
                lineTo(9.705f, 20.504f)
                curveTo(9.563f, 20.893f, 9.133f, 21.094f, 8.743f, 20.953f)
                curveTo(8.354f, 20.811f, 8.153f, 20.381f, 8.295f, 19.991f)
                lineTo(14.295f, 3.491f)
                curveTo(14.436f, 3.102f, 14.867f, 2.901f, 15.256f, 3.042f)
                close()
            }
        }
        .build()
        return _slash!!
    }

private var _slash: ImageVector? = null
