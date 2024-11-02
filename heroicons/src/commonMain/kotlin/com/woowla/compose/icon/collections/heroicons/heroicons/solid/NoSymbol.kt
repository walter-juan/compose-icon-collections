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

public val SolidGroup.NoSymbol: ImageVector
    get() {
        if (_noSymbol != null) {
            return _noSymbol!!
        }
        _noSymbol = Builder(name = "NoSymbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.72f, 5.66f)
                lineTo(18.34f, 17.279f)
                curveTo(21.045f, 14.038f, 20.877f, 9.209f, 17.834f, 6.166f)
                curveTo(14.791f, 3.123f, 9.962f, 2.954f, 6.72f, 5.66f)
                close()
                moveTo(17.279f, 18.34f)
                lineTo(5.66f, 6.72f)
                curveTo(2.954f, 9.962f, 3.123f, 14.791f, 6.166f, 17.834f)
                curveTo(9.209f, 20.877f, 14.038f, 21.045f, 17.279f, 18.34f)
                close()
                moveTo(5.106f, 5.106f)
                curveTo(8.913f, 1.298f, 15.087f, 1.298f, 18.894f, 5.106f)
                curveTo(22.702f, 8.913f, 22.702f, 15.087f, 18.894f, 18.894f)
                curveTo(15.087f, 22.702f, 8.913f, 22.702f, 5.106f, 18.894f)
                curveTo(1.298f, 15.087f, 1.298f, 8.913f, 5.106f, 5.106f)
                close()
            }
        }
        .build()
        return _noSymbol!!
    }

private var _noSymbol: ImageVector? = null
