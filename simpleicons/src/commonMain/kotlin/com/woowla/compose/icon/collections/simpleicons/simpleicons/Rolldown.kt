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

public val Simpleicons.Rolldown: ImageVector
    get() {
        if (_rolldown != null) {
            return _rolldown!!
        }
        _rolldown = Builder(name = "Rolldown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.652f, 0.0f)
                curveToRelative(0.514f, 0.0f, 0.796f, 0.6f, 0.466f, 0.998f)
                lineToRelative(-5.616f, 6.74f)
                curveToRelative(-0.662f, 0.793f, -0.098f, 1.997f, 0.934f, 1.997f)
                horizontalLineToRelative(5.433f)
                curveToRelative(0.516f, 0.0f, 0.797f, 0.6f, 0.467f, 0.998f)
                lineTo(12.467f, 23.775f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.468f, 0.225f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.468f, -0.225f)
                lineTo(0.661f, 10.733f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, true, 0.468f, -0.998f)
                horizontalLineTo(6.56f)
                curveToRelative(1.032f, 0.0f, 1.595f, -1.204f, 0.937f, -1.997f)
                lineTo(1.88f, 0.998f)
                arcTo(0.608f, 0.608f, 0.0f, false, true, 2.346f, 0.0f)
                close()
            }
        }
        .build()
        return _rolldown!!
    }

private var _rolldown: ImageVector? = null
