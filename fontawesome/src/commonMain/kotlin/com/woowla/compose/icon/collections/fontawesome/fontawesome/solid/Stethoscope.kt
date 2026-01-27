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

public val SolidGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 48.0f)
                curveTo(32.0f, 21.5f, 53.5f, 0.0f, 80.0f, 0.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(238.3f, 0.0f, 256.0f, 0.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 77.4f, -55.0f, 142.0f, -128.0f, 156.8f)
                lineToRelative(0.0f, 19.2f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                lineToRelative(0.0f, -85.5f)
                curveToRelative(-37.3f, -13.2f, -64.0f, -48.7f, -64.0f, -90.5f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 41.8f, -26.7f, 77.4f, -64.0f, 90.5f)
                lineToRelative(0.0f, 85.5f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveTo(160.0f, 465.2f, 160.0f, 368.0f)
                lineToRelative(0.0f, -19.2f)
                curveTo(87.0f, 334.0f, 32.0f, 269.4f, 32.0f, 192.0f)
                lineTo(32.0f, 48.0f)
                close()
                moveTo(480.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
