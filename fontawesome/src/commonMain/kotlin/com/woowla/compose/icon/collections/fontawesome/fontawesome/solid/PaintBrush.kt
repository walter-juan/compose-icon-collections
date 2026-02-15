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

public val SolidGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.5f, 10.3f)
                lineTo(259.1f, 158.0f)
                curveToRelative(-29.1f, 19.4f, -47.6f, 50.9f, -50.6f, 85.3f)
                curveToRelative(62.3f, 12.8f, 111.4f, 61.9f, 124.3f, 124.3f)
                curveToRelative(34.5f, -3.0f, 65.9f, -21.5f, 85.3f, -50.6f)
                lineTo(565.7f, 95.5f)
                curveToRelative(6.7f, -10.1f, 10.3f, -21.9f, 10.3f, -34.1f)
                curveToRelative(0.0f, -33.9f, -27.5f, -61.4f, -61.4f, -61.4f)
                curveToRelative(-12.1f, 0.0f, -24.0f, 3.6f, -34.1f, 10.3f)
                close()
                moveTo(288.0f, 400.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                reflectiveCurveTo(64.0f, 338.1f, 64.0f, 400.0f)
                curveToRelative(0.0f, 3.9f, 0.2f, 7.8f, 0.6f, 11.6f)
                curveToRelative(1.8f, 17.5f, -10.2f, 36.4f, -27.8f, 36.4f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
