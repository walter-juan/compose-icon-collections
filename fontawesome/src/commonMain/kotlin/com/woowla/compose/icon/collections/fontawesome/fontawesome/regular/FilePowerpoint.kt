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

public val RegularGroup.FilePowerpoint: ImageVector
    get() {
        if (_filePowerpoint != null) {
            return _filePowerpoint!!
        }
        _filePowerpoint = Builder(name = "FilePowerpoint", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(160.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -293.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(274.7f, 18.7f)
                curveTo(262.7f, 6.7f, 246.5f, 0.0f, 229.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(136.0f, 208.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                lineToRelative(0.0f, 56.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(44.0f, 0.0f)
                curveToRelative(42.0f, 0.0f, 76.0f, -34.0f, 76.0f, -76.0f)
                reflectiveCurveToRelative(-34.0f, -76.0f, -76.0f, -76.0f)
                lineToRelative(-68.0f, 0.0f)
                close()
                moveTo(204.0f, 312.0f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(44.0f, 0.0f)
                curveToRelative(15.5f, 0.0f, 28.0f, 12.5f, 28.0f, 28.0f)
                reflectiveCurveToRelative(-12.5f, 28.0f, -28.0f, 28.0f)
                close()
            }
        }
        .build()
        return _filePowerpoint!!
    }

private var _filePowerpoint: ImageVector? = null
