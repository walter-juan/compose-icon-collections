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

public val Simpleicons.Simplex: ImageVector
    get() {
        if (_simplex != null) {
            return _simplex!!
        }
        _simplex = Builder(name = "Simplex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.1f, 0.0f)
                lineToRelative(-4.026f, 4.025f)
                lineTo(8.125f, 0.076f)
                lineTo(6.113f, 2.09f)
                lineToRelative(3.95f, 3.947f)
                lineToRelative(-3.975f, 3.977f)
                lineTo(2.14f, 6.066f)
                lineTo(0.109f, 8.096f)
                lineToRelative(3.948f, 3.947f)
                lineTo(0.0f, 16.1f)
                lineToRelative(1.975f, 1.972f)
                lineToRelative(4.056f, -4.056f)
                lineToRelative(3.95f, 3.947f)
                lineToRelative(2.029f, -2.027f)
                lineToRelative(-3.95f, -3.95f)
                lineToRelative(3.975f, -3.972f)
                lineToRelative(3.951f, 3.949f)
                lineToRelative(-4.025f, 4.023f)
                verticalLineToRelative(0.002f)
                lineTo(9.947f, 18.0f)
                lineToRelative(-4.023f, 4.025f)
                lineTo(7.896f, 24.0f)
                lineToRelative(4.026f, -4.025f)
                lineToRelative(3.95f, 3.949f)
                lineToRelative(2.013f, -2.014f)
                lineToRelative(-3.951f, -3.95f)
                lineToRelative(4.027f, -4.024f)
                lineToRelative(3.95f, 3.949f)
                lineToRelative(2.013f, -2.012f)
                lineToRelative(-3.95f, -3.95f)
                lineTo(24.0f, 7.899f)
                lineToRelative(-1.975f, -1.972f)
                lineTo(18.0f, 9.949f)
                lineTo(14.049f, 6.0f)
                lineToRelative(4.025f, -4.025f)
                close()
            }
        }
        .build()
        return _simplex!!
    }

private var _simplex: ImageVector? = null
