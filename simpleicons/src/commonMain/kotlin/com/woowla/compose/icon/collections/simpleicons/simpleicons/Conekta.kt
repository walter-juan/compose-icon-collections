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

public val Simpleicons.Conekta: ImageVector
    get() {
        if (_conekta != null) {
            return _conekta!!
        }
        _conekta = Builder(name = "Conekta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.291f, 17.883f)
                arcToRelative(11.733f, 11.733f, 0.0f, false, true, -6.174f, 3.034f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, -2.165f, -0.746f)
                curveToRelative(-4.247f, -4.626f, -4.247f, -11.732f, 0.0f, -16.358f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, 2.173f, -0.746f)
                arcToRelative(11.668f, 11.668f, 0.0f, false, true, 6.289f, 3.14f)
                arcToRelative(27.166f, 27.166f, 0.0f, false, false, -0.697f, 6.1f)
                arcToRelative(27.776f, 27.776f, 0.0f, false, false, 0.574f, 5.576f)
                close()
                moveTo(22.188f, 13.946f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, -1.524f, 0.527f)
                arcToRelative(24.68f, 24.68f, 0.0f, false, true, -11.914f, 8.938f)
                arcToRelative(35.442f, 35.442f, 0.0f, false, false, 6.428f, 0.59f)
                arcToRelative(36.286f, 36.286f, 0.0f, false, false, 4.46f, -0.279f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 3.034f, -2.698f)
                curveToRelative(0.469f, -1.884f, 0.645f, -3.884f, 0.517f, -5.813f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, -1.001f, -1.265f)
                close()
                moveTo(20.663f, 9.61f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, 2.526f, -0.746f)
                curveToRelative(0.135f, -1.97f, -0.044f, -3.969f, -0.517f, -5.887f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 19.638f, 0.279f)
                arcTo(36.268f, 36.268f, 0.0f, false, false, 15.178f, 0.0f)
                arcToRelative(35.434f, 35.434f, 0.0f, false, false, -6.428f, 0.59f)
                arcToRelative(24.64f, 24.64f, 0.0f, false, true, 11.914f, 9.019f)
                close()
            }
        }
        .build()
        return _conekta!!
    }

private var _conekta: ImageVector? = null
