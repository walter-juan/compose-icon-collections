package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FaceGrinTongue: ImageVector
    get() {
        if (_faceGrinTongue != null) {
            return _faceGrinTongue!!
        }
        _faceGrinTongue = Builder(name = "FaceGrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.9f, -93.1f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.1f, 48.0f, 256.0f)
                curveToRelative(0.0f, 74.1f, 38.8f, 139.2f, 97.1f, 176.0f)
                curveToRelative(-0.7f, -5.2f, -1.1f, -10.6f, -1.1f, -16.0f)
                lineToRelative(0.0f, -53.5f)
                curveToRelative(-10.2f, -12.6f, -18.3f, -26.9f, -23.8f, -42.4f)
                curveToRelative(-4.1f, -11.6f, 7.8f, -21.4f, 19.6f, -17.8f)
                curveToRelative(34.7f, 10.6f, 74.2f, 16.5f, 116.1f, 16.5f)
                curveToRelative(42.0f, 0.0f, 81.5f, -6.0f, 116.3f, -16.6f)
                curveToRelative(11.8f, -3.6f, 23.7f, 6.1f, 19.6f, 17.8f)
                curveToRelative(-5.5f, 15.6f, -13.6f, 29.9f, -23.8f, 42.5f)
                lineToRelative(0.0f, 53.5f)
                curveToRelative(0.0f, 5.4f, -0.4f, 10.8f, -1.1f, 16.0f)
                curveToRelative(58.4f, -36.8f, 97.1f, -101.9f, 97.1f, -176.0f)
                close()
                moveTo(512.0f, 256.0f)
                curveToRelative(0.0f, 116.3f, -77.6f, 214.6f, -183.9f, 245.7f)
                curveToRelative(-19.5f, 16.4f, -44.6f, 26.3f, -72.1f, 26.3f)
                reflectiveCurveToRelative(-52.6f, -9.9f, -72.1f, -26.3f)
                curveTo(77.6f, 470.6f, 0.0f, 372.3f, 0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 114.6f, 512.0f, 256.0f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 416.0f)
                lineToRelative(0.0f, -37.4f)
                curveToRelative(0.0f, -14.7f, -11.9f, -26.6f, -26.6f, -26.6f)
                lineToRelative(-2.0f, 0.0f)
                curveToRelative(-11.3f, 0.0f, -21.1f, 7.9f, -23.6f, 18.9f)
                curveToRelative(-2.8f, 12.6f, -20.8f, 12.6f, -23.6f, 0.0f)
                curveToRelative(-2.5f, -11.1f, -12.3f, -18.9f, -23.6f, -18.9f)
                lineToRelative(-2.0f, 0.0f)
                curveToRelative(-14.7f, 0.0f, -26.6f, 11.9f, -26.6f, 26.6f)
                lineToRelative(0.0f, 37.4f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrinTongue!!
    }

private var _faceGrinTongue: ImageVector? = null
