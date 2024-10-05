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

public val FilledGroup.SquareRotated: ImageVector
    get() {
        if (_squareRotated != null) {
            return _squareRotated!!
        }
        _squareRotated = Builder(name = "SquareRotated", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.793f, 2.893f)
                lineToRelative(-6.9f, 6.9f)
                curveToRelative(-1.172f, 1.171f, -1.172f, 3.243f, 0.0f, 4.414f)
                lineToRelative(6.9f, 6.9f)
                curveToRelative(1.171f, 1.172f, 3.243f, 1.172f, 4.414f, 0.0f)
                lineToRelative(6.9f, -6.9f)
                curveToRelative(1.172f, -1.171f, 1.172f, -3.243f, 0.0f, -4.414f)
                lineToRelative(-6.9f, -6.9f)
                curveToRelative(-1.171f, -1.172f, -3.243f, -1.172f, -4.414f, 0.0f)
                close()
            }
        }
        .build()
        return _squareRotated!!
    }

private var _squareRotated: ImageVector? = null
