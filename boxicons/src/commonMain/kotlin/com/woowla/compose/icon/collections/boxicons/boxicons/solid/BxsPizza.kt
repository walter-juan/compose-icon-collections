package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPizza: ImageVector
    get() {
        if (_bxsPizza != null) {
            return _bxsPizza!!
        }
        _bxsPizza = Builder(name = "BxsPizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.76f, 2.021f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, -0.989f, 0.703f)
                lineTo(3.579f, 19.166f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.255f, 1.255f)
                lineToRelative(16.442f, -5.192f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, 0.702f, -0.988f)
                curveTo(21.6f, 7.666f, 16.334f, 2.4f, 9.76f, 2.021f)
                close()
                moveTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxsPizza!!
    }

private var _bxsPizza: ImageVector? = null
