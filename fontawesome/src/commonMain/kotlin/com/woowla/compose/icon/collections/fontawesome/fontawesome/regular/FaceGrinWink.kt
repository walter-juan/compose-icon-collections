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

public val RegularGroup.FaceGrinWink: ImageVector
    get() {
        if (_faceGrinWink != null) {
            return _faceGrinWink!!
        }
        _faceGrinWink = Builder(name = "FaceGrinWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(349.5f, 308.4f)
                curveToRelative(18.7f, -4.4f, 35.9f, 12.0f, 25.5f, 28.1f)
                curveTo(350.4f, 374.6f, 306.3f, 400.0f, 255.9f, 400.0f)
                reflectiveCurveToRelative(-94.5f, -25.4f, -119.1f, -63.5f)
                curveToRelative(-10.4f, -16.1f, 6.8f, -32.5f, 25.5f, -28.1f)
                curveToRelative(28.9f, 6.8f, 60.5f, 10.5f, 93.6f, 10.5f)
                reflectiveCurveToRelative(64.7f, -3.7f, 93.6f, -10.5f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(310.2f, 229.7f)
                curveToRelative(-7.6f, 8.1f, -20.2f, 8.5f, -28.3f, 0.9f)
                reflectiveCurveToRelative(-8.5f, -20.2f, -0.9f, -28.3f)
                curveToRelative(14.5f, -15.5f, 35.2f, -22.3f, 54.6f, -22.3f)
                reflectiveCurveToRelative(40.1f, 6.8f, 54.6f, 22.3f)
                curveToRelative(7.6f, 8.1f, 7.1f, 20.7f, -0.9f, 28.3f)
                reflectiveCurveToRelative(-20.7f, 7.1f, -28.3f, -0.9f)
                curveToRelative(-5.5f, -5.8f, -14.8f, -9.7f, -25.4f, -9.7f)
                reflectiveCurveToRelative(-19.9f, 3.8f, -25.4f, 9.7f)
                close()
            }
        }
        .build()
        return _faceGrinWink!!
    }

private var _faceGrinWink: ImageVector? = null
