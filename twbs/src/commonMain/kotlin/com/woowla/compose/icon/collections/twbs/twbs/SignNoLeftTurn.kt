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

public val Twbs.SignNoLeftTurn: ImageVector
    get() {
        if (_signNoLeftTurn != null) {
            return _signNoLeftTurn!!
        }
        _signNoLeftTurn = Builder(name = "SignNoLeftTurn", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f)
                moveToRelative(3.416f, 5.29f)
                lineToRelative(5.988f, -5.987f)
                curveToRelative(0.362f, 0.274f, 0.596f, 0.708f, 0.596f, 1.197f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 8.5f)
                curveToRelative(0.0f, -0.765f, -0.344f, -1.45f, -0.885f, -1.908f)
                lineToRelative(3.176f, -3.176f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -9.874f, 9.874f)
                close()
                moveTo(2.709f, 12.584f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.874f, -9.874f)
                lineTo(9.196f, 6.097f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.5f, 6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 4.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, -0.192f)
                lineTo(4.23f, 6.308f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                lineToRelative(0.026f, 0.02f)
                close()
                moveTo(8.293f, 7.0f)
                lineTo(7.0f, 8.293f)
                lineTo(7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _signNoLeftTurn!!
    }

private var _signNoLeftTurn: ImageVector? = null
