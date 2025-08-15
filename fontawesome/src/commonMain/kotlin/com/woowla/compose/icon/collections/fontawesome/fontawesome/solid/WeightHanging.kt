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

public val SolidGroup.WeightHanging: ImageVector
    get() {
        if (_weightHanging != null) {
            return _weightHanging!!
        }
        _weightHanging = Builder(name = "WeightHanging", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(346.5f, 128.0f)
                curveToRelative(3.5f, -10.0f, 5.5f, -20.8f, 5.5f, -32.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 11.2f, 1.9f, 22.0f, 5.5f, 32.0f)
                lineToRelative(-21.8f, 0.0f)
                curveToRelative(-28.3f, 0.0f, -53.2f, 18.5f, -61.3f, 45.6f)
                lineTo(2.4f, 440.2f)
                curveTo(0.8f, 445.4f, 0.0f, 450.8f, 0.0f, 456.2f)
                curveTo(0.0f, 487.0f, 25.0f, 512.0f, 55.8f, 512.0f)
                lineToRelative(400.4f, 0.0f)
                curveToRelative(30.8f, 0.0f, 55.8f, -25.0f, 55.8f, -55.8f)
                curveToRelative(0.0f, -5.4f, -0.8f, -10.8f, -2.4f, -16.0f)
                lineToRelative(-80.0f, -266.5f)
                curveToRelative(-8.1f, -27.1f, -33.0f, -45.6f, -61.3f, -45.6f)
                lineToRelative(-21.8f, 0.0f)
                close()
            }
        }
        .build()
        return _weightHanging!!
    }

private var _weightHanging: ImageVector? = null
