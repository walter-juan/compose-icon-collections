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

public val SolidGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(272.0f, 224.0f)
                curveToRelative(8.4f, 0.0f, 16.1f, 4.4f, 20.5f, 11.5f)
                lineToRelative(88.0f, 144.0f)
                curveToRelative(4.5f, 7.4f, 4.7f, 16.7f, 0.5f, 24.3f)
                reflectiveCurveTo(368.7f, 416.0f, 360.0f, 416.0f)
                lineTo(88.0f, 416.0f)
                curveToRelative(-8.9f, 0.0f, -17.2f, -5.0f, -21.3f, -12.9f)
                reflectiveCurveToRelative(-3.5f, -17.5f, 1.6f, -24.8f)
                lineToRelative(56.0f, -80.0f)
                curveToRelative(4.5f, -6.4f, 11.8f, -10.2f, 19.7f, -10.2f)
                reflectiveCurveToRelative(15.2f, 3.8f, 19.7f, 10.2f)
                lineToRelative(26.4f, 37.8f)
                lineToRelative(61.4f, -100.5f)
                curveToRelative(4.4f, -7.1f, 12.1f, -11.5f, 20.5f, -11.5f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
