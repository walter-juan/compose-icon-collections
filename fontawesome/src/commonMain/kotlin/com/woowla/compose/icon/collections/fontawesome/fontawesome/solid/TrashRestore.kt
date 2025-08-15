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

public val SolidGroup.TrashRestore: ImageVector
    get() {
        if (_trashRestore != null) {
            return _trashRestore!!
        }
        _trashRestore = Builder(name = "TrashRestore", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.1f, -16.0f)
                lineToRelative(113.9f, 0.0f)
                curveToRelative(13.8f, 0.0f, 26.0f, 8.8f, 30.4f, 21.9f)
                lineTo(320.0f, 32.0f)
                lineTo(416.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(8.7f, -26.1f)
                curveTo(141.1f, -7.2f, 153.3f, -16.0f, 167.1f, -16.0f)
                close()
                moveTo(32.0f, 144.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(-21.1f, 323.1f)
                curveTo(393.3f, 492.4f, 372.3f, 512.0f, 347.0f, 512.0f)
                lineTo(101.0f, 512.0f)
                curveToRelative(-25.3f, 0.0f, -46.3f, -19.6f, -47.9f, -44.9f)
                lineTo(32.0f, 144.0f)
                close()
                moveTo(241.0f, 223.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(0.0f, 102.1f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -102.1f)
                lineToRelative(31.0f, 31.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-72.0f, -72.0f)
                close()
            }
        }
        .build()
        return _trashRestore!!
    }

private var _trashRestore: ImageVector? = null
