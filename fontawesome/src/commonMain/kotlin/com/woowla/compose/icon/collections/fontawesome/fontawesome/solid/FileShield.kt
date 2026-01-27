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

public val SolidGroup.FileShield: ImageVector
    get() {
        if (_fileShield != null) {
            return _fileShield!!
        }
        _fileShield = Builder(name = "FileShield", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(60.7f, 0.0f, 32.0f, 28.7f, 32.0f, 64.0f)
                lineToRelative(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(201.2f, 0.0f)
                curveTo(261.0f, 469.4f, 240.0f, 414.5f, 240.0f, 356.4f)
                lineToRelative(0.0f, -31.1f)
                curveToRelative(0.0f, -34.4f, 22.0f, -65.0f, 54.7f, -75.9f)
                lineToRelative(112.0f, -37.3f)
                curveToRelative(3.1f, -1.0f, 6.2f, -1.8f, 9.3f, -2.5f)
                lineToRelative(0.0f, -39.1f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(290.7f, 18.7f)
                curveTo(278.7f, 6.7f, 262.5f, 0.0f, 245.5f, 0.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(357.5f, 176.0f)
                lineTo(264.0f, 176.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(240.0f, 58.5f)
                lineTo(357.5f, 176.0f)
                close()
                moveTo(445.3f, 488.5f)
                lineToRelative(-13.3f, 6.3f)
                lineToRelative(0.0f, -188.1f)
                lineToRelative(96.0f, 32.0f)
                lineToRelative(0.0f, 19.6f)
                curveToRelative(0.0f, 55.8f, -32.2f, 106.5f, -82.7f, 130.3f)
                close()
                moveTo(421.9f, 259.5f)
                lineToRelative(-112.0f, 37.3f)
                curveToRelative(-13.1f, 4.4f, -21.9f, 16.6f, -21.9f, 30.4f)
                lineToRelative(0.0f, 31.1f)
                curveToRelative(0.0f, 74.4f, 43.0f, 142.1f, 110.2f, 173.7f)
                lineToRelative(18.5f, 8.7f)
                curveToRelative(4.8f, 2.2f, 10.0f, 3.4f, 15.2f, 3.4f)
                reflectiveCurveToRelative(10.5f, -1.2f, 15.2f, -3.4f)
                lineToRelative(18.5f, -8.7f)
                curveTo(533.0f, 500.3f, 576.0f, 432.6f, 576.0f, 358.2f)
                lineToRelative(0.0f, -31.1f)
                curveToRelative(0.0f, -13.8f, -8.8f, -26.0f, -21.9f, -30.4f)
                lineToRelative(-112.0f, -37.3f)
                curveToRelative(-6.6f, -2.2f, -13.7f, -2.2f, -20.2f, 0.0f)
                close()
            }
        }
        .build()
        return _fileShield!!
    }

private var _fileShield: ImageVector? = null
