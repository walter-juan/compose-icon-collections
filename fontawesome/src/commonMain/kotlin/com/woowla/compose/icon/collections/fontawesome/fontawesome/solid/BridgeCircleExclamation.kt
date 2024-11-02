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

public val SolidGroup.BridgeCircleExclamation: ImageVector
    get() {
        if (_bridgeCircleExclamation != null) {
            return _bridgeCircleExclamation!!
        }
        _bridgeCircleExclamation = Builder(name = "BridgeCircleExclamation", defaultWidth =
                640.0.dp, defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(6.3f, 0.0f, 12.4f, 0.6f, 18.3f, 1.7f)
                curveTo(367.1f, 231.8f, 426.9f, 192.0f, 496.0f, 192.0f)
                curveToRelative(42.5f, 0.0f, 81.6f, 15.1f, 112.0f, 40.2f)
                lineToRelative(0.0f, -72.2f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(488.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(360.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(232.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(496.0f, 512.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(496.0f, 416.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(496.0f, 272.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _bridgeCircleExclamation!!
    }

private var _bridgeCircleExclamation: ImageVector? = null
