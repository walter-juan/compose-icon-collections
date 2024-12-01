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

public val Simpleicons.Htcvive: ImageVector
    get() {
        if (_htcvive != null) {
            return _htcvive!!
        }
        _htcvive = Builder(name = "Htcvive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.225f, 19.046f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -4.222f, 0.642f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -4.223f, -0.642f)
                curveToRelative(-1.56f, -0.505f, -2.525f, -2.066f, -2.203f, -3.672f)
                curveToRelative(0.596f, -2.938f, 2.111f, -5.508f, 4.268f, -7.482f)
                arcToRelative(3.19f, 3.19f, 0.0f, false, true, 4.36f, 0.0f)
                curveToRelative(2.112f, 1.928f, 3.627f, 4.544f, 4.27f, 7.482f)
                curveToRelative(0.275f, 1.606f, -0.643f, 3.213f, -2.25f, 3.672f)
                moveToRelative(7.574f, -1.47f)
                lineTo(14.894f, 2.2f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.33f, -0.78f)
                horizontalLineToRelative(-3.076f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.331f, 0.78f)
                lineTo(0.207f, 17.577f)
                curveToRelative(-0.276f, 0.505f, -0.276f, 1.101f, 0.0f, 1.56f)
                lineToRelative(1.56f, 2.663f)
                curveToRelative(0.276f, 0.504f, 0.78f, 0.78f, 1.331f, 0.78f)
                horizontalLineToRelative(17.763f)
                curveToRelative(0.551f, 0.0f, 1.056f, -0.276f, 1.331f, -0.78f)
                lineToRelative(1.561f, -2.663f)
                curveToRelative(0.321f, -0.505f, 0.321f, -1.101f, 0.046f, -1.56f)
            }
        }
        .build()
        return _htcvive!!
    }

private var _htcvive: ImageVector? = null
