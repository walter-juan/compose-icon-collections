package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SignNoLeftTurnFill: ImageVector
    get() {
        if (_signNoLeftTurnFill != null) {
            return _signNoLeftTurnFill!!
        }
        _signNoLeftTurnFill = Builder(name = "SignNoLeftTurnFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 13.293f, 2.0f)
                lineTo(9.195f, 6.099f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.5f, 6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 4.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, -0.192f)
                lineTo(4.23f, 6.308f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                lineToRelative(0.026f, 0.02f)
                close()
                moveTo(2.708f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 14.0f, 2.707f)
                lineToRelative(-3.885f, 3.884f)
                curveTo(10.656f, 7.05f, 11.0f, 7.735f, 11.0f, 8.5f)
                lineTo(11.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 8.5f)
                curveToRelative(0.0f, -0.489f, -0.234f, -0.923f, -0.596f, -1.197f)
                lineToRelative(-6.696f, 6.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.293f, 7.0f)
                lineTo(7.0f, 8.293f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _signNoLeftTurnFill!!
    }

private var _signNoLeftTurnFill: ImageVector? = null
