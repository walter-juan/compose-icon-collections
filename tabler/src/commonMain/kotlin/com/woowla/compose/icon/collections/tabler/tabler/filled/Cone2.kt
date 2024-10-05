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

public val FilledGroup.Cone2: ImageVector
    get() {
        if (_cone2 != null) {
            return _cone2!!
        }
        _cone2 = Builder(name = "Cone2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 1.494f, 10.0f, 4.002f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.121f, 0.477f)
                lineToRelative(-8.139f, 15.006f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.489f, -0.016f)
                lineToRelative(-8.13f, -14.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.121f, -0.475f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.509f, 4.48f, -4.004f, 10.0f, -4.004f)
            }
        }
        .build()
        return _cone2!!
    }

private var _cone2: ImageVector? = null
