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

public val SolidGroup.OilCan: ImageVector
    get() {
        if (_oilCan != null) {
            return _oilCan!!
        }
        _oilCan = Builder(name = "OilCan", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 64.8f)
                curveToRelative(0.0f, 19.0f, 11.2f, 36.2f, 28.5f, 43.9f)
                lineToRelative(67.5f, 30.0f)
                lineTo(96.0f, 368.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(259.1f, 0.0f)
                curveToRelative(18.4f, 0.0f, 35.8f, -7.9f, 48.0f, -21.7f)
                lineTo(633.5f, 187.7f)
                curveToRelative(12.3f, -13.9f, -0.3f, -35.4f, -18.4f, -31.5f)
                lineTo(448.0f, 192.0f)
                lineToRelative(-50.5f, -25.2f)
                curveToRelative(-8.9f, -4.4f, -18.7f, -6.8f, -28.6f, -6.8f)
                lineTo(288.0f, 160.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(96.0f, 208.0f)
                lineToRelative(0.0f, 86.1f)
                lineTo(48.0f, 272.8f)
                lineTo(48.0f, 208.0f)
                lineToRelative(48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
