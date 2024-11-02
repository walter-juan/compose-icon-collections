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

public val Simpleicons.Iberia: ImageVector
    get() {
        if (_iberia != null) {
            return _iberia!!
        }
        _iberia = Builder(name = "Iberia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.356f, 11.563f)
                curveToRelative(4.53f, -3.254f, 9.047f, -5.217f, 13.547f, -5.723f)
                lineTo(24.0f, 2.978f)
                curveToRelative(-6.662f, 0.0f, -7.57f, 1.457f, -9.873f, 3.752f)
                moveTo(0.0f, 21.021f)
                curveToRelative(14.719f, 0.0f, 18.189f, -3.46f, 20.213f, -8.17f)
                lineToRelative(1.7f, -4.434f)
                curveToRelative(-4.958f, 0.143f, -12.441f, 3.066f, -17.673f, 8.324f)
            }
        }
        .build()
        return _iberia!!
    }

private var _iberia: ImageVector? = null
