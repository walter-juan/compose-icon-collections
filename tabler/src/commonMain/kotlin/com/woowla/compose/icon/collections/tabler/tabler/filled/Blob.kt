package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Blob: ImageVector
    get() {
        if (_blob != null) {
            return _blob!!
        }
        _blob = Builder(name = "Blob", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(2.779f, 0.0f, 5.349f, 1.556f, 7.243f, 4.082f)
                curveToRelative(1.728f, 2.306f, 2.757f, 5.259f, 2.757f, 8.016f)
                curveToRelative(0.0f, 1.47f, -0.293f, 2.718f, -0.903f, 3.745f)
                curveToRelative(-0.603f, 1.014f, -1.479f, 1.758f, -2.582f, 2.257f)
                curveToRelative(-1.593f, 0.718f, -3.335f, 0.9f, -6.515f, 0.9f)
                curveToRelative(-3.175f, 0.0f, -4.92f, -0.183f, -6.514f, -0.9f)
                curveToRelative(-1.012f, -0.457f, -1.833f, -1.12f, -2.426f, -2.01f)
                lineToRelative(-0.157f, -0.247f)
                curveToRelative(-0.61f, -1.028f, -0.903f, -2.274f, -0.903f, -3.745f)
                curveToRelative(0.0f, -2.757f, 1.03f, -5.71f, 2.757f, -8.016f)
                curveToRelative(1.893f, -2.526f, 4.463f, -4.082f, 7.243f, -4.082f)
            }
        }
        .build()
        return _blob!!
    }

private var _blob: ImageVector? = null
