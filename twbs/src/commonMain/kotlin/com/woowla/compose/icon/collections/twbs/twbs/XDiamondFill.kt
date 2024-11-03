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

public val Twbs.XDiamondFill: ImageVector
    get() {
        if (_xDiamondFill != null) {
            return _xDiamondFill!!
        }
        _xDiamondFill = Builder(name = "XDiamondFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0.0f)
                lineTo(4.047f, 3.339f)
                lineTo(8.0f, 7.293f)
                lineToRelative(3.954f, -3.954f)
                lineTo(9.049f, 0.435f)
                close()
                moveTo(12.66f, 4.046f)
                lineTo(8.708f, 8.0f)
                lineToRelative(3.954f, 3.954f)
                lineToRelative(2.904f, -2.905f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0.0f, -2.098f)
                lineToRelative(-2.904f, -2.905f)
                close()
                moveTo(11.954f, 12.66f)
                lineTo(8.0f, 8.708f)
                lineToRelative(-3.954f, 3.954f)
                lineToRelative(2.905f, 2.904f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0.0f)
                lineToRelative(2.905f, -2.904f)
                close()
                moveTo(3.34f, 11.954f)
                lineTo(7.292f, 8.0f)
                lineTo(3.339f, 4.046f)
                lineTo(0.435f, 6.951f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0.0f, 2.098f)
                close()
            }
        }
        .build()
        return _xDiamondFill!!
    }

private var _xDiamondFill: ImageVector? = null
