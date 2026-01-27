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

public val SolidGroup.FilePrescription: ImageVector
    get() {
        if (_filePrescription != null) {
            return _filePrescription!!
        }
        _filePrescription = Builder(name = "FilePrescription", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
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
                moveTo(88.0f, 192.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(22.5f, 0.0f)
                lineToRelative(58.4f, 55.0f)
                lineToRelative(-33.4f, 31.6f)
                curveToRelative(-9.6f, 9.1f, -10.1f, 24.3f, -0.9f, 33.9f)
                reflectiveCurveToRelative(24.3f, 10.1f, 33.9f, 0.9f)
                lineToRelative(35.4f, -33.5f)
                lineToRelative(35.6f, 33.5f)
                curveToRelative(9.7f, 9.1f, 24.8f, 8.6f, 33.9f, -1.0f)
                reflectiveCurveToRelative(8.6f, -24.8f, -1.0f, -33.9f)
                lineToRelative(-33.6f, -31.6f)
                lineToRelative(33.6f, -31.8f)
                curveToRelative(9.6f, -9.1f, 10.1f, -24.3f, 0.9f, -33.9f)
                reflectiveCurveToRelative(-24.3f, -10.1f, -33.9f, -0.9f)
                lineToRelative(-35.7f, 33.7f)
                lineToRelative(-40.9f, -38.5f)
                curveToRelative(12.9f, -11.7f, 21.1f, -28.6f, 21.1f, -47.5f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-56.0f, 0.0f)
                close()
                moveTo(120.0f, 272.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _filePrescription!!
    }

private var _filePrescription: ImageVector? = null
