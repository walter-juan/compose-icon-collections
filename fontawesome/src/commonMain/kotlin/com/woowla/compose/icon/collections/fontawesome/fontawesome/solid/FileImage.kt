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

public val SolidGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(213.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(365.3f, 125.3f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(208.0f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(325.5f, 176.0f)
                lineTo(208.0f, 58.5f)
                close()
                moveTo(128.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(92.6f, 448.0f)
                lineToRelative(198.8f, 0.0f)
                curveToRelative(15.8f, 0.0f, 28.6f, -12.8f, 28.6f, -28.6f)
                curveToRelative(0.0f, -7.3f, -2.8f, -14.4f, -7.9f, -19.7f)
                lineTo(215.3f, 297.9f)
                curveToRelative(-6.0f, -6.3f, -14.4f, -9.9f, -23.2f, -9.9f)
                lineToRelative(-0.3f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -17.1f, 3.6f, -23.2f, 9.9f)
                lineTo(71.9f, 399.7f)
                curveTo(66.8f, 405.0f, 64.0f, 412.1f, 64.0f, 419.4f)
                curveTo(64.0f, 435.2f, 76.8f, 448.0f, 92.6f, 448.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
