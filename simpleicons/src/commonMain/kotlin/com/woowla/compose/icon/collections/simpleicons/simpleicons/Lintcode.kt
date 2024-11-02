package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Lintcode: ImageVector
    get() {
        if (_lintcode != null) {
            return _lintcode!!
        }
        _lintcode = Builder(name = "Lintcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.11f, 0.0f)
                lineTo(5.064f, 10.467f)
                lineToRelative(4.797f, 6.142f)
                lineToRelative(1.322f, -2.289f)
                lineToRelative(-3.149f, -4.032f)
                lineToRelative(4.722f, -8.184f)
                arcTo(902.354f, 902.354f, 0.0f, false, false, 11.11f, 0.0f)
                close()
                moveTo(14.139f, 7.391f)
                lineTo(12.817f, 9.68f)
                lineToRelative(3.148f, 4.032f)
                lineToRelative(-4.721f, 8.184f)
                curveToRelative(0.546f, 0.703f, 1.095f, 1.404f, 1.646f, 2.104f)
                lineToRelative(6.045f, -10.469f)
                lineToRelative(-4.796f, -6.14f)
                close()
            }
        }
        .build()
        return _lintcode!!
    }

private var _lintcode: ImageVector? = null
