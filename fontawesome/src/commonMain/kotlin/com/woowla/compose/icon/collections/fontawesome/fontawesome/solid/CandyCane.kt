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

public val SolidGroup.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.8f, 39.6f)
                curveTo(452.0f, 85.2f, 456.5f, 142.9f, 435.1f, 192.0f)
                lineToRelative(-165.4f, 0.0f)
                lineToRelative(41.4f, -41.4f)
                curveToRelative(0.8f, -0.8f, 1.5f, -1.6f, 2.2f, -2.4f)
                lineTo(421.8f, 39.6f)
                close()
                moveTo(268.0f, 102.9f)
                curveToRelative(-0.8f, 0.7f, -1.6f, 1.4f, -2.4f, 2.2f)
                lineToRelative(-28.1f, 28.1f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                reflectiveCurveToRelative(-25.0f, -65.5f, 0.0f, -90.5f)
                lineTo(175.0f, 14.6f)
                curveTo(229.9f, -40.2f, 314.5f, -46.7f, 376.5f, -5.6f)
                lineTo(268.0f, 102.9f)
                close()
                moveTo(125.7f, 336.0f)
                lineToRelative(80.0f, -80.0f)
                lineToRelative(181.0f, 0.0f)
                lineToRelative(-82.5f, 82.5f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(-178.5f, 0.0f)
                close()
                moveTo(242.7f, 400.0f)
                lineTo(141.4f, 501.3f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                reflectiveCurveToRelative(-25.0f, -65.5f, 0.0f, -90.5f)
                lineToRelative(10.7f, -10.7f)
                lineToRelative(181.0f, 0.0f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
