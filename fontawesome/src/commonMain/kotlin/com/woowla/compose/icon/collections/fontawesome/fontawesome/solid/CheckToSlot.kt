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

public val SolidGroup.CheckToSlot: ImageVector
    get() {
        if (_checkToSlot != null) {
            return _checkToSlot!!
        }
        _checkToSlot = Builder(name = "CheckToSlot", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.0f, 288.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 312.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -104.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(416.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(96.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(256.0f, 0.0f)
                close()
                moveTo(378.9f, 116.6f)
                curveToRelative(-10.7f, -7.8f, -25.7f, -5.4f, -33.5f, 5.3f)
                lineToRelative(-85.6f, 117.7f)
                lineToRelative(-26.5f, -27.4f)
                curveToRelative(-9.2f, -9.5f, -24.4f, -9.8f, -33.9f, -0.6f)
                curveToRelative(-9.5f, 9.2f, -9.8f, 24.4f, -0.6f, 33.9f)
                lineToRelative(46.4f, 48.0f)
                curveToRelative(4.9f, 5.1f, 11.8f, 7.8f, 18.9f, 7.3f)
                reflectiveCurveToRelative(13.6f, -4.1f, 17.8f, -9.8f)
                lineTo(384.2f, 150.1f)
                curveToRelative(7.8f, -10.7f, 5.4f, -25.7f, -5.3f, -33.5f)
                close()
            }
        }
        .build()
        return _checkToSlot!!
    }

private var _checkToSlot: ImageVector? = null
