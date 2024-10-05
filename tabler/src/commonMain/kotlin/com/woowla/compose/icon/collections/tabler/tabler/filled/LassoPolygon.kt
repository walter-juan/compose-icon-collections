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

public val FilledGroup.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) {
            return _lassoPolygon!!
        }
        _lassoPolygon = Builder(name = "LassoPolygon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.581f, 2.186f)
                lineToRelative(6.566f, 4.69f)
                lineToRelative(7.502f, -2.812f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.326f, 0.714f)
                lineToRelative(0.019f, 0.112f)
                lineToRelative(1.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.678f, 1.059f)
                lineToRelative(-9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.553f, 0.023f)
                lineToRelative(-4.434f, -1.082f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.287f, 0.923f)
                curveToRelative(0.095f, 0.986f, 0.374f, 1.9f, 0.826f, 2.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.736f, 0.993f)
                curveToRelative(-0.624f, -1.09f, -0.99f, -2.335f, -1.098f, -3.656f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.034f, -2.84f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.86f, -1.932f)
                lineToRelative(-0.818f, -2.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.009f, -0.577f)
                lineToRelative(2.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.543f, -0.539f)
                moveToRelative(-0.009f, 2.451f)
                lineToRelative(-1.528f, 5.348f)
                lineToRelative(0.642f, 2.031f)
                quadToRelative(0.155f, -0.016f, 0.314f, -0.016f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 2.995f)
                lineToRelative(3.957f, 0.965f)
                lineToRelative(7.96f, -2.654f)
                lineToRelative(-0.769f, -6.919f)
                lineToRelative(-6.797f, 2.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.827f, -0.058f)
                lineToRelative(-0.105f, -0.065f)
                close()
            }
        }
        .build()
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
