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

public val RegularGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(64.0f, 80.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(128.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(264.0f, 200.0f)
                curveToRelative(8.5f, 0.0f, 16.4f, 4.5f, 20.7f, 11.8f)
                lineToRelative(80.0f, 136.0f)
                curveToRelative(4.4f, 7.4f, 4.4f, 16.6f, 0.1f, 24.1f)
                reflectiveCurveTo(352.6f, 384.0f, 344.0f, 384.0f)
                lineToRelative(-240.0f, 0.0f)
                curveToRelative(-8.9f, 0.0f, -17.2f, -5.0f, -21.3f, -12.9f)
                reflectiveCurveToRelative(-3.5f, -17.5f, 1.6f, -24.8f)
                lineToRelative(56.0f, -80.0f)
                curveToRelative(4.5f, -6.4f, 11.8f, -10.2f, 19.7f, -10.2f)
                reflectiveCurveToRelative(15.2f, 3.8f, 19.7f, 10.2f)
                lineToRelative(17.2f, 24.6f)
                lineToRelative(46.5f, -79.0f)
                curveToRelative(4.3f, -7.3f, 12.2f, -11.8f, 20.7f, -11.8f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
