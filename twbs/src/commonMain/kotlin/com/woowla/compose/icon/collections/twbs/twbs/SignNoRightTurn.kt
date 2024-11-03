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

public val Twbs.SignNoRightTurn: ImageVector
    get() {
        if (_signNoRightTurn != null) {
            return _signNoRightTurn!!
        }
        _signNoRightTurn = Builder(name = "SignNoRightTurn", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-3.416f, 5.29f)
                lineTo(6.596f, 7.304f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 8.5f)
                lineTo(6.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 8.5f)
                curveToRelative(0.0f, -0.765f, 0.344f, -1.45f, 0.885f, -1.908f)
                lineTo(2.709f, 3.416f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.874f, 9.874f)
                close()
                moveTo(13.291f, 12.584f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 3.417f, 2.71f)
                lineToRelative(3.388f, 3.388f)
                quadTo(7.137f, 6.001f, 7.5f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineTo(9.41f, 8.658f)
                lineToRelative(-0.026f, 0.02f)
                close()
                moveTo(7.707f, 7.0f)
                lineTo(9.0f, 8.293f)
                lineTo(9.0f, 7.0f)
                close()
            }
        }
        .build()
        return _signNoRightTurn!!
    }

private var _signNoRightTurn: ImageVector? = null
