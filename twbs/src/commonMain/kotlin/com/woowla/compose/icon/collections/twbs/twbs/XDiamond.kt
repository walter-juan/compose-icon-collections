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

public val Twbs.XDiamond: ImageVector
    get() {
        if (_xDiamond != null) {
            return _xDiamond!!
        }
        _xDiamond = Builder(name = "XDiamond", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.987f, 16.0f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -1.07f, -0.448f)
                lineTo(0.45f, 9.082f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 0.0f, -2.165f)
                lineTo(6.917f, 0.45f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 2.166f, 0.0f)
                lineToRelative(6.469f, 6.468f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 16.0f, 8.013f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -0.448f, 1.07f)
                lineToRelative(-6.47f, 6.469f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 7.988f, 16.0f)
                close()
                moveTo(7.639f, 1.17f)
                lineTo(4.766f, 4.044f)
                lineTo(8.0f, 7.278f)
                lineToRelative(3.234f, -3.234f)
                lineTo(8.361f, 1.17f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, -0.722f, 0.0f)
                moveTo(8.722f, 8.0f)
                lineToRelative(3.234f, 3.234f)
                lineToRelative(2.873f, -2.873f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.523f, 0.0f, -0.722f)
                lineToRelative(-2.873f, -2.873f)
                close()
                moveTo(8.0f, 8.722f)
                lineToRelative(-3.234f, 3.234f)
                lineToRelative(2.873f, 2.873f)
                curveToRelative(0.2f, 0.2f, 0.523f, 0.2f, 0.722f, 0.0f)
                lineToRelative(2.873f, -2.873f)
                close()
                moveTo(7.278f, 8.0f)
                lineTo(4.044f, 4.766f)
                lineTo(1.17f, 7.639f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.0f, 0.722f)
                lineToRelative(2.874f, 2.873f)
                close()
            }
        }
        .build()
        return _xDiamond!!
    }

private var _xDiamond: ImageVector? = null
