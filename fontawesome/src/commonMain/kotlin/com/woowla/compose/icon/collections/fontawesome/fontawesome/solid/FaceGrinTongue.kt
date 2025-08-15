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

public val SolidGroup.FaceGrinTongue: ImageVector
    get() {
        if (_faceGrinTongue != null) {
            return _faceGrinTongue!!
        }
        _faceGrinTongue = Builder(name = "FaceGrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, 104.4f, 62.5f, 194.2f, 152.2f, 234.1f)
                curveToRelative(-5.3f, -13.0f, -8.2f, -27.2f, -8.2f, -42.1f)
                lineToRelative(0.0f, -61.7f)
                curveToRelative(-16.9f, -16.5f, -30.1f, -36.7f, -38.3f, -59.3f)
                curveToRelative(-4.3f, -11.8f, 7.7f, -21.8f, 19.6f, -18.1f)
                curveToRelative(39.2f, 12.2f, 83.7f, 19.1f, 130.7f, 19.1f)
                reflectiveCurveToRelative(91.5f, -6.9f, 130.7f, -19.1f)
                curveToRelative(11.9f, -3.7f, 23.9f, 6.3f, 19.6f, 18.1f)
                curveToRelative(-8.3f, 22.6f, -21.5f, 42.8f, -38.3f, 59.3f)
                lineToRelative(0.0f, 61.7f)
                curveToRelative(0.0f, 14.9f, -2.9f, 29.1f, -8.2f, 42.1f)
                curveToRelative(89.7f, -39.8f, 152.2f, -129.6f, 152.2f, -234.1f)
                curveToRelative(0.0f, -141.4f, -114.6f, -256.0f, -256.0f, -256.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 448.0f)
                lineToRelative(0.0f, -45.4f)
                curveToRelative(0.0f, -14.7f, -11.9f, -26.6f, -26.6f, -26.6f)
                lineToRelative(-2.0f, 0.0f)
                curveToRelative(-11.3f, 0.0f, -21.1f, 7.9f, -23.6f, 18.9f)
                curveToRelative(-2.8f, 12.6f, -20.8f, 12.6f, -23.6f, 0.0f)
                curveToRelative(-2.5f, -11.1f, -12.3f, -18.9f, -23.6f, -18.9f)
                lineToRelative(-2.0f, 0.0f)
                curveToRelative(-14.7f, 0.0f, -26.6f, 11.9f, -26.6f, 26.6f)
                lineToRelative(0.0f, 45.4f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrinTongue!!
    }

private var _faceGrinTongue: ImageVector? = null
