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

public val SolidGroup.Landmark: ImageVector
    get() {
        if (_landmark != null) {
            return _landmark!!
        }
        _landmark = Builder(name = "Landmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.7f, 5.1f)
                curveToRelative(10.5f, -6.8f, 24.1f, -6.8f, 34.6f, 0.0f)
                lineToRelative(224.0f, 144.0f)
                curveToRelative(11.9f, 7.7f, 17.4f, 22.3f, 13.4f, 35.9f)
                reflectiveCurveToRelative(-16.5f, 23.0f, -30.7f, 23.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(51.2f, 38.4f)
                curveToRelative(8.1f, 6.0f, 12.8f, 15.5f, 12.8f, 25.6f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -10.1f, 4.7f, -19.6f, 12.8f, -25.6f)
                lineToRelative(51.2f, -38.4f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-14.2f, 0.0f, -26.7f, -9.4f, -30.7f, -23.0f)
                reflectiveCurveToRelative(1.5f, -28.3f, 13.4f, -35.9f)
                lineToRelative(224.0f, -144.0f)
                close()
                moveTo(336.0f, 208.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(224.0f, 416.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                close()
                moveTo(112.0f, 208.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _landmark!!
    }

private var _landmark: ImageVector? = null
