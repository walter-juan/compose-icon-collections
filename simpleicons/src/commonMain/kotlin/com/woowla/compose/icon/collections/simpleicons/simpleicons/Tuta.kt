package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Tuta: ImageVector
    get() {
        if (_tuta != null) {
            return _tuta!!
        }
        _tuta = Builder(name = "Tuta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.993f, 7.033f)
                lineToRelative(-5.16f, 16.755f)
                lineToRelative(-0.043f, 0.12f)
                arcToRelative(0.144f, 0.144f, 0.0f, false, true, -0.11f, 0.091f)
                horizontalLineTo(1.425f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, true, -0.13f, -0.191f)
                lineTo(6.441f, 6.98f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, true, 0.024f, -0.076f)
                arcToRelative(0.134f, 0.134f, 0.0f, false, true, 0.124f, -0.091f)
                horizontalLineTo(23.82f)
                curveToRelative(0.14f, 0.0f, 0.202f, 0.086f, 0.173f, 0.22f)
                close()
                moveTo(23.94f, 4.25f)
                lineTo(19.885f, 0.146f)
                curveToRelative(-0.178f, -0.173f, -0.192f, -0.144f, -0.384f, -0.144f)
                horizontalLineTo(2.007f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, -0.14f, 0.14f)
                curveToRelative(0.0f, 0.004f, -0.004f, 0.061f, 0.044f, 0.114f)
                lineToRelative(0.004f, 0.005f)
                lineTo(6.0f, 4.393f)
                curveToRelative(0.096f, 0.096f, 0.192f, 0.12f, 0.336f, 0.12f)
                horizontalLineToRelative(17.533f)
                curveToRelative(0.12f, 0.0f, 0.182f, -0.153f, 0.072f, -0.263f)
                close()
                moveTo(4.127f, 5.805f)
                lineTo(0.25f, 1.95f)
                curveToRelative(-0.048f, -0.043f, -0.105f, -0.038f, -0.11f, -0.038f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, -0.14f, 0.14f)
                verticalLineToRelative(16.975f)
                curveToRelative(0.0f, 0.077f, 0.063f, 0.14f, 0.14f, 0.14f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.13f, -0.092f)
                curveToRelative(0.004f, -0.005f, 0.004f, -0.014f, 0.009f, -0.024f)
                curveToRelative(0.0f, -0.004f, 0.01f, -0.038f, 0.01f, -0.043f)
                lineTo(4.199f, 6.164f)
                curveToRelative(0.048f, -0.144f, 0.048f, -0.24f, -0.072f, -0.36f)
                close()
            }
        }
        .build()
        return _tuta!!
    }

private var _tuta: ImageVector? = null
