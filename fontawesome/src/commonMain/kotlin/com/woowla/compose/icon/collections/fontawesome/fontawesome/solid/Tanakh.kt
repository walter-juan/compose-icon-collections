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

public val SolidGroup.Tanakh: ImageVector
    get() {
        if (_tanakh != null) {
            return _tanakh!!
        }
        _tanakh = Builder(name = "Tanakh", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 512.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, -66.7f)
                curveTo(13.4f, 374.7f, 0.0f, 356.9f, 0.0f, 336.0f)
                lineTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                lineTo(352.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                close()
                moveTo(384.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(113.9f, 229.0f)
                curveToRelative(-1.2f, 2.0f, -1.9f, 4.2f, -1.9f, 6.6f)
                curveToRelative(0.0f, 6.9f, 5.6f, 12.5f, 12.5f, 12.5f)
                lineToRelative(56.9f, 0.0f)
                lineToRelative(30.5f, 49.2f)
                curveToRelative(2.6f, 4.2f, 7.2f, 6.8f, 12.2f, 6.8f)
                reflectiveCurveToRelative(9.6f, -2.6f, 12.2f, -6.8f)
                lineToRelative(30.5f, -49.2f)
                lineToRelative(56.9f, 0.0f)
                curveToRelative(6.9f, 0.0f, 12.5f, -5.6f, 12.5f, -12.5f)
                curveToRelative(0.0f, -2.3f, -0.6f, -4.6f, -1.9f, -6.6f)
                lineToRelative(-27.8f, -45.0f)
                lineToRelative(27.8f, -45.0f)
                curveToRelative(1.2f, -2.0f, 1.9f, -4.2f, 1.9f, -6.6f)
                curveToRelative(0.0f, -6.9f, -5.6f, -12.5f, -12.5f, -12.5f)
                lineToRelative(-56.9f, 0.0f)
                lineToRelative(-30.5f, -49.2f)
                curveTo(233.6f, 66.6f, 229.0f, 64.0f, 224.0f, 64.0f)
                reflectiveCurveToRelative(-9.6f, 2.6f, -12.2f, 6.8f)
                lineToRelative(-30.5f, 49.2f)
                lineToRelative(-56.9f, 0.0f)
                curveToRelative(-6.9f, 0.0f, -12.5f, 5.6f, -12.5f, 12.5f)
                curveToRelative(0.0f, 2.3f, 0.6f, 4.6f, 1.9f, 6.6f)
                lineToRelative(27.8f, 45.0f)
                lineToRelative(-27.8f, 45.0f)
                close()
            }
        }
        .build()
        return _tanakh!!
    }

private var _tanakh: ImageVector? = null
