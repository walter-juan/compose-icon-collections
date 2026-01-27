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

public val RegularGroup.FaceSadTear: ImageVector
    get() {
        if (_faceSadTear != null) {
            return _faceSadTear!!
        }
        _faceSadTear = Builder(name = "FaceSadTear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.9f, -93.1f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.1f, 48.0f, 256.0f)
                curveToRelative(0.0f, 41.8f, 12.3f, 80.7f, 33.6f, 113.3f)
                curveToRelative(8.2f, 44.7f, 47.3f, 78.6f, 94.3f, 78.7f)
                curveToRelative(24.7f, 10.3f, 51.7f, 16.0f, 80.1f, 16.0f)
                curveToRelative(114.9f, 0.0f, 208.0f, -93.1f, 208.0f, -208.0f)
                close()
                moveTo(288.0f, 352.0f)
                curveToRelative(-5.5f, 0.0f, -10.9f, 0.6f, -16.0f, 1.8f)
                curveToRelative(0.0f, -0.6f, 0.0f, -1.2f, 0.0f, -1.8f)
                curveToRelative(0.0f, -16.2f, -4.0f, -31.5f, -11.1f, -44.9f)
                curveToRelative(8.7f, -2.0f, 17.8f, -3.1f, 27.1f, -3.1f)
                curveToRelative(40.2f, 0.0f, 75.7f, 19.8f, 97.5f, 50.0f)
                curveToRelative(7.7f, 10.8f, 5.3f, 25.8f, -5.5f, 33.5f)
                reflectiveCurveToRelative(-25.8f, 5.3f, -33.5f, -5.5f)
                curveToRelative(-13.1f, -18.2f, -34.4f, -30.0f, -58.5f, -30.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(185.4f, 276.8f)
                curveToRelative(6.5f, 7.8f, 12.6f, 16.1f, 18.3f, 24.6f)
                curveToRelative(9.0f, 13.4f, 20.3f, 30.2f, 20.3f, 47.4f)
                curveToRelative(0.0f, 28.3f, -21.5f, 51.2f, -48.0f, 51.2f)
                reflectiveCurveToRelative(-48.0f, -22.9f, -48.0f, -51.2f)
                curveToRelative(0.0f, -17.2f, 11.2f, -34.0f, 20.3f, -47.4f)
                curveToRelative(5.7f, -8.5f, 11.9f, -16.7f, 18.3f, -24.6f)
                curveToRelative(2.4f, -2.9f, 5.7f, -4.8f, 9.4f, -4.8f)
                reflectiveCurveToRelative(7.0f, 1.9f, 9.4f, 4.8f)
                close()
            }
        }
        .build()
        return _faceSadTear!!
    }

private var _faceSadTear: ImageVector? = null
