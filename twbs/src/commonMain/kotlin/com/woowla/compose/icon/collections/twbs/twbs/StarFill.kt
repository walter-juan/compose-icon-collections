package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.StarFill: ImageVector
    get() {
        if (_starFill != null) {
            return _starFill!!
        }
        _starFill = Builder(name = "StarFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.612f, 15.443f)
                curveToRelative(-0.386f, 0.198f, -0.824f, -0.149f, -0.746f, -0.592f)
                lineToRelative(0.83f, -4.73f)
                lineTo(0.173f, 6.765f)
                curveToRelative(-0.329f, -0.314f, -0.158f, -0.888f, 0.283f, -0.95f)
                lineToRelative(4.898f, -0.696f)
                lineTo(7.538f, 0.792f)
                curveToRelative(0.197f, -0.39f, 0.73f, -0.39f, 0.927f, 0.0f)
                lineToRelative(2.184f, 4.327f)
                lineToRelative(4.898f, 0.696f)
                curveToRelative(0.441f, 0.062f, 0.612f, 0.636f, 0.282f, 0.95f)
                lineToRelative(-3.522f, 3.356f)
                lineToRelative(0.83f, 4.73f)
                curveToRelative(0.078f, 0.443f, -0.36f, 0.79f, -0.746f, 0.592f)
                lineTo(8.0f, 13.187f)
                lineToRelative(-4.389f, 2.256f)
                close()
            }
        }
        .build()
        return _starFill!!
    }

private var _starFill: ImageVector? = null
