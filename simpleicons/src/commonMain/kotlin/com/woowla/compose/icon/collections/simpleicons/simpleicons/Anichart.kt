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

public val Simpleicons.Anichart: ImageVector
    get() {
        if (_anichart != null) {
            return _anichart!!
        }
        _anichart = Builder(name = "Anichart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.293f, 2.951f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -5.162f, 1.62f)
                lineToRelative(1.572f, 4.483f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, true, 3.596f, -1.706f)
                curveToRelative(1.068f, 0.0f, 2.113f, 0.364f, 2.935f, 1.045f)
                curveToRelative(0.51f, 0.41f, 0.957f, 0.487f, 1.468f, 0.07f)
                lineToRelative(1.837f, -1.438f)
                curveToRelative(0.552f, -0.44f, 0.622f, -0.98f, 0.135f, -1.467f)
                arcToRelative(9.12f, 9.12f, 0.0f, false, false, -6.38f, -2.607f)
                moveTo(6.3f, 3.127f)
                lineTo(0.0f, 21.05f)
                horizontalLineToRelative(4.89f)
                lineToRelative(1.068f, -3.1f)
                horizontalLineToRelative(5.33f)
                lineToRelative(1.04f, 3.1f)
                horizontalLineToRelative(4.871f)
                lineTo(10.92f, 3.127f)
                close()
                moveTo(8.6f, 9.009f)
                lineTo(10.274f, 13.975f)
                horizontalLineToRelative(-3.2f)
                close()
                moveTo(20.986f, 15.327f)
                curveToRelative(-0.272f, -0.014f, -0.544f, 0.103f, -0.845f, 0.327f)
                curveToRelative(-0.81f, 0.646f, -1.808f, 0.98f, -2.841f, 0.98f)
                quadToRelative(-0.502f, 0.0f, -0.976f, -0.102f)
                lineToRelative(1.58f, 4.508f)
                arcToRelative(9.13f, 9.13f, 0.0f, false, false, 5.583f, -2.421f)
                curveToRelative(0.517f, -0.494f, 0.446f, -1.057f, -0.058f, -1.497f)
                lineToRelative(-1.797f, -1.515f)
                curveToRelative(-0.223f, -0.18f, -0.434f, -0.27f, -0.646f, -0.28f)
            }
        }
        .build()
        return _anichart!!
    }

private var _anichart: ImageVector? = null
