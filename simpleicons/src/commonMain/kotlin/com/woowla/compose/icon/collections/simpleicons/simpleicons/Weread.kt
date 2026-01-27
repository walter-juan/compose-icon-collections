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

public val Simpleicons.Weread: ImageVector
    get() {
        if (_weread != null) {
            return _weread!!
        }
        _weread = Builder(name = "Weread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.12f, 0.0f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 0.0f, 5.12f)
                verticalLineToRelative(13.76f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 5.12f, 24.0f)
                horizontalLineToRelative(13.76f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 24.0f, 18.88f)
                lineTo(24.0f, 5.12f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 18.88f, 0.0f)
                close()
                moveTo(18.074f, 10.24f)
                curveToRelative(2.04f, 0.0f, 3.694f, 1.39f, 3.694f, 3.107f)
                curveToRelative(0.0f, 1.716f, -1.653f, 3.107f, -3.694f, 3.107f)
                curveToRelative(-0.43f, 0.0f, -0.842f, -0.063f, -1.226f, -0.177f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.29f, 0.032f)
                lineToRelative(-0.794f, 0.463f)
                arcToRelative(0.123f, 0.123f, 0.0f, false, true, -0.18f, -0.14f)
                lineToRelative(0.177f, -0.668f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.098f, -0.267f)
                curveToRelative(-0.785f, -0.57f, -1.284f, -1.41f, -1.284f, -2.35f)
                curveToRelative(0.0f, -1.716f, 1.655f, -3.107f, 3.695f, -3.107f)
                moveToRelative(-1.231f, 1.616f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.493f, 0.497f)
                curveToRelative(0.0f, 0.274f, 0.22f, 0.497f, 0.493f, 0.497f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.492f, -0.497f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.492f, -0.497f)
                moveToRelative(2.462f, 0.0f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.492f, 0.497f)
                curveToRelative(0.0f, 0.274f, 0.22f, 0.497f, 0.492f, 0.497f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.493f, -0.497f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.493f, -0.497f)
                moveTo(18.08f, 18.88f)
                horizontalLineToRelative(5.12f)
                curveToRelative(0.0f, 2.4f, -1.92f, 4.32f, -4.32f, 4.32f)
                lineTo(5.12f, 23.2f)
                curveTo(2.72f, 23.2f, 0.8f, 21.28f, 0.8f, 18.88f)
                horizontalLineToRelative(5.12f)
                curveToRelative(1.6f, 0.0f, 3.914f, -0.012f, 5.28f, 1.28f)
                curveToRelative(0.489f, 0.462f, 0.677f, 1.17f, 0.798f, 1.17f)
                curveToRelative(0.12f, 0.0f, 0.292f, -0.671f, 0.802f, -1.17f)
                curveToRelative(1.305f, -1.275f, 3.215f, -1.28f, 5.28f, -1.28f)
            }
        }
        .build()
        return _weread!!
    }

private var _weread: ImageVector? = null
