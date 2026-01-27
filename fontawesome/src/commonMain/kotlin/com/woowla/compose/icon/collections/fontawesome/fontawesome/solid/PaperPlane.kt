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

public val SolidGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(536.4f, -26.3f)
                curveToRelative(9.8f, -3.5f, 20.6f, -1.0f, 28.0f, 6.3f)
                reflectiveCurveToRelative(9.8f, 18.2f, 6.3f, 28.0f)
                lineToRelative(-178.0f, 496.9f)
                curveToRelative(-5.0f, 13.9f, -18.1f, 23.1f, -32.8f, 23.1f)
                curveToRelative(-14.2f, 0.0f, -27.0f, -8.6f, -32.3f, -21.7f)
                lineToRelative(-64.2f, -158.0f)
                curveToRelative(-4.5f, -11.0f, -2.5f, -23.6f, 5.2f, -32.6f)
                lineToRelative(94.5f, -112.4f)
                curveToRelative(5.1f, -6.1f, 4.7f, -15.0f, -0.9f, -20.6f)
                reflectiveCurveToRelative(-14.6f, -6.0f, -20.6f, -0.9f)
                lineTo(229.2f, 276.1f)
                curveToRelative(-9.1f, 7.6f, -21.6f, 9.6f, -32.6f, 5.2f)
                lineTo(38.1f, 216.8f)
                curveToRelative(-13.1f, -5.3f, -21.7f, -18.1f, -21.7f, -32.3f)
                curveToRelative(0.0f, -14.7f, 9.2f, -27.8f, 23.1f, -32.8f)
                lineToRelative(496.9f, -178.0f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
