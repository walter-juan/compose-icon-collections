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

public val SolidGroup.HeadSideCough: ImageVector
    get() {
        if (_headSideCough != null) {
            return _headSideCough!!
        }
        _headSideCough = Builder(name = "HeadSideCough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 512.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(1.0f, 0.0f)
                curveToRelative(26.0f, 0.0f, 47.0f, -21.0f, 47.0f, -47.0f)
                curveToRelative(0.0f, -11.0f, -3.9f, -21.6f, -10.9f, -30.1f)
                lineTo(273.3f, 200.0f)
                curveTo(271.4f, 197.6f, 270.1f, 194.7f, 269.7f, 191.7f)
                curveTo(254.0f, 83.3f, 160.7f, 0.0f, 48.0f, 0.0f)
                curveTo(40.4f, 0.0f, 32.9f, 0.4f, 25.4f, 1.1f)
                curveTo(10.5f, 2.6f, 0.0f, 15.9f, 0.0f, 30.9f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(112.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(175.1f, 429.2f)
                lineToRelative(-41.5f, -3.5f)
                curveToRelative(-12.2f, -1.0f, -21.6f, -11.2f, -21.6f, -23.4f)
                curveToRelative(0.0f, -10.8f, 7.3f, -20.2f, 17.8f, -22.8f)
                lineToRelative(40.4f, -10.1f)
                curveToRelative(19.2f, -4.8f, 37.8f, 9.7f, 37.8f, 29.5f)
                curveToRelative(0.0f, 17.8f, -15.2f, 31.8f, -32.9f, 30.3f)
                close()
                moveTo(480.0f, 312.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(440.0f, 336.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(376.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(504.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(480.0f, 504.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(440.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _headSideCough!!
    }

private var _headSideCough: ImageVector? = null
