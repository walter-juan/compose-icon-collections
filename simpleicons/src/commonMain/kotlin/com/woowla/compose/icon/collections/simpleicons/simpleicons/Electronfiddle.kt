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

public val Simpleicons.Electronfiddle: ImageVector
    get() {
        if (_electronfiddle != null) {
            return _electronfiddle!!
        }
        _electronfiddle = Builder(name = "Electronfiddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                curveToRelative(-0.631f, 0.0f, -1.143f, 0.512f, -1.143f, 1.143f)
                verticalLineToRelative(13.858f)
                curveToRelative(-1.972f, 0.507f, -3.428f, 2.297f, -3.428f, 4.427f)
                curveTo(3.429f, 21.953f, 5.475f, 24.0f, 8.0f, 24.0f)
                curveToRelative(2.525f, 0.0f, 4.571f, -2.047f, 4.571f, -4.571f)
                curveToRelative(0.0f, -2.13f, -1.457f, -3.92f, -3.428f, -4.427f)
                verticalLineToRelative(-4.715f)
                horizontalLineToRelative(4.735f)
                curveToRelative(0.541f, 0.0f, 0.98f, -0.512f, 0.98f, -1.143f)
                curveToRelative(0.0f, -0.631f, -0.439f, -1.143f, -0.98f, -1.143f)
                lineTo(9.143f, 8.0f)
                lineTo(9.143f, 2.286f)
                horizontalLineToRelative(10.286f)
                curveToRelative(0.631f, 0.0f, 1.143f, -0.512f, 1.143f, -1.143f)
                curveTo(20.571f, 0.512f, 20.06f, 0.0f, 19.429f, 0.0f)
                close()
                moveTo(8.0f, 17.143f)
                curveToRelative(1.262f, 0.0f, 2.286f, 1.023f, 2.286f, 2.286f)
                curveToRelative(0.0f, 1.262f, -1.023f, 2.286f, -2.286f, 2.286f)
                curveToRelative(-1.262f, 0.0f, -2.286f, -1.023f, -2.286f, -2.286f)
                curveToRelative(0.0f, -1.262f, 1.023f, -2.286f, 2.286f, -2.286f)
                close()
            }
        }
        .build()
        return _electronfiddle!!
    }

private var _electronfiddle: ImageVector? = null
