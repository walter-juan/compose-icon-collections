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

public val SolidGroup.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.1f, 64.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(277.6f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(429.3f, 125.3f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineToRelative(0.0f, 97.5f)
                lineToRelative(-132.0f, 132.0f)
                lineToRelative(-42.1f, 0.0f)
                lineToRelative(-16.1f, -53.6f)
                curveToRelative(-4.7f, -15.7f, -19.1f, -26.4f, -35.5f, -26.4f)
                curveToRelative(-11.3f, 0.0f, -21.9f, 5.1f, -28.9f, 13.9f)
                lineTo(133.3f, 409.0f)
                curveToRelative(-8.3f, 10.3f, -6.6f, 25.5f, 3.7f, 33.7f)
                reflectiveCurveToRelative(25.5f, 6.6f, 33.7f, -3.8f)
                lineToRelative(47.1f, -58.8f)
                lineToRelative(15.2f, 50.7f)
                curveToRelative(3.0f, 10.2f, 12.4f, 17.1f, 23.0f, 17.1f)
                lineToRelative(31.5f, 0.0f)
                curveToRelative(-0.9f, 3.1f, -1.7f, 6.3f, -2.3f, 9.5f)
                lineToRelative(-10.9f, 54.5f)
                lineToRelative(-146.2f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -384.0f)
                close()
                moveTo(272.1f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(93.5f, 0.0f)
                lineToRelative(-117.5f, -117.5f)
                close()
                moveTo(332.3f, 466.9f)
                curveToRelative(2.5f, -12.4f, 8.6f, -23.8f, 17.5f, -32.7f)
                lineToRelative(118.9f, -118.9f)
                lineToRelative(80.0f, 80.0f)
                lineToRelative(-118.9f, 118.9f)
                curveToRelative(-8.9f, 8.9f, -20.3f, 15.0f, -32.7f, 17.5f)
                lineToRelative(-59.6f, 11.9f)
                curveToRelative(-0.9f, 0.2f, -1.9f, 0.3f, -2.9f, 0.3f)
                curveToRelative(-8.0f, 0.0f, -14.6f, -6.5f, -14.6f, -14.6f)
                curveToRelative(0.0f, -1.0f, 0.1f, -1.9f, 0.3f, -2.9f)
                lineToRelative(11.9f, -59.6f)
                close()
                moveTo(600.1f, 343.9f)
                lineToRelative(-28.8f, 28.8f)
                lineToRelative(-80.0f, -80.0f)
                lineToRelative(28.8f, -28.8f)
                curveToRelative(22.1f, -22.1f, 57.9f, -22.1f, 80.0f, 0.0f)
                reflectiveCurveToRelative(22.1f, 57.9f, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
