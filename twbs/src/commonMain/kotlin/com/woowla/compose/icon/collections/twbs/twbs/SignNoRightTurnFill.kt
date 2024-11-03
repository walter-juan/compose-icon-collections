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

public val Twbs.SignNoRightTurnFill: ImageVector
    get() {
        if (_signNoRightTurnFill != null) {
            return _signNoRightTurnFill!!
        }
        _signNoRightTurnFill = Builder(name = "SignNoRightTurnFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.707f, 2.0f)
                lineToRelative(4.097f, 4.098f)
                quadTo(7.137f, 6.001f, 7.5f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineTo(9.41f, 8.658f)
                lineToRelative(-0.026f, 0.02f)
                close()
                moveTo(13.292f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.0f, 2.707f)
                lineToRelative(3.885f, 3.884f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 8.5f)
                lineTo(5.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 8.5f)
                curveToRelative(0.0f, -0.489f, 0.234f, -0.923f, 0.596f, -1.197f)
                lineToRelative(6.696f, 6.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.707f, 7.0f)
                lineTo(9.0f, 8.293f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _signNoRightTurnFill!!
    }

private var _signNoRightTurnFill: ImageVector? = null
