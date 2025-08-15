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

public val SolidGroup.BridgeCircleCheck: ImageVector
    get() {
        if (_bridgeCircleCheck != null) {
            return _bridgeCircleCheck!!
        }
        _bridgeCircleCheck = Builder(name = "BridgeCircleCheck", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(37.6f, 9.4f, 64.0f, 43.2f, 64.0f, 82.0f)
                lineToRelative(0.0f, 94.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(6.4f, 0.0f, 12.7f, 0.6f, 18.7f, 1.8f)
                curveToRelative(34.7f, -49.5f, 92.2f, -81.8f, 157.3f, -81.8f)
                curveToRelative(28.6f, 0.0f, 55.6f, 6.2f, 80.0f, 17.4f)
                lineToRelative(0.0f, -65.4f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 32.0f)
                close()
                moveTo(424.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(296.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(88.0f, 96.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(576.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(489.4f, 339.1f)
                curveToRelative(7.1f, 5.2f, 8.7f, 15.2f, 3.5f, 22.3f)
                lineToRelative(-64.0f, 88.0f)
                curveToRelative(-2.8f, 3.8f, -7.0f, 6.2f, -11.7f, 6.5f)
                reflectiveCurveToRelative(-9.3f, -1.3f, -12.6f, -4.6f)
                lineToRelative(-40.0f, -40.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(26.8f, 26.8f)
                lineToRelative(53.0f, -72.9f)
                curveToRelative(5.2f, -7.1f, 15.2f, -8.7f, 22.4f, -3.5f)
                close()
            }
        }
        .build()
        return _bridgeCircleCheck!!
    }

private var _bridgeCircleCheck: ImageVector? = null
