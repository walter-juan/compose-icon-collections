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

public val Simpleicons.Nordvpn: ImageVector
    get() {
        if (_nordvpn != null) {
            return _nordvpn!!
        }
        _nordvpn = Builder(name = "Nordvpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.284f, 21.541f)
                arcTo(11.987f, 11.987f, 0.0f, false, true, 0.0f, 14.483f)
                curveTo(0.0f, 7.842f, 5.373f, 2.459f, 12.0f, 2.459f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.383f, 12.0f, 12.025f)
                arcToRelative(11.985f, 11.985f, 0.0f, false, true, -2.284f, 7.058f)
                lineToRelative(-5.764f, -9.378f)
                lineToRelative(-0.557f, 0.942f)
                lineToRelative(0.564f, 2.619f)
                lineTo(12.0f, 8.934f)
                lineToRelative(-2.45f, 4.145f)
                lineToRelative(0.571f, 2.645f)
                lineToRelative(-2.076f, -3.556f)
                lineToRelative(-5.76f, 9.373f)
                close()
            }
        }
        .build()
        return _nordvpn!!
    }

private var _nordvpn: ImageVector? = null
