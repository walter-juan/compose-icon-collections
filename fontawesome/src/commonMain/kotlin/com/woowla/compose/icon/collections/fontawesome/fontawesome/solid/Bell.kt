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

public val SolidGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 3.2f)
                curveTo(119.0f, 50.0f, 64.0f, 114.6f, 64.0f, 192.0f)
                lineToRelative(0.0f, 21.7f)
                curveToRelative(0.0f, 48.1f, -16.4f, 94.8f, -46.4f, 132.4f)
                lineTo(7.8f, 358.3f)
                curveTo(2.7f, 364.6f, 0.0f, 372.4f, 0.0f, 380.5f)
                curveTo(0.0f, 400.1f, 15.9f, 416.0f, 35.5f, 416.0f)
                lineToRelative(376.9f, 0.0f)
                curveToRelative(19.6f, 0.0f, 35.5f, -15.9f, 35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, -2.7f, -15.9f, -7.8f, -22.2f)
                lineToRelative(-9.8f, -12.2f)
                curveTo(400.4f, 308.5f, 384.0f, 261.8f, 384.0f, 213.7f)
                lineToRelative(0.0f, -21.7f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                lineToRelative(0.0f, -3.2f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(162.0f, 464.0f)
                curveToRelative(7.1f, 27.6f, 32.2f, 48.0f, 62.0f, 48.0f)
                reflectiveCurveToRelative(54.9f, -20.4f, 62.0f, -48.0f)
                lineToRelative(-124.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
