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

public val Simpleicons.Tablecheck: ImageVector
    get() {
        if (_tablecheck != null) {
            return _tablecheck!!
        }
        _tablecheck = Builder(name = "Tablecheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.914f, 3.828f)
                lineTo(7.248f, 0.164f)
                curveTo(7.125f, 0.041f, 6.878f, -0.001f, 6.713f, 0.041f)
                curveTo(3.753f, 1.36f, 1.379f, 3.718f, 0.041f, 6.669f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, false, 0.124f, 0.535f)
                lineTo(3.829f, 10.868f)
                curveToRelative(0.124f, 0.124f, 0.371f, 0.082f, 0.412f, -0.123f)
                arcToRelative(7.909f, 7.909f, 0.0f, false, true, 2.216f, -4.33f)
                arcToRelative(7.915f, 7.915f, 0.0f, false, true, 4.332f, -2.215f)
                curveToRelative(0.165f, 0.0f, 0.247f, -0.247f, 0.124f, -0.371f)
                close()
                moveTo(20.18f, 10.908f)
                lineTo(23.846f, 7.244f)
                curveToRelative(0.123f, -0.123f, 0.165f, -0.37f, 0.123f, -0.535f)
                curveToRelative(-1.32f, -2.958f, -3.679f, -5.331f, -6.63f, -6.668f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.288f, -0.03f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, false, -0.247f, 0.153f)
                lineTo(13.138f, 3.828f)
                curveToRelative(-0.124f, 0.123f, -0.082f, 0.371f, 0.123f, 0.412f)
                arcToRelative(7.915f, 7.915f, 0.0f, false, true, 4.332f, 2.215f)
                arcToRelative(7.909f, 7.909f, 0.0f, false, true, 2.216f, 4.33f)
                curveToRelative(0.0f, 0.164f, 0.248f, 0.247f, 0.371f, 0.123f)
                close()
                moveTo(23.846f, 16.795f)
                lineTo(20.18f, 13.09f)
                curveToRelative(-0.123f, -0.123f, -0.37f, -0.082f, -0.412f, 0.124f)
                curveToRelative(-0.535f, 3.336f, -3.171f, 6.01f, -6.549f, 6.546f)
                curveToRelative(-0.205f, 0.041f, -0.288f, 0.288f, -0.123f, 0.412f)
                lineToRelative(3.666f, 3.663f)
                curveToRelative(0.123f, 0.124f, 0.37f, 0.165f, 0.535f, 0.124f)
                curveToRelative(2.949f, -1.321f, 5.308f, -3.68f, 6.63f, -6.628f)
                curveToRelative(0.124f, -0.206f, 0.083f, -0.412f, -0.082f, -0.536f)
                close()
                moveTo(3.831f, 13.09f)
                lineTo(0.164f, 16.795f)
                curveToRelative(-0.124f, 0.124f, -0.165f, 0.371f, -0.124f, 0.536f)
                curveToRelative(1.322f, 2.947f, 3.682f, 5.306f, 6.63f, 6.628f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, false, 0.289f, 0.03f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, false, 0.247f, -0.154f)
                lineToRelative(3.666f, -3.663f)
                curveToRelative(0.123f, -0.124f, 0.082f, -0.371f, -0.124f, -0.412f)
                curveToRelative(-1.641f, -0.265f, -3.157f, -1.04f, -4.332f, -2.215f)
                arcToRelative(7.909f, 7.909f, 0.0f, false, true, -2.216f, -4.33f)
                curveToRelative(0.0f, -0.165f, -0.247f, -0.247f, -0.371f, -0.124f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _tablecheck!!
    }

private var _tablecheck: ImageVector? = null
