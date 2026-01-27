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

public val SolidGroup.ShareFromSquare: ImageVector
    get() {
        if (_shareFromSquare != null) {
            return _shareFromSquare!!
        }
        _shareFromSquare = Builder(name = "ShareFromSquare", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.5f, 24.0f)
                lineToRelative(0.0f, 72.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 93.4f, 82.8f, 134.8f, 100.6f, 142.6f)
                curveToRelative(2.2f, 1.0f, 4.6f, 1.4f, 7.1f, 1.4f)
                lineToRelative(2.5f, 0.0f)
                curveToRelative(9.8f, 0.0f, 17.8f, -8.0f, 17.8f, -17.8f)
                curveToRelative(0.0f, -8.3f, -5.9f, -15.5f, -12.8f, -20.3f)
                curveToRelative(-8.9f, -6.2f, -19.2f, -18.2f, -19.2f, -40.5f)
                curveToRelative(0.0f, -45.0f, 36.5f, -81.5f, 81.5f, -81.5f)
                lineToRelative(30.5f, 0.0f)
                lineToRelative(0.0f, 72.0f)
                curveToRelative(0.0f, 9.7f, 5.8f, 18.5f, 14.8f, 22.2f)
                reflectiveCurveToRelative(19.3f, 1.7f, 26.2f, -5.2f)
                lineToRelative(136.0f, -136.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(425.5f, 7.0f)
                curveToRelative(-6.9f, -6.9f, -17.2f, -8.9f, -26.2f, -5.2f)
                reflectiveCurveTo(384.5f, 14.3f, 384.5f, 24.0f)
                close()
                moveTo(112.5f, 96.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shareFromSquare!!
    }

private var _shareFromSquare: ImageVector? = null
