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

public val Simpleicons.Astra: ImageVector
    get() {
        if (_astra != null) {
            return _astra!!
        }
        _astra = Builder(name = "Astra", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(-0.145f, 5.323f)
                lineToRelative(1.452f, 2.903f)
                curveToRelative(-1.645f, 3.319f, -3.29f, 6.648f, -4.936f, 9.968f)
                horizontalLineTo(5.758f)
                curveToRelative(2.032f, -4.287f, 4.065f, -8.584f, 6.097f, -12.871f)
                moveToRelative(2.71f, 5.323f)
                curveToRelative(1.229f, 2.516f, 2.448f, 5.032f, 3.677f, 7.548f)
                horizontalLineToRelative(-2.806f)
                curveToRelative(-0.319f, -0.745f, -0.648f, -1.481f, -0.968f, -2.226f)
                horizontalLineTo(12.0f)
                lineToRelative(0.048f, -0.097f)
                curveToRelative(0.842f, -1.742f, 1.674f, -3.484f, 2.516f, -5.226f)
            }
        }
        .build()
        return _astra!!
    }

private var _astra: ImageVector? = null
