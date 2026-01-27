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

public val SolidGroup.MarsStroke: ImageVector
    get() {
        if (_marsStroke != null) {
            return _marsStroke!!
        }
        _marsStroke = Builder(name = "MarsStroke", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, -32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(50.7f, 0.0f)
                lineToRelative(-58.7f, 58.7f)
                lineToRelative(-17.4f, -17.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(17.4f, 17.4f)
                lineToRelative(-23.0f, 23.0f)
                curveToRelative(-28.4f, -19.5f, -62.7f, -31.0f, -99.8f, -31.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, 78.8f, -176.0f, 176.0f)
                reflectiveCurveToRelative(78.8f, 176.0f, 176.0f, 176.0f)
                reflectiveCurveToRelative(176.0f, -78.8f, 176.0f, -176.0f)
                curveToRelative(0.0f, -37.0f, -11.4f, -71.4f, -31.0f, -99.8f)
                lineToRelative(23.0f, -23.0f)
                lineToRelative(17.4f, 17.4f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(453.3f, 136.0f)
                lineTo(512.0f, 77.3f)
                lineTo(512.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(576.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(416.0f, -32.0f)
                close()
                moveTo(128.0f, 304.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, -224.0f, 0.0f)
                close()
            }
        }
        .build()
        return _marsStroke!!
    }

private var _marsStroke: ImageVector? = null
