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

public val SolidGroup.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(539.9f, 352.0f)
                lineToRelative(-95.6f, 0.0f)
                lineToRelative(-8.4f, -66.1f)
                curveToRelative(-2.9f, -23.2f, -15.9f, -43.9f, -35.4f, -56.8f)
                lineTo(252.2f, 131.5f)
                curveToRelative(-18.0f, -11.9f, -39.7f, -15.7f, -60.1f, -11.5f)
                curveToRelative(2.5f, -4.3f, 5.9f, -7.9f, 10.1f, -10.7f)
                lineTo(350.6f, 11.6f)
                curveToRelative(10.7f, -7.0f, 24.5f, -7.0f, 35.2f, 0.0f)
                lineToRelative(148.4f, 97.7f)
                curveToRelative(7.8f, 5.1f, 13.0f, 13.4f, 14.2f, 22.7f)
                lineToRelative(23.3f, 184.0f)
                curveToRelative(2.4f, 19.1f, -12.5f, 36.0f, -31.7f, 36.0f)
                close()
                moveTo(4.8f, 476.0f)
                lineToRelative(23.3f, -184.0f)
                curveToRelative(1.2f, -9.3f, 6.3f, -17.6f, 14.2f, -22.7f)
                lineToRelative(148.4f, -97.7f)
                curveToRelative(10.7f, -7.0f, 24.5f, -7.0f, 35.2f, 0.0f)
                lineToRelative(148.4f, 97.7f)
                curveToRelative(7.8f, 5.1f, 13.0f, 13.4f, 14.2f, 22.7f)
                lineToRelative(23.3f, 184.0f)
                curveToRelative(2.4f, 19.1f, -12.5f, 36.0f, -31.7f, 36.0f)
                lineToRelative(-49.7f, 0.0f)
                curveToRelative(-11.2f, 0.0f, -21.5f, -5.8f, -27.3f, -15.4f)
                lineToRelative(-77.0f, -126.7f)
                curveToRelative(-1.7f, -2.8f, -4.8f, -4.6f, -8.1f, -4.6f)
                curveToRelative(-5.3f, 0.0f, -9.5f, 4.3f, -9.5f, 9.5f)
                lineToRelative(0.0f, 105.2f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(36.5f, 512.0f)
                curveToRelative(-19.3f, 0.0f, -34.2f, -16.9f, -31.7f, -36.0f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
