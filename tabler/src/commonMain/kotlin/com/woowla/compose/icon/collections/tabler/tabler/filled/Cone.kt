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

public val FilledGroup.Cone: ImageVector
    get() {
        if (_cone != null) {
            return _cone!!
        }
        _cone = Builder(name = "Cone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.001f)
                curveToRelative(0.72f, 0.0f, 1.385f, 0.387f, 1.749f, 1.03f)
                lineToRelative(8.13f, 14.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.121f, 0.477f)
                verticalLineToRelative(0.498f)
                curveToRelative(0.0f, 2.46f, -4.306f, 3.945f, -9.677f, 4.002f)
                lineToRelative(-0.323f, 0.002f)
                curveToRelative(-5.52f, 0.0f, -10.0f, -1.495f, -10.0f, -4.003f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.121f, -0.477f)
                lineToRelative(8.139f, -15.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.74f, -1.015f)
            }
        }
        .build()
        return _cone!!
    }

private var _cone: ImageVector? = null
