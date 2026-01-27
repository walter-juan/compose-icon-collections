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

public val SolidGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-320.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(96.0f, 96.0f)
                close()
                moveTo(24.0f, 128.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 296.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(360.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 152.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(192.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(388.5f, 171.5f)
                curveToRelative(-4.4f, -7.1f, -12.1f, -11.5f, -20.5f, -11.5f)
                reflectiveCurveToRelative(-16.1f, 4.4f, -20.5f, 11.5f)
                lineToRelative(-56.3f, 92.1f)
                lineToRelative(-24.5f, -30.6f)
                curveToRelative(-4.6f, -5.7f, -11.4f, -9.0f, -18.7f, -9.0f)
                reflectiveCurveToRelative(-14.2f, 3.3f, -18.7f, 9.0f)
                lineToRelative(-64.0f, 80.0f)
                curveToRelative(-5.8f, 7.2f, -6.9f, 17.1f, -2.9f, 25.4f)
                reflectiveCurveTo(174.8f, 352.0f, 184.0f, 352.0f)
                lineToRelative(272.0f, 0.0f)
                curveToRelative(8.7f, 0.0f, 16.7f, -4.7f, 20.9f, -12.3f)
                reflectiveCurveToRelative(4.1f, -16.8f, -0.5f, -24.3f)
                lineToRelative(-88.0f, -144.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
