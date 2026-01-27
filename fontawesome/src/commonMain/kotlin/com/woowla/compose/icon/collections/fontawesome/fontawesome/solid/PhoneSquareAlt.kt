package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PhoneSquareAlt: ImageVector
    get() {
        if (_phoneSquareAlt != null) {
            return _phoneSquareAlt!!
        }
        _phoneSquareAlt = Builder(name = "PhoneSquareAlt", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(296.0f, 128.7f)
                lineToRelative(2.8f, 0.8f)
                curveToRelative(32.3f, 8.8f, 59.9f, 40.1f, 51.8f, 78.2f)
                curveToRelative(-18.5f, 87.5f, -87.4f, 156.3f, -174.9f, 174.9f)
                curveToRelative(-38.1f, 8.1f, -69.4f, -19.5f, -78.2f, -51.8f)
                lineToRelative(-0.8f, -2.8f)
                curveToRelative(-2.7f, -9.8f, 2.4f, -20.1f, 11.8f, -24.0f)
                lineToRelative(48.7f, -20.3f)
                curveToRelative(8.3f, -3.4f, 17.8f, -1.1f, 23.5f, 5.9f)
                lineToRelative(19.3f, 23.6f)
                curveToRelative(35.1f, -17.4f, 63.4f, -46.6f, 79.6f, -82.4f)
                lineToRelative(-22.1f, -18.0f)
                curveToRelative(-6.9f, -5.7f, -9.3f, -15.2f, -5.9f, -23.5f)
                lineToRelative(20.3f, -48.7f)
                curveToRelative(3.9f, -9.4f, 14.2f, -14.4f, 24.0f, -11.8f)
                close()
            }
        }
        .build()
        return _phoneSquareAlt!!
    }

private var _phoneSquareAlt: ImageVector? = null
